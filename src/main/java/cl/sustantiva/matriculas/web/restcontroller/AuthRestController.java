package cl.sustantiva.matriculas.web.restcontroller;

import cl.sustantiva.matriculas.model.domain.dto.AuthenticationRequest;
import cl.sustantiva.matriculas.model.domain.dto.AuthenticationResponse;
import cl.sustantiva.matriculas.model.domain.service.UserService;
import cl.sustantiva.matriculas.web.security.JWTUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthRestController {

    private final UserService service;
    private final AuthenticationManager manager;
    private final JWTUtil util;

    public AuthRestController(UserService service, AuthenticationManager manager, JWTUtil util) {
        this.service = service;
        this.manager = manager;
        this.util = util;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request){
        try {
            manager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = service.loadUserByUsername(request.getUsername());
            String jwt = util.generateToken(userDetails);
            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
        } catch (BadCredentialsException e){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }
}

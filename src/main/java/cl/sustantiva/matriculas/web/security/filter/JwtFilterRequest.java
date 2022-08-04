package cl.sustantiva.matriculas.web.security.filter;

import cl.sustantiva.matriculas.model.domain.service.UserService;
import cl.sustantiva.matriculas.web.security.JWTUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilterRequest extends OncePerRequestFilter {

    private final JWTUtil util;
    private final UserService service;

    public JwtFilterRequest(JWTUtil util, UserService service) {
        this.util = util;
        this.service = service;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

    }
}

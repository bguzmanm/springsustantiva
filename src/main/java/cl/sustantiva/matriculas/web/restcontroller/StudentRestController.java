package cl.sustantiva.matriculas.web.restcontroller;


import cl.sustantiva.matriculas.model.domain.dto.Student;
import cl.sustantiva.matriculas.model.domain.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {

    private final StudentService service;

    public StudentRestController(StudentService service) {
        this.service = service;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Student>> findAll(){
        return service.findAll()
                .map(students -> new ResponseEntity<>(students, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{studentId}")
    public ResponseEntity<Student> findById(@PathVariable("studentId") int studentId){
        return service.findById(studentId)
                .map(student -> new ResponseEntity<>(student, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        return new ResponseEntity<>(service.save(student), HttpStatus.OK);
    }
    @DeleteMapping("/del/{studentId}")
    public ResponseEntity delete(@PathVariable("studentId") int studentId){
        if (service.delete(studentId)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

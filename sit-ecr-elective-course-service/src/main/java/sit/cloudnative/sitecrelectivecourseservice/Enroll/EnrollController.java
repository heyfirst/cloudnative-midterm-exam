package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class EnrollController {
    @Autowired
    private EnrollService EnrollService;

    @PostMapping("/enroll/")
    public ResponseEntity<Enroll> post(@RequestBody Enroll newEnroll) {
        Enroll enroll = EnrollService.createEnroll(newEnroll);
        return new ResponseEntity<>(enroll, HttpStatus.OK);
    }

    @GetMapping("/enroll/{id}")
    public ResponseEntity<Enroll> findByID(@PathVariable Integer id) {
        Enroll enroll = EnrollService.findEnrollByID(id);
        return new ResponseEntity<>(enroll, HttpStatus.OK);
    }

    @GetMapping("/enrolls")
    public ResponseEntity<List> findAll() {
        List enrolls = EnrollService.findAllEnroll();
        return new ResponseEntity<>(enrolls, HttpStatus.OK);
    }

    @PutMapping("/enroll/{id}")
    public ResponseEntity<?> put(@PathVariable Integer id, @RequestBody Object input) {
        return null;
    }
}

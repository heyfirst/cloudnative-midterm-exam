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
    private EnrollService enrollService;

    @PostMapping("/enroll/")
    public ResponseEntity<Enroll> post(@RequestBody Enroll newEnroll) {

        Integer userId = newEnroll.getUserId();

        if (!enrollService.isUserCanEnroll(userId)) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        if (enrollService.isOverEnrollLimitByUserId(userId)) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        Enroll enroll = enrollService.createEnroll(newEnroll);
        return new ResponseEntity<>(enroll, HttpStatus.CREATED);

    }

    @GetMapping("/enroll/{id}")
    public ResponseEntity<Enroll> findByID(@PathVariable Integer id) {
        Enroll enroll = enrollService.findEnrollByID(id);
        return new ResponseEntity<>(enroll, HttpStatus.OK);
    }

    @GetMapping("/enrolls/user-id/{id}")
    public ResponseEntity<List> findByUserID(@PathVariable Integer id) {
        List enrolls = enrollService.findEnrollsByUserId(id);
        return new ResponseEntity<>(enrolls, HttpStatus.OK);
    }

    @GetMapping("/enrolls")
    public ResponseEntity<List> findAll() {
        List enrolls = enrollService.findAllEnroll();
        return new ResponseEntity<>(enrolls, HttpStatus.OK);
    }

    @PutMapping("/enroll/{id}")
    public ResponseEntity<?> put(@PathVariable Integer id, @RequestBody Object input) {
        return null;
    }
}

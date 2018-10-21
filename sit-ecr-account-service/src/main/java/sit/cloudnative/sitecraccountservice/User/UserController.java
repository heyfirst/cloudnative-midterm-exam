package sit.cloudnative.sitecraccountservice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/")
    public ResponseEntity<User> post(@RequestBody User newEnroll) {
        User user = userService.createUser(newEnroll);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> findByID(@PathVariable Long id) {
        User user = userService.findUserByID(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user/student-id/{id}")
    public ResponseEntity<User> findByStudentID(@PathVariable String id) {
        User user = userService.findUserByStudentID(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List> findAll() {
        List users = userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> put(@PathVariable Long id, @RequestBody Object input) {
        return null;
    }
}

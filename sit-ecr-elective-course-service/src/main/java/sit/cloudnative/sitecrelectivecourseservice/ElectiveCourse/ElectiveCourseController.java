package sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ElectiveCourseController {
    @Autowired
    private ElectiveCourseService electiveCourseService;

    @GetMapping("/")
    public String index(){
        return "Elective Course Service is online.";
    }

    @PostMapping("/elective-course/")
    public ResponseEntity<ElectiveCourse> post(@RequestBody ElectiveCourse newElectiveCourse) {
        ElectiveCourse ElectiveCourse = electiveCourseService.createElectiveCourse(newElectiveCourse);
        return new ResponseEntity<>(ElectiveCourse, HttpStatus.OK);
    }

    @GetMapping("/elective-course/{id}")
    public ResponseEntity<ElectiveCourse> findByID(@PathVariable Integer id) {
        ElectiveCourse ElectiveCourses = electiveCourseService.findElectiveCourseByID(id);
        return new ResponseEntity<>(ElectiveCourses, HttpStatus.OK);
    }

    @GetMapping("/elective-courses")
    public ResponseEntity<List> findAll() {
        List ElectiveCourses = electiveCourseService.findAllElectiveCourse();
        return new ResponseEntity<>(ElectiveCourses, HttpStatus.OK);
    }

    @PutMapping("/elective-course/{id}")
    public ResponseEntity<?> put(@PathVariable Integer id, @RequestBody Object input) {
        return null;
    }
}

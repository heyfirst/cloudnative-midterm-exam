package sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.cloudnative.sitecrelectivecourseservice.Enroll.EnrollService;

import java.util.List;

@Service
public class ElectiveCourseService {

    @Autowired
    private ElectiveCourseRepository electiveCourseRepository;

    @Autowired
    private EnrollService enrollService;

    public List findAllElectiveCourse() {
        List electiveCourses = electiveCourseRepository.findAll();
        for(int i = 0; i < electiveCourses.size(); i++) {
            ElectiveCourse electiveCourse = (ElectiveCourse) electiveCourses.get(i);
            List enrolls = enrollService.findEnrollsByElectiveCourseId(electiveCourse.getId());
            electiveCourse.setEnrolls(enrolls);
            System.out.println(electiveCourse.getEnrolls());
        }
        return electiveCourses;
    }

    public ElectiveCourse findElectiveCourseByID(Integer id) {
        ElectiveCourse electiveCourse = electiveCourseRepository.findById(id)
                                    .orElseThrow(() -> new RuntimeException());
        return electiveCourse;
    }

    public ElectiveCourse createElectiveCourse(ElectiveCourse newRegister) {
        ElectiveCourse electiveCourse = electiveCourseRepository.save(newRegister);
        return electiveCourse;
    }
}

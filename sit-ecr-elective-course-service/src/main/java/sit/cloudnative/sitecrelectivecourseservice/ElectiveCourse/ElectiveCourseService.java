package sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectiveCourseService {

    @Autowired
    private ElectiveCourseRepository electiveCourseRepository;

    public List findAllElectiveCourse() {
        List electiveCourses = electiveCourseRepository.findAll();
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

package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    public List findAllEnroll() {
        List enrolls = enrollRepository.findAll();
        return enrolls;
    }

    public Enroll findEnrollByID(Integer id) {
        Enroll enroll = enrollRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
        return enroll;
    }

    public Enroll createEnroll(Enroll newRegister) {
        Enroll enroll = enrollRepository.save(newRegister);
        return enroll;
    }
}

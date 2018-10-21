package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sit.cloudnative.sitecrelectivecourseservice.DTO.UserView;

import java.util.List;

@Service
public class EnrollService {

    @Autowired
    private EnrollRepository enrollRepository;

    @Autowired
    private EnrollAdapter enrollAdapter;

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

    public List findEnrollsByElectiveCourseId(Integer id) {
        List enrolls = enrollRepository.findByCourseId(id);
        return enrolls;
    }

    public List findEnrollsByUserId(Integer id) {
        List enrolls = enrollRepository.findByUserId(id);
        return enrolls;
    }

    public Boolean isUserCanEnroll(Integer id) {
        UserView user = enrollAdapter.getUserById(id);
        if(isFreshmanOrSophomore(user)) {
            return false;
        }
        return true;
    }


    public boolean  isOverEnrollLimitByUserId(Integer id) {
        Integer limit = 0;
        List enrolls = this.findEnrollsByUserId(id);

        UserView user = enrollAdapter.getUserById(id);

        if (checkYear(user, 4)) {
            limit = 2;
        } else {
            limit = 1;
        }

        if(enrolls.size() < limit) {
            return false;
        }
        return true;
    }

    private boolean checkYear(UserView user, int i) {
        return user.getYear() == i;
    }

    private boolean isFreshmanOrSophomore(UserView user) {
        return checkYear(user, 1) || checkYear(user, 2);
    }

}

package sit.cloudnative.sitecraccountservice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List findAllUser() {
        List enrolls = userRepository.findAll();
        return enrolls;
    }

    public User findUserByID(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
        return user;
    }

    public User findUserByStudentID(String id) {
        User user = userRepository.findByStudentId(id);
        return user;
    }

    public User createUser(User newRegister) {
        User user = userRepository.save(newRegister);
        return user;
    }
}

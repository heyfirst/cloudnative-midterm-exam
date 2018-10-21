package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sit.cloudnative.sitecrelectivecourseservice.DTO.UserView;

@Service
public class EnrollAdapter {

    static final String ACCOUNT_SERVICE_URL = "http://localhost:8091";

    public UserView getUserById(Integer userId){
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = String.format(ACCOUNT_SERVICE_URL +"/user/%d", userId);
            UserView user = restTemplate.getForObject(url, UserView.class);
            return user;
        } catch (Exception ex ) {
            ex.printStackTrace();
            return null;
        }
    }
}

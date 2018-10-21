package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollRepository extends JpaRepository<Enroll, Integer> {
    List<Enroll> findByCourseId(Integer id);
}


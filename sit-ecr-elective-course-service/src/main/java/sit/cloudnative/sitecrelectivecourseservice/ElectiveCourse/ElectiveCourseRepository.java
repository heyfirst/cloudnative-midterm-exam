package sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectiveCourseRepository extends JpaRepository<ElectiveCourse, Integer> {
}


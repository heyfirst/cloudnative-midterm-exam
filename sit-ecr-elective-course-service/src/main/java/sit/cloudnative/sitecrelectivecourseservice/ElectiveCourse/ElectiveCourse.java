package sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse;

import sit.cloudnative.sitecrelectivecourseservice.Enroll.Enroll;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "elective_courses")
public class ElectiveCourse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String courseCode;

    private String courseName;

    private String lecturer;

    private Integer maxEnrolls;

    @Transient
    private List<Enroll> enrolls;

    public ElectiveCourse() {
    }

    public ElectiveCourse(String courseCode, String courseName, String lecturer, Integer maxEnrolls) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.maxEnrolls = maxEnrolls;
    }

    public ElectiveCourse(String courseCode, String courseName, String lecturer, Integer maxEnrolls, List<Enroll> enrolls) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.maxEnrolls = maxEnrolls;
        this.enrolls = enrolls;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public Integer getMaxEnrolls() {
        return maxEnrolls;
    }

    public void setMaxEnrolls(Integer maxEnrolls) {
        this.maxEnrolls = maxEnrolls;
    }


    public List<Enroll> getEnrolls() {
        return enrolls;
    }

    public void setEnrolls(List<Enroll> enrolls) {
        this.enrolls = enrolls;
    }
}

package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.hibernate.annotations.CreationTimestamp;
import sit.cloudnative.sitecrelectivecourseservice.ElectiveCourse.ElectiveCourse;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "enrolls")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer courseId;

    private Integer studentId;

    @Column
    @CreationTimestamp
    private LocalDateTime created;

    public Enroll() {
    }

    public Enroll(Integer courseId, Integer studentId, LocalDateTime created) {
        this.courseId = courseId;
        this.studentId = studentId;
        this.created = created;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}

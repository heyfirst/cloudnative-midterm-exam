package sit.cloudnative.sitecrelectivecourseservice.Enroll;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "enrolls")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer courseId;

    private Integer userId;

    @Column
    @CreationTimestamp
    private LocalDateTime created;

    public Enroll() {
    }

    public Enroll(Integer courseId, Integer userId, LocalDateTime created) {
        this.courseId = courseId;
        this.userId = userId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}

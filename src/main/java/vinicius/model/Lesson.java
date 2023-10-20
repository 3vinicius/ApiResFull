package vinicius.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name = "tb_lesson")
public class Lesson {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date relaseDate;

    @Column(length = 50, nullable = false)
    private String confirmation;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Date lessonDate;
    private String lessonType;

    @Column(nullable = false)
    private String lessonDuration;

    @Column(nullable = false)
    private float value;





    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Date getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(Date relaseDate) {
        this.relaseDate = relaseDate;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonDuration() {
        return lessonDuration;
    }

    public void setLessonDuration(String lessonDuration) {
        this.lessonDuration = lessonDuration;
    }

    public float getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

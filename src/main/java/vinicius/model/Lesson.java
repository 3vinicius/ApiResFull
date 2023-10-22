//package vinicius.model;
//
//import jakarta.persistence.*;
//
//
//@Entity
//public class Lesson {
//
//    @Id
//    private long id;
//
//    @Column(name = "relaseDate")
//    private String relaseDate;
//
//    // @Column(length = 50, nullable = false)
//    private String confirmation;
//
//    // @Column(nullable = false)
//    private String description;
//
//    // @Column(nullable = false)
//
//
//    @ManyToOne
//    @JoinColumn(name = "id_user", referencedColumnName = "id",columnDefinition = "Long")
//    private User idUser;
//
//    // @Column(nullable = false)
//    private String dateLesson;
//    private String typeLesson;
//
//    // @Column(nullable = false)
//
//
//    // @Column(nullable = false,scale = 2)
//
//
//    // @Column(length = 50, nullable = false)
//
//    // @Column(nullable = false)
//    private String lessonDuration;
//
//    // @Column(nullable = false,scale = 2)
//    @Column(precision = 2)
//    private int valueTotal;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getRelaseDate() {
//        return relaseDate;
//    }
//
//    public void setRelaseDate(String relaseDate) {
//        this.relaseDate = relaseDate;
//    }
//
//
//    public String getConfirmation() {
//        return confirmation;
//    }
//
//    public void setConfirmation(String confirmation) {
//        this.confirmation = confirmation;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getDateLesson() {
//        return dateLesson;
//    }
//
//    public void setDateLesson(String dateLesson) {
//        this.dateLesson = dateLesson;
//    }
//
//    public String getTypeLesson() {
//        return typeLesson;
//    }
//
//    public void setTypeLesson(String typeLesson) {
//        this.typeLesson = typeLesson;
//    }
//
//    public String getLessonDuration() {
//        return lessonDuration;
//    }
//
//    public void setLessonDuration(String lessonDuration) {
//        this.lessonDuration = lessonDuration;
//    }
//
//
//    public int getValueTotal() {
//        return valueTotal;
//    }
//
//    public void setValueTotal(int valueTotal) {
//        this.valueTotal = valueTotal;
//    }
//
//    public User getIdUser() {
//        return idUser;
//    }
//
//    public void setIdUser(User idUser) {
//        this.idUser = idUser;
//    }
//}

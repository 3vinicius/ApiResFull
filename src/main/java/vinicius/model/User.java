package vinicius.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column( length = 200)
    private String avatarUrl;

    @Column(unique = true,nullable = false,length = 11)
    private String phone;

    @Column(unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 50)
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Lesson> lessons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}

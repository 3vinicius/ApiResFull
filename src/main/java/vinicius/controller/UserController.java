package vinicius.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import vinicius.model.Lesson;
import vinicius.model.User;
//import vinicius.repository.LessonRepository;
import vinicius.repository.UserRepository;
import vinicius.service.UserService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    @Autowired
    private UserRepository repositoryUser;

//    @Autowired
//    private LessonRepository repositoryLesson;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/id")
    public ResponseEntity<User> findById(@PathVariable long id) {
        var user  = service.findById(id);
        return  ResponseEntity.ok(user);
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody User dateUser){

        User newUser = new User();

        newUser.setId(dateUser.getId());
        newUser.setEmail(dateUser.getEmail());
        newUser.setAvatarUrl(dateUser.getAvatarUrl());
        newUser.setName(dateUser.getName());
        newUser.setPassword(dateUser.getPassword());
        newUser.setPhone(dateUser.getPhone());



        repositoryUser.save(newUser);

        return ResponseEntity.ok("Data Saved");
    }

//    @PostMapping("/createUser")
//    public ResponseEntity<String> createUser(@RequestBody User dateUser){
//
//        User newUser = new User();
//
//
//        newUser.setId(dateUser.getId());
//        newUser.setEmail(dateUser.getEmail());
//        newUser.setAvatarUrl(dateUser.getAvatarUrl());
//        newUser.setName(dateUser.getName());
//        newUser.setPassword(dateUser.getPassword());
//        newUser.setPhone(dateUser.getPhone());
//
//
//
//
//        repositoryUser.save(newUser);
//        return ResponseEntity.ok("Data Saved");
//    }
//
//    @PostMapping("/lesson")
//    public ResponseEntity<String> createLesson(@RequestBody Lesson lesson){
//
//        Lesson newLesson = new Lesson();
//
//
//        newLesson.setDateLesson(lesson.getDateLesson());
//        newLesson.setId(lesson.getId());
//        newLesson.setTypeLesson(lesson.getTypeLesson());
//        newLesson.setLessonDuration(lesson.getLessonDuration());
//        newLesson.setRelaseDate(lesson.getRelaseDate());
//        newLesson.setValueTotal(lesson.getValueTotal());
//        newLesson.setConfirmation(lesson.getConfirmation());
//        newLesson.setDescription(lesson.getDescription());
//        newLesson.setIdUser(lesson.getIdUser());
//
//
//
//        repositoryLesson.save(newLesson);
//        return ResponseEntity.ok("Data Saved");
//    }





//    public ResponseEntity<User> create(User user) {
//        User userCreate = service.create(user);
////        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
////                .path("/{id}")
////                .buildAndExpand(userCreate.getId())
////                .toUri();
////        return  ResponseEntity.created(location).body(userCreate);
//        return ResponseEntity.ok(userCreate);
//    }

}

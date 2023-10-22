package vinicius.service;

import vinicius.model.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findByDate(Date data);

    User create(User user);

}

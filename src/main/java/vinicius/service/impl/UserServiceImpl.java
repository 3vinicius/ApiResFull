package vinicius.service.impl;

import org.springframework.stereotype.Service;
import vinicius.model.User;
import vinicius.repository.UserRepository;
import vinicius.service.UserService;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    UserRepository repository;
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<User> findByDate(Date date) {

        return null;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }
    @Override
    public User create(User user) {

        if (repository.existsById(user.getId())){
            throw new IllegalArgumentException("This User Id already exists");
        } else if (repository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("This User email already exists");
        } else if (repository.existsByPhone(user.getPhone())){
            throw new IllegalArgumentException("This User phone already exists");
        }
        return repository.save(user) ;
    }


    public void deleteUserById(long id){
        repository.deleteById(id);
    }
}

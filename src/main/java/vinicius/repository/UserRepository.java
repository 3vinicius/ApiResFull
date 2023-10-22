package vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vinicius.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByPhone(String number);
    boolean existsByEmail(String email);
}


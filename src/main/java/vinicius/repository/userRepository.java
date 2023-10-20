package vinicius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vinicius.model.User;

@Repository
public interface userRepository extends JpaRepository<User,Long> {
}

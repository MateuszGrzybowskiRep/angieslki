package pl.mgrzybowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.mgrzybowski.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
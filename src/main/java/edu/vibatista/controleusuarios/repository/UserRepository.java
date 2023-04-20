package edu.vibatista.controleusuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.vibatista.controleusuarios.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    


}

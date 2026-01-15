package com.caiodev.cursoweb.repositories;

import com.caiodev.cursoweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

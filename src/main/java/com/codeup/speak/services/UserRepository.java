package com.codeup.speak.services;

import com.codeup.speak.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> { }

package com.mwtassignment.usersystem.repository;

import com.mwtassignment.usersystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

package com.github.yornellas.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.yornellas.projectorder.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

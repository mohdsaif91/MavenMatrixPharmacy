package com.BeeCee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.BeeCee.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Integer> {

	UserDetails findByUsername(String username);
}

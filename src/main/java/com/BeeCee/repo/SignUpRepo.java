package com.BeeCee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BeeCee.model.SignUp;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

//	SignUp findByEmail_id(String email_id);
}

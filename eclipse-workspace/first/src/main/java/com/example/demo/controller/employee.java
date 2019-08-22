package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.hank;
public interface employee extends JpaRepository<hank, Integer>{

List<hank> findByname(String name);
List<hank> findByidGreaterThan(int id);
List<hank> findByidLessThan(int id);

@Query("from hank where lname=?1 order by name")
List<hank> findBynameSorted(String s);
	
}

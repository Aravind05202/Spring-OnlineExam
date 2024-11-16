package com.example.onlineexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onlineexam.model.ClassInfo;


public interface ClassInfoRepository extends JpaRepository<ClassInfo, String> {

	
}

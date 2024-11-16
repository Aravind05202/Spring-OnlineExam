package com.example.onlineexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlineexam.model.ClassInfo;
import com.example.onlineexam.repository.ClassInfoRepository;

import java.util.List;

@Service
public class ClassInfoService {

    @Autowired
    private ClassInfoRepository classInfoRepository;

    /**
     * Fetches all available classes.
     *
     * @return a list of all classes
     */
    public List<ClassInfo> getAllClasses() {
        List<ClassInfo> classInfoList = classInfoRepository.findAll();
        
        // Optional: Log or handle empty list if needed
        if (classInfoList.isEmpty()) {
            // Example: log or handle the empty list scenario
            System.out.println("No classes found in the database.");
        }

        return classInfoList;
    }

}

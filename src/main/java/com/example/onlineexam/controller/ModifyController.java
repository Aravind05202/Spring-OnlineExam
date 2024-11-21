package com.example.onlineexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.onlineexam.model.ClassInfo;
import com.example.onlineexam.service.ClassInfoService;

import java.util.List;

@Controller
public class ModifyController {

    @Autowired
    private ClassInfoService classInfoService;

    /**
     * Displays the form for modifying questions, including all available classes.
     */
    @GetMapping("/modify_question")
    public String showModifyQuestionsForm(Model model) {
        // Fetch all classes
        List<ClassInfo> classInfoList = classInfoService.getAllClasses();

        model.addAttribute("classInfoList", classInfoList);
        return "modify_question";
    }
}
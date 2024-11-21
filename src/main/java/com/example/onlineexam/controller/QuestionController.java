package com.example.onlineexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.onlineexam.model.Question;
import com.example.onlineexam.service.QuestionService;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
     * Fetches questions filtered by class ID and subject ID and displays them.
     */
    @GetMapping("/get-questions")
    public String getQuestionsByClassAndSubject(@RequestParam("class_id") String classId, 
                                                @RequestParam("subject_id") String subjectId, 
                                                Model model) {
        // Fetch questions filtered by classId and subjectId
        List<Question> questions = questionService.getQuestionsByClassAndSubject(classId, subjectId);

        // Add the questions to the model
        model.addAttribute("questions", questions);
        model.addAttribute("classId", classId);
        model.addAttribute("subjectId", subjectId);
        // Return the view to display the questions
        return "questionList";  // Ensure this is the correct view to display the list of questions
    }
}
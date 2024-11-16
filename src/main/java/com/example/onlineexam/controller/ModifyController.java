package com.example.onlineexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.onlineexam.model.ClassInfo;
import com.example.onlineexam.model.Question;
import com.example.onlineexam.model.SubjectInfo;
import com.example.onlineexam.service.ClassInfoService;
import com.example.onlineexam.service.SubjectInfoService;
import com.example.onlineexam.service.QuestionService;

import java.util.List;

@Controller
public class ModifyController {

    @Autowired
    private ClassInfoService classInfoService;

    @Autowired
    private SubjectInfoService subjectInfoService;
    
    @Autowired
    private QuestionService questionService;


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

    @GetMapping("/get-subjects")
    @ResponseBody
    public List<SubjectInfo> getSubjectsByClass(@RequestParam("class_id") String classId) {
        return subjectInfoService.getSubjectsByClassId(classId);
    }

    
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

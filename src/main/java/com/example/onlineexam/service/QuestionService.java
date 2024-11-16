package com.example.onlineexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.onlineexam.model.Question;
import com.example.onlineexam.repository.QuestionRepository;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    /**
     * Fetches questions filtered by class ID and subject ID.
     *
     * @param classId   the ID of the class
     * @param subjectId the ID of the subject
     * @return a list of filtered questions
     */
    public List<Question> getQuestionsByClassAndSubject(String classId, String subjectId) {
        return questionRepository.findQuestionsByClassIdAndSubjectId(classId, subjectId);
    }

    // Other methods
}

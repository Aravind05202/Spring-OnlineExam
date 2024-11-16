package com.example.onlineexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.onlineexam.model.Question;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, String> {

    /**
     * Finds questions by class ID and subject ID.
     *
     * @param classId   the ID of the class
     * @param subjectId the ID of the subject
     * @return a list of questions that match the criteria
     */
    List<Question> findQuestionsByClassIdAndSubjectId(String classId, String subjectId);
}

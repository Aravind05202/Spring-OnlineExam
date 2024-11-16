package com.example.onlineexam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name= "question_info_v_two")
@NoArgsConstructor
@AllArgsConstructor
public class Question {
	
	@Id
	@Column(name= "pk_question_id")
	@GeneratedValue
	private String id;
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	@Column(name= "question_name")
	private String name;
	
	public String getCid() {
		return classId;
	}
	
	@Column(name= "fk_class_id")
	private String classId;
	
	public String getSid() {
		return subjectId;
	}
	
	@Column(name= "fk_subject_id")
	private String subjectId;
}

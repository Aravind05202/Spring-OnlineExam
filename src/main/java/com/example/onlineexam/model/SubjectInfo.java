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
@Table(name= "subject_info")
@NoArgsConstructor
@AllArgsConstructor
public class SubjectInfo {
	
	@Id
	@Column(name= "pk_subject_id")
	@GeneratedValue
	private String subjectId;
	
	public String getId() {
		return subjectId;
	}


	public String getName() {
		return name;
	}
	
	@Column(name= "subject_name")
	private String name;
	
	public String getCid() {
		return classId;
	}

	
	@Column(name= "fk_class_id")
	private String classId;
}

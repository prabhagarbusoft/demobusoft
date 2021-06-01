package com.sample.web.dao;


import com.sample.web.entity.StudentDetail;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IStudentDetailsDao {


 List<StudentDetail> loadAllStudentDetails();
 public StudentDetail  findBystudentId( int studId);
 public StudentDetail createStudent(StudentDetail studentDetail);
 public StudentDetail updateStudent(StudentDetail studentDetail);

 String loadStudentsNo(String pno);



}

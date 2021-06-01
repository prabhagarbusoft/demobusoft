package com.sample.web.dao;

import com.sample.web.entity.StudentDetail;
import com.sample.web.repository.StudentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component("studentDetailsDao")
public class StudentDetailsDaoImpl implements IStudentDetailsDao {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<StudentDetail> loadAllStudentDetails() {
        return studentDetailsRepository.findAll();
    }

    @Override
    public StudentDetail findBystudentId(int studId) {
        return studentDetailsRepository.findByStudentId(studId);
    }

    @Override
    public StudentDetail createStudent(StudentDetail studentDetail) {
        return studentDetailsRepository.save(studentDetail);
    }

    @Override
    public StudentDetail updateStudent(StudentDetail studentDetail) {

        return studentDetailsRepository.save(studentDetail);
    }

    @Override
    public String loadStudentsNo(String Pno) {
        return studentDetailsRepository.findBystudentpno(Pno);
    }


}

package com.sample.web.servicess;

import com.sample.web.entity.StudentDetail;
import com.sample.web.studentdetaildo.Studentdo;

import java.util.List;

public interface IstudentDetailsService {

    List<Studentdo> loadAllStudentDetails() throws Exception;
    StudentDetail createStudentDetail(Studentdo studentDetail) throws Exception;
    StudentDetail updateStudentDetail(Studentdo studentDetail);


}

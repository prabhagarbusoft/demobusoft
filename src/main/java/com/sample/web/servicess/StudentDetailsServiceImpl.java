package com.sample.web.servicess;

import com.sample.web.dao.IStudentDetailsDao;
import com.sample.web.entity.StudentDetail;
import com.sample.web.repository.StudentDetailsRepository;
import com.sample.web.studentdetaildo.Studentdo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("studentDetailsService")
public class StudentDetailsServiceImpl implements IstudentDetailsService {


    private static final Logger logger=  LogManager.getLogger(StudentDetailsServiceImpl.class);

    @Autowired
    private IStudentDetailsDao studentDetailsDao;

    @Autowired
    StudentDetailsRepository studentDetailsRepository;



    @Override
    public List<Studentdo> loadAllStudentDetails() throws Exception {

        List<Studentdo> studentDetailsList=new ArrayList<>();
        List<StudentDetail> objectsList=studentDetailsDao.loadAllStudentDetails();
        Studentdo studentdo;
        for(StudentDetail studentDetail:objectsList) {
            studentdo = new Studentdo();
            studentdo.setStudId(studentDetail.getStudentId());
            studentdo.setName(studentDetail.getName());
            studentdo.setAge(studentDetail.getAge());
            studentdo.setAddress(studentDetail.getStudentAddress());
            studentdo.setDept(studentDetail.getDept());
            studentdo.setPno(studentDetail.getPno());
            studentDetailsList.add(studentdo);
        }
        return studentDetailsList;
    }


    @Override
    public StudentDetail createStudentDetail(Studentdo studentDetail) throws Exception {


        String stuPno=studentDetailsDao.loadStudentsNo(studentDetail.getPno());
        if( studentDetail.getPno()==null || studentDetail.getPno()=="" ){

            throw new Exception("please provide the valid pno ");
        }
        if(stuPno !=null ){
            throw new Exception(" pno already exists ");
        }


        StudentDetail studentDetail1=new StudentDetail();
        studentDetail1.setStudentId(studentDetail.getStudId());
        studentDetail1.setName(studentDetail.getName());
        studentDetail1.setAge(studentDetail.getAge());
        studentDetail1.setStudentAddress(studentDetail.getAddress());
        studentDetail1.setDept(studentDetail.getDept());
        studentDetail1.setPno(studentDetail.getPno());
        studentDetailsDao.createStudent(studentDetail1);

        return studentDetail1;

    }

    @Transactional
    @Override
    public StudentDetail updateStudentDetail(Studentdo studentDetail) {

        StudentDetail studentDetail1 = studentDetailsDao.findBystudentId(studentDetail.getStudId());




        studentDetail1.setStudentId(studentDetail.getStudId());
        studentDetail1.setName(studentDetail.getName());
        studentDetail1.setAge(studentDetail.getAge());
        studentDetail1.setStudentAddress(studentDetail.getAddress());
        studentDetail1.setDept(studentDetail.getDept());
        studentDetail1.setPno(studentDetail.getPno());

        studentDetailsDao.updateStudent(studentDetail1);

        return studentDetail1;
    }

}


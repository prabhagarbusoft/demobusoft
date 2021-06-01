package com.sample.web.controller;

import com.sample.web.entity.StudentDetail;
import com.sample.web.servicess.IstudentDetailsService;
import com.sample.web.studentdetaildo.StudentDetailDO;
import com.sample.web.studentdetaildo.Studentdo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@EnableAutoConfiguration
public class StudentController {

    @Autowired
    private IstudentDetailsService studentDetailsService;



    @ResponseBody
    @RequestMapping(value = "/loadStudents", method = RequestMethod.POST)
    public StudentDetailDO loadStudents( @RequestBody StudentDetailDO studentDetailDO, HttpServletRequest servletRequest) {

        try {
            List<Studentdo> studentdoList = studentDetailsService.loadAllStudentDetails();
            studentDetailDO.setStudentdos(studentdoList);
            studentDetailDO.setStatus("SUCCESS");
        } catch (Exception e) {
            studentDetailDO.setStatus("FAILED");
        }

        return studentDetailDO;
    }
    @ResponseBody
    @RequestMapping(value = "/createStudent", method = RequestMethod.POST)
    public Studentdo createStudents(
            @Valid  @RequestBody Studentdo studentdo, HttpServletRequest servletRequest) throws Exception {

            try{
                StudentDetail studentdoList = studentDetailsService.createStudentDetail(studentdo);
                studentdo.setStatus("SUCCESS");
            }catch (Exception e){
                studentdo.setStatus("FAILED");
                studentdo.setErrorMessage(e.getMessage());
            }
            return studentdo;

    }

    @ResponseBody
    @RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
    public StudentDetail updateStudents(@RequestBody Studentdo request, HttpServletRequest servletRequest,HttpServletRequest httpServletRequest) {

        StudentDetail studentdoList = studentDetailsService.updateStudentDetail(request);
        return studentdoList;
    }



}
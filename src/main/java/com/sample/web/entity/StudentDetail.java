package com.sample.web.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student_details_info")
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int studentId;

    @NotNull
    @Column
    private String studentAddress;

    @Column
    private int age;

    @NotNull
    @Column
    private String dept;

    @Column
    @NotNull
    private String name;

    @Column
    private String pno;

    public String getPno() {
        return this.pno;
    }

    public void setPno( String pno) {
        this.pno = pno;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return this.age;
    }

    public void setAge( int age) {
        this.age = age;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}

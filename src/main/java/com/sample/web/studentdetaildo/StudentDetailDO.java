package com.sample.web.studentdetaildo;

import java.util.List;

public class StudentDetailDO {

    private List<Studentdo> studentdos;
    private Studentdo studentdo;
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public List<Studentdo> getStudentdos() {
        return this.studentdos;
    }

    public void setStudentdos(final List<Studentdo> studentdos) {
        this.studentdos = studentdos;
    }

    public Studentdo getStudentdo() {
        return this.studentdo;
    }

    public void setStudentdo(final Studentdo studentdo) {
        this.studentdo = studentdo;
    }
}

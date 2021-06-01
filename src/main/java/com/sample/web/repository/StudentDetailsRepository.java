package com.sample.web.repository;

import com.sample.web.entity.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetail,Long>, JpaSpecificationExecutor<StudentDetail> {

  public StudentDetail findByStudentId(int studId);

   @Query("select s.pno from StudentDetail s where s.pno in ?1")
   public String findBystudentpno(String pno);

}

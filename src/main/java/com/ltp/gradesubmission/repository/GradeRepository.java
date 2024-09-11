package com.ltp.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.gradesubmission.entity.Grade;

/**
 * GradeRepository
 */
public interface GradeRepository extends CrudRepository<Grade,Long> {

    Grade findByStudentId(Long studentId);

    
}
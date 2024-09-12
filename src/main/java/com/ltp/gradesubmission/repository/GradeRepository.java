package com.ltp.gradesubmission.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ltp.gradesubmission.entity.Grade;

/**
 * GradeRepository
 */
public interface GradeRepository extends CrudRepository<Grade,Long> {

    public Optional<Grade> findByStudentIdAndCourseId(Long studentId, Long courseId);

    
}
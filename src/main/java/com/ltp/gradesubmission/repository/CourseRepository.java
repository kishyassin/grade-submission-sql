package com.ltp.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.gradesubmission.entity.Course;

/**
 * CourseRepository
 */
public interface CourseRepository extends CrudRepository<Course,Long>{

    
}
package com.yyy.dao;

import com.yyy.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生信息以及对应老师的信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}

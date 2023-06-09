package com.paulselvi.Student.Management.System.service;
import com.paulselvi.Student.Management.System.model.Student;

import java.util.List;
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}

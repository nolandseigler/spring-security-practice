package com.example.demo.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Bob Saget"),
            new Student(2, "Bobby Shmurda"),
            new Student(3, "Lil Jon")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println(student);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        System.out.println(studentId);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student){
        System.out.println(String.format("%S %s", student, studentId));
    }

}

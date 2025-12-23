package com.crudwebsite.crudapi.controller;

import com.crudwebsite.crudapi.Service.StudentService;
import com.crudwebsite.crudapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin("http://localhost:3000")
public class StudentController {

    @Autowired
    private StudentService studentService ;

    @GetMapping("/getAllStudent")
    public List<Student> getStudentList(){
        return studentService.getAllStudent();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return  studentService.createStudent(student);
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentByID(id);

    }

    @PutMapping("/updateStudent/{id}")
    public  Student updateStudentById(@RequestBody Student student, @PathVariable int id ){
        return studentService.updateStudent(id, student);

    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student Delete Successfully";
    }


}

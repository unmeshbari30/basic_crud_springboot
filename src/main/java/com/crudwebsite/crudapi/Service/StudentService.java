package com.crudwebsite.crudapi.Service;

import com.crudwebsite.crudapi.dao.StudentRepository;
import com.crudwebsite.crudapi.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
        return studentRepository.findAll();

    }

    public Student createStudent(Student student){
        return studentRepository.save(student);

    }

    public Student getStudentByID(int id){
        Optional<Student> foundedStudent =  studentRepository.findById(id);
        if(foundedStudent.isPresent()){
            return foundedStudent.get();

        }
        else {
            return null;

        }
    }

    public Student updateStudent(int id, Student student){
        Optional<Student> updateStudent =  studentRepository.findById(id);
        if(updateStudent.isPresent()){
            Student studentToUpdate = updateStudent.get();
            studentToUpdate.setMarks(student.getMarks());
            studentToUpdate.setName(student.getName());

            return studentRepository.save(studentToUpdate);



        }
        else{
            return  null;

        }
    }

    public void deleteStudent(int id ){
        studentRepository.deleteById(id);
    }




}

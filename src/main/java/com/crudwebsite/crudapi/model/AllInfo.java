package com.crudwebsite.crudapi.model;

import java.util.List;

public class AllInfo {

    String name;
    List<StudentInfo> studentInfoList;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentInfo> getStudentInfoList() {
        return studentInfoList;
    }

    public void setStudentInfoList(List<StudentInfo> studentInfoList) {
        this.studentInfoList = studentInfoList;
    }
}




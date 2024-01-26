package com.mumo.JDBCdemo.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private int studNo;
    private String name;
    private int marks;

    public int getStudNo() {
        return studNo;
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "student{" +
                "studNo=" + studNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

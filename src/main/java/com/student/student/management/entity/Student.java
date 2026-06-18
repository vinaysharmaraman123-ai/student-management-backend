//package com.student.student.management.entity;
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long Id;
//    private String Email;
//    private String name;
//    private String course;
//    private int age;
//
//    public Student() {}
//
//    public Student(String Email,String name, String course) {
//        this.name = name;
//        this.course = course;
//    }
//
//    public Long getId() {
//        return Id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//    public String getemail(){
//        return Email;
//    }
//    public int getage(){
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//}
//package com.student.student.management.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String email;
//    private String course;
//    private int age;
//
//    public Student() {}
//
//    public Student(String name, String email, String course, int age) {
//        this.name = name;
//        this.email = email;
//        this.course = course;
//        this.age = age;
//    }
//
//    // Getters
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    // Setters
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}



//package com.student.student.management.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String email;
//    private String course;
//    private int age;
//
//    // Default constructor (required by JPA)
//    public Student() {
//    }
//
//    // Parameterized constructor (optional but useful)
//    public Student(String name, String email, String course, int age) {
//        this.name = name;
//        this.email = email;
//        this.course = course;
//        this.age = age;
//    }
//
//    // Getters and Setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getCourse() {
//        return course;
//    }
//
//    public void setCourse(String course) {
//        this.course = course;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

package com.student.student.management.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;
    private int age;

    public Student() {
    }

    public Student(String name, String email, String course, int age) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
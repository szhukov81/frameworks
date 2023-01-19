/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ua.edu.sumdu;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 *
 * @author Serhii Zhukov
 */
public class Student {

    private String name;
    private String surname;
    private String age;
    private String email;
    private String group;
    private String faculty;
    private Document doc;
    
    public Student() {}
//
//    public Student(String name, String surname, String age, String email, String group, String faculty) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.email = email;
//        this.group = group;
//        this.faculty = faculty;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Document getDoc() {
        return doc;
    }

    public void setDoc(Document id) {
        this.doc = id;
    }
}

package com.company;

public class Registation extends Authentication {
    private String name;
    private int age;
    private String subject;



    public Registation(String userName, int password, String name, int age, String subject) {
        super(userName, password);
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Registation() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

package com.company;



public class Course extends Registation {
    private String course1 = "[1] SENG 11111 - Object Oriented Programming";
    private String course2 = "[2] SENG 11112 - Introduction to databases";
    private String course3 = "[3] SENG 11123 - Project management";

    public Course(String userName, int password, String name, int age, String subject, String course1, String course2, String course3) {
        super(userName, password, name, age, subject);
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;

    }
    public  void selectedCourse(String subject) {

        switch (subject) {
            case "1":
                System.out.println(course1);
                break;
            case "2":
                System.out.println(course2);
                break;
            case "3":
                System.out.println(course3);
                break;
            case "1,2":
                System.out.println(course1);
                System.out.println(course2);
                break;
            case "1,3":
                System.out.println(course1);
                System.out.println(course3);
                break;
            case "2,3":
                System.out.println(course2);
                System.out.println(course3);
                break;
            case "1,2,3":
                System.out.println(course1);
                System.out.println(course2);
                System.out.println(course3);
                break;
            default:
                System.out.println("Invalid Input!!");
                break;
        }


    }

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public String getCourse2() {
        return course2;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public String getCourse3() {
        return course3;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    public Course() {
    }
}

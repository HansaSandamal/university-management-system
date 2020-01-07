package com.company;

import java.sql.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int option;
	int select;
	int select2;
	int sel;

	Scanner scanner = new Scanner(System.in);
	Registation student = new Registation();
	Registation lecturer = new Registation();
	Authentication authenticationLec = new Authentication();
	Authentication authenticationStd = new Authentication();
	Course courseStd = new Course();
	Course courseLec = new Course();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "");




		do {
			System.out.println("..........WELCOME TO UNIVERSITY MANAGEMENT SYSTEM ............");
			System.out.println(" ");
			System.out.println("Select, [1]Sign Up  [2]Sign In");
			option = scanner.nextInt();
			switch (option) {
				case 1:
					System.out.println("Please select your registration role, [1]Lecturer  [2]Student");
					select = scanner.nextInt();
					switch (select) {
						case 1:
							System.out.println("Lecturer Registration Form");
							System.out.println("Name :");
							lecturer.setName(scanner.next());
							System.out.println(lecturer.getName());

							System.out.println("User Name :");
							authenticationLec.setUserName(scanner.next());
							System.out.println(authenticationLec.getUserName());

							System.out.println("Password :");
							authenticationLec.setPassword(scanner.nextInt());
							System.out.println(authenticationLec.getPassword());

							System.out.println("Age :");
							lecturer.setAge(scanner.nextInt());
							System.out.println(lecturer.getAge());

							System.out.println("Select the courses :");
							System.out.println("[1] SENG 11111 - Object Oriented Programming");
							System.out.println("[2] SENG 11112 - Introduction to databases");
							System.out.println("[3] SENG 11123 - Project management");
							lecturer.setSubject(scanner.next());

							System.out.println("You have successfully registered for following courses :");

							courseLec.selectedCourse(lecturer.getSubject());

							String query = "insert into Lecturer(Name,UserName ,Password ,Age ,Course )" + "values(?,?,?,?,?)";
							PreparedStatement preparedStmt = con.prepareStatement(query);

							preparedStmt.setObject(1,lecturer.getName());
							preparedStmt.setObject(2, authenticationLec.getUserName());
							preparedStmt.setObject(3, authenticationLec.getPassword());
							preparedStmt.setObject(4, lecturer.getAge());
							preparedStmt.setObject(5,lecturer.getSubject());


							preparedStmt.execute();
							break;



						case 2:
							System.out.println("Student Registration Form");
							System.out.println("Name :");
							student.setName(scanner.next());
							System.out.println(student.getName());

							System.out.println("User Name :");
							authenticationStd.setUserName(scanner.next());
							System.out.println(authenticationStd.getUserName());

							System.out.println("Password :");
							authenticationStd.setPassword(scanner.nextInt());
							System.out.println(authenticationStd.getPassword());

							System.out.println("Age :");
							student.setAge(scanner.nextInt());
							System.out.println(student.getAge());

							System.out.println("Select the courses :");
							System.out.println("[1] SENG 11111 - Object Oriented Programming");
							System.out.println("[2] SENG 11112 - Introduction to databases");
							System.out.println("[3] SENG 11123 - Project management");

							student.setSubject(scanner.next());

							System.out.println("You have successfully registered for following courses :");

							courseStd.selectedCourse(student.getSubject());

							String query2 = "insert into Student(Name,UserName ,Password ,Age ,Course )" + "values(?,?,?,?,?)";
							PreparedStatement preparedStmt2 = con.prepareStatement(query2);

							preparedStmt2.setObject(1,student.getName());
							preparedStmt2.setObject(2, authenticationStd.getUserName());
							preparedStmt2.setObject(3, authenticationStd.getPassword());
							preparedStmt2.setObject(4, student.getAge());
							preparedStmt2.setObject(5,student.getSubject());


							preparedStmt2.execute();


							break;

						default:
							System.out.println("Invalid Input!!");
							break;
					}
					break;

				case 2:
					System.out.println("Please select your registration role, [1]Lecturer  [2]Student");
					select2 = scanner.nextInt();

					switch (select2){
						case  1:
							System.out.println("Lecturer Login Form");

							System.out.println("Enter User Name :");
							authenticationLec.setUserName(scanner.next());
							System.out.println(authenticationLec.getUserName());

							System.out.println("Enter Password :");
							authenticationLec.setPassword(scanner.nextInt());
							System.out.println(authenticationLec.getPassword());

							Statement  stmt=con.createStatement();
							ResultSet   rs=stmt.executeQuery( "select * from Lecturer where UserName='"+authenticationLec.getUserName()+"'and Password='"+authenticationLec.getPassword()+"';");
							while (rs.next()) {
								System.out.println( "Hi " + rs.getString(1));
								System.out.println("You have successfully registered for this courses:");
								System.out.println(" "+rs.getString(5));
							}
							break;
						case 2:
							System.out.println("Student Login Form");

							System.out.println("Enter User Name :");
							authenticationStd.setUserName(scanner.next());
							System.out.println(authenticationStd.getUserName());

							System.out.println("Enter Password :");
							authenticationStd.setPassword(scanner.nextInt());
							System.out.println(authenticationStd.getPassword());

							Statement  stmt4 =con.createStatement();
							ResultSet   rs1 =stmt4.executeQuery( "select * from Student where UserName='"+authenticationStd.getUserName()+"'and Password='"+authenticationStd.getPassword()+"';");
							while (rs1.next()) {
								System.out.println( "Hi " + rs1.getString(1));
								System.out.println("You have successfully registered for this courses:");
								System.out.println(" "+rs1.getString(5));
							}
							break;
					    }

					break;

				default:
					System.out.println("Invalid Input!!");
					break;
			}
			System.out.println("Please Select a option,");
			System.out.println("[1] exit");
			System.out.println("[2] Register new course");
			sel = scanner.nextInt();
		} while (sel != 1);

		}catch(Exception e){
			System.out.println(e);}

		System.out.println("Bye!");


    }

}

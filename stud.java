import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ArrayList <students> studentArrayList=new ArrayList<>();
        ArrayList <lectures> lectureArrayList=new ArrayList<>();

        int a=1,b,c,d,e=196,l;
        String k,m,n,o,p;
        while(e==196){
            System.out.println("Welcome to univercity managemtn system");
            System.out.println("plese select an opption");
            System.out.println("enter 1 to register as student enter 2 to register as lecturer enter 3 to exit");
            a=scan.nextInt();
            if(a== 1){
                System.out.println("enter name");
                k=scan.next();
                System.out.println("enter age");
                l=scan.nextInt();
                students stu=new students(k,l);
                stu.showCourses();
                System.out.println("enter course id ");
                m=scan.next();
                stu.selectCouse(m);
                
                stu.show();
            }
            else if(a==2){
                System.out.println("enter name");
                k=scan.next();
                System.out.println("enter age");
                l=scan.nextInt();
                lectures lec=new lectures(k,l);
                System.out.println("Registrer completed");
                lec.show();
            }
            else if(a==3){
                e=0;
            }
            else{
                System.out.println("wrong command");
            }
        }

    }
}

class students extends couses{
    private String name;
    private int age;
    private ArrayList <String> selectCourses=new ArrayList<String>();

    public students() {
    	
    }
    
    public students(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }

    public void selectCouse(String id){
        selectCourses.add(id);
    }

    public void show(){
    	System.out.println("register completed");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Course "+courseId.get(Integer.parseInt(selectCourses.get(0)))+"   "+courseName.get(Integer.parseInt(selectCourses.get(0))));
        
    }

}

class couses{
    protected ArrayList <String> courseId =new ArrayList<String>(); //{"SENG 11111","SENG 11112","SENG 11113"
    protected ArrayList <String> courseName=new ArrayList<String>(); // {"INTRDUCTION TO PROGRAMMING","FUNDUMENTALS OF ENGINNERING", "DATA STUCTURES AND ALGORITHEMS"}

    public couses(){
        courseId.add("SENG 11111");
        courseId.add("SENG 11112");
        courseId.add("SENG 11113");
        courseName.add("INTRDUCTION TO PROGRAMMING");
        courseName.add("FUNDUMENTALS OF ENGINNERING");
        courseName.add("DATA STUCTURES AND ALGORITHEMS");
    }



    public void showCourses(){
        for (int a=0;a<courseId.size();a++){
            System.out.print(a+" "+courseId.get(a));
            System.out.println(" - "+courseName.get(a));
        }
    }
}

class lectures extends couses{
    private String name;
    private int age;
    
    public lectures() {
    	
    }

    public lectures(String name,int age){
        this.name=name;
        this.age=age;
    }
    
    public void setName(String name) {
    	this.name=name;
    }
    
    public void setAge(int age) {
    	this.age=age;
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }

    public void addCourses(String id,String name){
        courseId.add(id);
        courseName.add(name);
    }

    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }
}
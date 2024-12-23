package SchoolManagement;
import java.util.*;
public class Main{

    public static void main(String args[]){
        Teacher t1 = new Teacher(1,"Ameesha",300);
        Teacher t2 = new Teacher(2,"Alfin",2500);
        Teacher t3 = new Teacher(3,"Mini",3500);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1 = new Student(1,"John",2);
        Student s2 = new Student(2,"Jacob",5);
        Student s3 = new Student(3,"Jerald",7);
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School c1=new School(teacherList,studentList);
        

        s1.payFees(500);
        System.out.println("S1: "+c1.totalMoney);
        t1.receiveSalary(t1.getSalary());
        System.out.println("Money Spent for salary : "+c1.getTotalMoney());
        System.out.println(s1);
    }
}
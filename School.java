package SchoolManagement;
import java.util.*;
public class School{

    private List<Teacher> teachers;
    private List<Student> students;
     static int totalMoney;
    private static int totalSpent;

    public School(List<Teacher> teachers , List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoney=0;
        totalSpent=0;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public int getTotalMoney(){
        return totalMoney;
    }

    public static int updateTotalMoney(int MoneyEarned){
        totalMoney+=MoneyEarned;
        return totalMoney;
    }

    public int getTotalSpent(){
        return totalSpent;
    }

    public static void updateTotalSpent(int MoneySpent){
        totalMoney-=MoneySpent;
    }
}
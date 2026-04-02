// KEEP TRACK OF ALL STUDENTS, TEACHERS, TOTAL MONEY EARNED and MONEY SPENT
// SCHOOL CAN HAVE MANY TEACHERS AND STUDENTS

import java.util.ArrayList;

public class School {
    
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    // NEW SCHOOL OBJECT IS CREATED
    public School(ArrayList<Teacher> teachers, ArrayList<Student> students){
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    // GET TEACHERS
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

    // GET STUDENTS
    public ArrayList<Student> getStudents(){
        return students;
    }

    // GET TOTAL MONEY EARNED
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    // GET TOTAL MONEY SPENT
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    // ADD TEACHERS
    public void addTeachers(Teacher teacher){
        teachers.add(teacher);
    }

    // ADD STUDENTS
    public void addStudents(Student student){
        students.add(student);
    }

    // UPDATE TOTAL MONEY EARNED
    public void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    // UPDATE TOTAL MONEY SPENT
    public void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -= moneySpent;
    }

    

}

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Teacher Poonam = new Teacher(1, "Poonam", 10000);
        Teacher Vijay = new Teacher(2, "Vijay", 25000);
        Teacher Mukesh = new Teacher(3, "Mukesh", 30000);

        Student Aryan = new Student(21, "Aryan", 12);
        Student Radhey = new Student(14, "Radhey", 9);
        Student Himanshu = new Student(53, "Himanshu", 4);

        ArrayList<Teacher> teachersList = new ArrayList<>();
        teachersList.add(Poonam);
        teachersList.add(Vijay);
        teachersList.add(Mukesh);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(Aryan);
        studentsList.add(Radhey);
        studentsList.add(Himanshu);

        School SOCS = new School(teachersList, studentsList);

        
        Aryan.payFees(5000);    
        Radhey.payFees(10000);
        System.out.println("Fees Paid by Aryan: " + Aryan.getFeesPaid());
        System.out.println("Fees Paid by Radhey: " + Radhey.getFeesPaid());
        System.out.println("SOCS has earned: " + SOCS.getTotalMoneyEarned());

        System.out.println("====== MAKING SOCS PAY SALARY ======");
        Poonam.recieveSalary();
        Mukesh.recieveSalary();
        System.out.println("Poonam Salary: " + Poonam.getSalary());
        System.out.println("Mukesh Salary: " + Mukesh.getSalary());
        System.out.println("Total Money Spent by SOCS: " + SOCS.getTotalMoneySpent());

    }
}

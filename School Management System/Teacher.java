// TEACHER ID NAME SALARY
public class Teacher {
    
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // GET ID
    public int getId(){
        return id;
    }

    // GET NAME
    public String getName(){
        return name;
    }

    // GET SALARY
    public int getSalary(){
        return salary;
    }

    // SET THE SALARY
    public void setSalary(int salary){
        this.salary = salary;
    }

    // RECIEVE SALARY
    // ADDS TO SALARY 
    // REMOVE FROM TOTAL MONEY EARNED FROM SCHOOL
    public void recieveSalary(){
        salaryEarned += this.salary;
        School.updateTotalMoneySpent(this.salary);
    }

}

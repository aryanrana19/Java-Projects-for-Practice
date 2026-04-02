// TEACHER ID NAME SALARY
public class Teacher {
    
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
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

}

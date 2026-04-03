// KEEPING TRACK OF STUDENTS - FEES - Total & Paid, Name, Id, Grade

public class Student{
    
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // NOT GOING TO ALTER STUDENT ID AND NAME

    // UPDATE GRADE
    public void setGrade(int grade){
        this.grade = grade;
    }

    // UPDATE FEES PAID
    // ADD THE FEES TO "FEES PAID"
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    // GET ID
    public int getId(){
        return id;
    }

    // GET NAME
    public String getName(){
        return name;
    }

    // GET GRADE
    public int getGrade(){
        return grade;
    }

    // GET FEES PAID
    public int getFeesPaid(){
        return feesPaid;
    }

    // GET FEES TOTAL
    public int getFeesTotal(){
        return feesTotal;
    }

    // RETURN THE REMAINING FEES
    public int getRemainingFees(){
        return feesTotal -= feesPaid;
    }


}
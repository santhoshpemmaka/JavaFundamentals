package instance;

public class Employee {
    private int baseSalary;
    private int extraWage;
    public static int numberofEmployess;
    public Employee(int salary) {
        this(salary, 0);
    }

    public Employee(int salary, int extraWage) {
        setBasesalary(salary);
        setExtrawage(extraWage);
        numberofEmployess++;
    }

    private void setBasesalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary didn't be zero and less than that");
        }
        this.baseSalary = salary;
        
    }
    
    private void setExtrawage(int extraWage) {
        if (extraWage < 0)
            throw new IllegalArgumentException("Extra wage didn't be negative value");
        this.extraWage = extraWage;
    }

    
    public int calculateWage(int extraHour) {
        return baseSalary + (extraHour * extraWage);
    }
    
}

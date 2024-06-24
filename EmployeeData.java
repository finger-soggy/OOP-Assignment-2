
package employeemanagement;

public class EmployeeData {
    private long ID;
    private String name;
    protected double salary;
    protected double bonus;
    protected int targetSales;
    public void EmployeeData() {
        this.ID = 0;
        this.name = "";
        this.salary = 0.0;
        this.bonus = 0.0;
        this.targetSales = 0;
    }
    
    public void setID(long newID) {
        this.ID = newID;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
   
    public void setSalary(double sal) {
        this.salary = sal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public long getID() {
        return this.ID;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public double getBonus() {
        return this.bonus;
    }
    
    public int getTargetSales() {
        return this.targetSales;
    }
    
    public  double finalSalary(double sal, double bon, int target) {
        double ratioSales;
        ratioSales = ((double)target/(double)this.targetSales);
        return sal + bon*ratioSales;
    }
}

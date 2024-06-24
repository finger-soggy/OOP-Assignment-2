package employeemanagement;

public class developer extends EmployeeData{

    public void EmployeeData() {
        this.salary = 5600.00;
        this.bonus = 500;
        this.targetSales = 300;
    }
    
    public  double finalSalary(double sal, double bon, int target) {
        double ratioSales;
        ratioSales = ((double)target/(double)this.targetSales);
        if (target > 900) {
            ratioSales = ratioSales*1.1;
        }
        return sal + bon*ratioSales;
    }
}

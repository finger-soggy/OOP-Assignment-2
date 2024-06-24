
package employeemanagement;

public class salesPerson extends EmployeeData{
    public void EmployeeData() {
        this.salary = 3500.00;
        this.bonus = 1000;
        this.targetSales = 500;
    }
    
    public  double finalSalary(double sal, double bon, int target) {
        double ratioSales;
        ratioSales = ((double)target/(double)this.targetSales);
        if (target > 1000) {
            ratioSales = ratioSales*1.05;
        }
        return sal + bon*ratioSales;
    }
}

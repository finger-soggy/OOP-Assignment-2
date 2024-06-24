
package employeemanagement;

public class systemManager extends EmployeeData {
    public void EmployeeData() {
        this.salary = 8000.00;
        this.bonus = 350.50;
        this.targetSales = 100;
    }
    
    public  double finalSalary(double sal, double bon, int target) {
        double ratioSales;
        ratioSales = ((double)target/(double)this.targetSales);
        if (target > 600) {
            ratioSales = ratioSales*1.025;
        }
        return sal + bon*ratioSales;
    }
}

package employeemanagement;
import java.util.*;

public class EmployeeManagement {
    
    public static void main(String[] args) {
        int sales;
        String name;
        long ID;
        double salaryFinal, totalSalary=0;
        Scanner in = new Scanner(System.in);
        Scanner inString = new Scanner(System.in).useDelimiter("\n");
        EmployeeData[] Employees = new EmployeeData[6];
        Employees[0] = new systemManager();
        Employees[1] = new developer();
        Employees[2] = new developer();
        Employees[3] = new salesPerson();
        Employees[4] = new salesPerson();
        Employees[5] = new salesPerson();
        for (int i=0; i<6; i++) {
            Employees[i].EmployeeData();
        }
        System.out.println(Employees[0].getName());
        for (int i=0; i<6; i++) {
            name = "";
            System.out.println("Please Enter Employee "+ (i+1) + " name: ");
            name += inString.nextLine();
            System.out.println("Please Enter Employee " + (i+1) + " ID: ");
            ID = in.nextLong();
            Employees[i].setName(name);
            Employees[i].setID(ID);
        }
        System.out.println("Please enter the sales of each employee: ");
        for (int i=0; i<6; i++) {
            System.out.println("Sales of employee number " + (i+1) + ": ");
            sales = in.nextInt();
            salaryFinal = Employees[i].finalSalary(Employees[i].getSalary(), Employees[i].getBonus(), sales);
            System.out.println("Name: " + Employees[i].getName());
            System.out.println("ID: " + Employees[i].getID());
            System.out.println("Salary for this employee: RM" + salaryFinal);
            Employees[i].setSalary(salaryFinal);
            totalSalary += salaryFinal;
        }
        
        System.out.println("The total salary for the team is: RM" + totalSalary);
    }

 

 
}

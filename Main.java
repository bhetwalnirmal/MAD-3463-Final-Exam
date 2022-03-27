import Abstracts.Employee;
import Models.*;

import java.util.ArrayList;

public class Main {
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String args[]) {
        fillData();
        viewPayroll();
    }

    public static void fillData(){
        // Add data
        employees.add(new Intern("Bipul", 25, new Car("Toyota", "QA2222", "AQUA", 2010), "Lambton College"));
        employees.add(new Intern("Damkith", 25, null, "Lambton College"));
        employees.add(new FullTime("Amila", 27, new Car("Honda", "HT5568", "Insight", 2007), 3000, 1000));
        employees.add(new CommissionBasedPartTime("Sabin", 25, new Car("Toyota", "AZ8890", "Grace", 2017), 40, 80, 100));
        employees.add(new FixedBasedPartTime("Nirmal", 25, new Motorcycle("Royal Enfield", "MA3489", "Meteor", 2018), 50, 160, 4000));
        employees.add(new FullTime("Namrata", 24, new Car("Toyota", "QA2222", "AQUA", 2019), 4000, 2500));
        employees.add(new CommissionBasedPartTime("Devanshi", 21, new Car("Nissan", "QA2292", "Sunny", 2015), 55, 160, 3000));
        employees.add(new FixedBasedPartTime("Ishara", 27, new Motorcycle("Bajaj", "MA2222", "S679", 2012), 50,80, 3000));
    }

    private static void viewPayroll(){
        double sumOfEarnings = 0;
        for (Employee employee: employees) {
            System.out.print("Name:");
            System.out.println(employee.getName());
            System.out.print("Year of Birth:");
            System.out.println((int)employee.calcBirthYear());
            if (employee.getVehicle() != null){
                employee.getVehicle().printMyData();
            }else{
                System.out.println("Employee has no Vehicle registered");
            }

            employee.printMyData();
            sumOfEarnings += employee.calcEarnings();
            System.out.println("-----------------------------------------------");
        }
        System.out.println("TOTAL PAYROLL: " + sumOfEarnings + " Canadian Dollars");
    }
}

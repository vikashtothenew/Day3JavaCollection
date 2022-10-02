
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ques2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Vikash", 22, 22.0);
        Employee employee2 = new Employee("Prakash", 20, 85.0);
        Employee employee3 = new Employee("Rahul", 21, 90.0);
        Employee employee4 = new Employee("Shivam", 22, 12.0);
        Employee employee5 = new Employee("Srijan", 25, 10.0);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Collections.sort(employeeList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else if (e1.getSalary() == e2.getSalary()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Employess in decreasing order of salary");
        Collections.reverse(employeeList);
        for (Employee e : employeeList) {
            System.out.println(e.getName() + " " + e.getSalary());
        }
    }

}
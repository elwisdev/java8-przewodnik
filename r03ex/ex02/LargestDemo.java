package r03ex.ex02;

import r03ex.Employee;
import r03ex.Mesurable;

public class LargestDemo {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", 50000);
        Employee alice = new Employee("Alice", 60000);
        Employee mark = new Employee("Mark", 70000);
        Employee eric = new Employee("Eric", 80000);
        Employee ann = new Employee("Ann", 90000);
        Employee bill = new Employee("Bill", 100000);
        Mesurable[] employee = new Mesurable[] {fred, alice, mark, eric, ann, bill};
        System.out.println("Largest salary: " + largest(employee));
    }

    public static double largest(Mesurable[] objects){
        double largest = 0;
        for (Mesurable m : objects) {
            Employee e = (Employee) m;
            double salary = e.getSalary();
            if (largest < salary) largest = salary;
        }
        return largest;
    }

}

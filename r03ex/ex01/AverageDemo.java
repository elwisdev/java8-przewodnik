package r03ex.ex01;

import r03ex.Mesurable;
import r03ex.Employee;

public class AverageDemo {
    public static void main(String[] args) {
        Employee fred = new Employee("Fred", 50000);
        Employee alice = new Employee("Alice", 60000);
        Employee mark = new Employee("Mark", 70000);
        Employee eric = new Employee("Eric", 80000);
        Employee ann = new Employee("Ann", 90000);
        Employee bill = new Employee("Bill", 100000);
        //fred.raiseSalary(10);
        Mesurable[] employee;
        employee = new Mesurable[] {fred, alice, mark, eric, ann, bill};
        System.out.println(fred.getName());
        System.out.println(fred.getSalary());
        System.out.println("Average per hour: " + average(employee));
        System.out.println("Average salary: " + averageSalary(employee));
    }

    public static double average(Mesurable[] objects){
        double average = 0;
        for (Mesurable e : objects) {
            average += e.getMesurable();
        }
        average /= objects.length;
        return average;
    }

    public static double averageSalary(Mesurable[] objects){
        double average = 0;
        for (int i = 0; i < objects.length; i++) {
            Employee e  = (Employee) objects[i];
            average += e.getSalary();
        }
        average /= objects.length;
        return average;
    }
}

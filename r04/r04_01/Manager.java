package r04.r04_01;

public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getSalary() { // Przes�ania metod� klasy nadrz�dnej
        return super.getSalary() + bonus;
    }
} 
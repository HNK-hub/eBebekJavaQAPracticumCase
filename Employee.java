public class Employee {
    //Istenilen 4 nitelik
    private String name;
    private double salary; 
    private int workHours;
    private int hireYear;

    // Constructor: Kurucu metot
    // Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre
    // alacaktır.
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //Getter Setter diger sınıfta  okuma ve yazma işlemini yapabilmek için kullanıldı.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return this.hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary < 1000 || salary >0) 
            return salary;
        else
            return salary *0.03;
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;			
		} else {
			return workHours;
		}
    }

    public double raiseSalary()  {
        int totalWorkYear = 2021 - getHireYear();
        if (totalWorkYear > 19) {
            return bonus() + (bonus() * 0.15);
        }
        if (totalWorkYear > 9) {
            return bonus() + (bonus() * 0.10);
        }
        return bonus() + (bonus() * 0.5);
    }

    public double totalSalary() {
        return taxBonusSalary() + raiseSalary();

    }

    public double taxBonusSalary() {
        return salary + bonus() - tax();
    }

    public String toString() {
        return "Employee Name: " + this.name + " Salary: " + this.salary + " Work hours: " + this.workHours
                + " Hire Year: " + this.hireYear;
    }
}

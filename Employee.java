
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
    double a;
    public double tax(){
        if(salary >0  && salary < 1000  ) 
            return 0.0;
        else{
            a =salary * 0.03;
            return a;
        }
    }

    public double bonus() {
        
        if (workHours <= 40) {
            a=0;
            return a;
        }
        else if (workHours > 40) {
            workHours -= 40;
            a = workHours * 30;
            return a;
        }else
            return 0;
    }
    
    public double raiseSalary() {
         int year =2021;
         int workYear = year - hireYear;
        if (workYear < 10 && workYear >= 0) {
            a = salary * 0.05;
			return a;
		} else if (workYear > 9 && workYear < 20) {
            a = salary * 0.1;
			return a;
		} else if (workYear > 19) {
            a = salary * 0.15;
			return a;
		} 
        // double newSalary =(a + salary +bonus()-tax());
        return  a;
    }

    public String toString() {
        System.out.println("Adı: " + getName());
		System.out.println("Maaşı: " + getSalary());
		System.out.println("Çalışma Saati: " + getWorkHours());
		System.out.println("Başlangıç Yılı: " + getHireYear());
		System.out.println("Vergi: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Maaş artışı: " + raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş: " );
		System.out.println("Toplam Maaş: ");

        return "Employee Name: " + this.name + " Salary: " + this.salary + " Work hours: " + this.workHours
                + " Hire Year: " + this.hireYear;
    }
}

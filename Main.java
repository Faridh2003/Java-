// Abstract class → Abstraction
abstract class Person {
    private int id;
    private String name;

    // Encapsulation using setters and getters
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID");
        }
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }

    public String getName() {
        return name;
    }

    abstract double calculateAnnualBenefit();
    abstract void displayDetails();
}

// Inheritance + Polymorphism
class Student extends Person {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
        else {
            System.out.println("Invalid Marks");
        }
    }

    public int getMarks() {
        return marks;
    }

    // Method overriding → Polymorphism
    @Override
    double calculateAnnualBenefit() {
        if (marks >= 90)
            return 50000;   // scholarship
        else if (marks >= 75)
            return 30000;
        else
            return 0;
    }

    @Override
    void displayDetails() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
        System.out.println("Marks: " + marks);
        System.out.println("Scholarship: " + calculateAnnualBenefit());
        System.out.println("----------------------");
    }
}

// Inheritance + Polymorphism
class Teacher extends Person {
    private double monthlySalary;

    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    @Override
    double calculateAnnualBenefit() {
        return monthlySalary * 12;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher ID: " + getId());
        System.out.println("Teacher Name: " + getName());
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + calculateAnnualBenefit());
        System.out.println("----------------------");
    }
}

public class Main {
    static void main(String[] args) {
        Student p1 = new Student();
        p1.setId(101);
        p1.setName("Sneha");
        p1.setMarks(92);

        Teacher p2 = new Teacher();
        p2.setId(201);
        p2.setName("Dr. Sneha");
        p2.setMonthlySalary(50000);

        Person[] people = new Person[2];
        people[0] = p1;
        people[1] = p2;

        for (Person p : people) {
            p.displayDetails();
        }
    }
}

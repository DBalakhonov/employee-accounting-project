package ru.skypro.lessons.springboot.weblibrary;

public class Employee {
    private  int id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id=id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary + '\'' +
                '}';
    }
}

package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager is managing employees");
        setSalary(getSalary() + 5000);
    }

    public void addEmployee(JuniorDeveloper developer) {
        addEmployee(juniorDevelopers, developer);
    }

    public void addEmployee(MidDeveloper developer) {
        addEmployee(midDevelopers, developer);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addEmployee(seniorDevelopers, developer);
    }

    private <T extends Employee> void addEmployee(T[] employees, T employee) {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] == null) {
                employees[index] = employee;
                return;
            }
        }
        System.out.println("No available position for employee");
    }
}
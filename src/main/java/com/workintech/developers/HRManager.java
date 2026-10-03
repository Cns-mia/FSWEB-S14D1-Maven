package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        this(id, name, salary, 10, 10, 10);
    }

    public HRManager(long id, String name, double salary, int juniorCount, int midCount, int seniorCount) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorCount];
        this.midDevelopers = new MidDeveloper[midCount];
        this.seniorDevelopers = new SeniorDeveloper[seniorCount];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to managing employees");
        setSalary(getSalary() * 1.08);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        if (canAdd(juniorDevelopers, index)) {
            juniorDevelopers[index] = developer;
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        if (canAdd(midDevelopers, index)) {
            midDevelopers[index] = developer;
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        if (canAdd(seniorDevelopers, index)) {
            seniorDevelopers[index] = developer;
        }
    }

    private boolean canAdd(Employee[] developers, int index) {
        if (index < 0 || index >= developers.length) {
            System.out.println("Index " + index + " is out of bounds.");
            return false;
        }
        if (developers[index] != null) {
            System.out.println("Index " + index + " is already filled by " + developers[index].getName() + ".");
            return false;
        }
        return true;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}

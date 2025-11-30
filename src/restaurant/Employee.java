package restaurant;

public class Employee extends Person {
    private static int nextSeq = 1;
    private String employeeId;
    private String position;
    private long salary;
    private int hoursWorked;

    public Employee(String name, String phoneNumber, String position, long salary) {
        super(name, phoneNumber);
        this.employeeId = String.format("E%03d", nextSeq++);
        this.position = position;
        this.salary = salary;
        this.hoursWorked = 0;
    }

    public void addHoursWorked(int hours) {
        this.hoursWorked += hours;
    }

    public long calculateSalary() {
        if (this.hoursWorked <= 160) {
            return salary;
        }
        int overtime = this.hoursWorked - 160;
        double overtimeRatio = (overtime / 160.0);
        long overtimePay = (long) (overtimeRatio * (salary * 1.5));
        return salary + overtimePay;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    public long getBaseSalary() {
        return salary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBaseSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "ID: " + employeeId + ", Name: " + getName() + ", Phone: " + getPhoneNumber() + ", Position: " + position + ", HoursWorked: " + hoursWorked;
    }
}

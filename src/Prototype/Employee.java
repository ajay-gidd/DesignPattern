package Prototype;

public class Employee implements Prototype{

    private int employeeId;
    private String name;

    private String phoneNumber;
    private String Address;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    Employee(){}
    public Employee(int employeeId, String name, String phoneNumber, String Address)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Address = Address;


    }

    @Override
    public Prototype clone() {
        return new Employee(employeeId,name,phoneNumber, Address);
    }
}

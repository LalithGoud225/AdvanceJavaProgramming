class Employee implements Cloneable {
    private String id, name, designation;
    private double salary;
    private Address address;
    // this is the normal class file that implemented based on the requirement provided

    public Employee(String id, String name, String designation, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void setSalary(double salary) { this.salary = salary; }
    public void setAddress(Address address) { this.address = address; }

    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nDesignation: " + designation +
                "\nSalary: $" + salary + "\nAddress: " + address + "\n";
    }

    @Override
    protected Employee clone() {
        return new Employee(id, name, designation, salary, address.clone());
    }
}
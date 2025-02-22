class Address implements Cloneable {
    private String street, city, state, zip;
    // here i am using the same Address.class file for both the class files EmployeeManager.java and ResumeManager.java
    // The usage is applicable because we have same attributes that are required for both the class files
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setStreet(String street) { this.street = street; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setZip(String zip) { this.zip = zip; }

    public String toString() {
        return street + ", " + city + ", " + state + " - " + zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return street.equals(address.street) && city.equals(address.city) &&
                state.equals(address.state) && zip.equals(address.zip);
    }

    @Override
    protected Address clone() {
        return new Address(street, city, state, zip);
    }
}
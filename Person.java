public abstract class Person {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected String DOB;
    protected String email;
    protected String phone;
    protected String gender;
    protected String address;

    public Person(String id, String firstName, String lastName, String DOB,
                  String email, String phone, String gender, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void updateInfo() {
    }

    public int getAge() {
        return 0;
    }

    public void displayProfile() {
    }

    private boolean validateInfo() {
        return false;
    }
}

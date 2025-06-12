public abstract class Person {
    protected String id;
    protected String name;
    protected String email;
    protected String phone;
    protected int age;
    protected String gender;
    protected String address;

    public Person(String id, String name, String email, String phone, int age, String gender, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getContactInfo() {
        return name + " - " + email + " - " + phone;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    public void updatePhone(String newPhone) {
        this.phone = newPhone;
    }

    public void updateAddress(String newAddress) {
        this.address = newAddress;
    }

    public void updateAllInfo(String newName, String newEmail, String newPhone, int newAge, String newGender, String newAddress) {
        this.name = newName;
        this.email = newEmail;
        this.phone = newPhone;
        this.age = newAge;
        this.gender = newGender;
        this.address = newAddress;
    }

    public String generateBirthdayGreeting() {
        return "Happy Birthday, " + name + "!";
    }

    public boolean isAdult() {
        return age >= 18;
    }
}

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

    public String getFullName() {
        return "";
    }

    public void updateInfo() {}

    public int getAge() {return 0;}

    public void displayProfile() {}

    private boolean  validateInfo() {
        return false;
    }
}

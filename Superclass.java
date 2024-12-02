package jdbc22;

public abstract class Superclass {
    protected String name;
    protected String id;
    protected double grade;
    protected int age;
    protected String address;

    public Superclass(String name, String id, double grade, int age, String address) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.age = age;
        this.address = address;
    }

    public abstract boolean isPassed(double grade);

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade +
               ", Age: " + age + ", Address: " + address;
    }
}

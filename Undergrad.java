package jdbc22;


public class Undergrad extends Superclass implements PassCriteria {

    public Undergrad(String name, String id, double grade, int age, String address) {
        super(name, id, grade, age, address);
    }

    @Override
    public boolean isPassed(double grade) {
        return grade >= UNDERGRAD_PASS_MARK;
    }
}

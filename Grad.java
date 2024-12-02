package jdbc22;

public class Grad extends Superclass implements PassCriteria {

    public Grad(String name, String id, double grade, int age, String address) {
        super(name, id, grade, age, address);
    }

    @Override
    public boolean isPassed(double grade) {
        return grade >= GRAD_PASS_MARK;
    }
}

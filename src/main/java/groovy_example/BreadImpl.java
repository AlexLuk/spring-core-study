package groovy_example;

public class BreadImpl implements Bread {
    public BreadImpl() {
        System.out.println("I'm bread");
    }

    @Override
    public void slice() {
        System.out.println("I was cut");
    }
}

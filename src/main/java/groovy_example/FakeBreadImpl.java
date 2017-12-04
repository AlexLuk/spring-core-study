package groovy_example;

public class FakeBreadImpl implements Bread {
    public FakeBreadImpl() {
        System.out.println("I'm fake bread");
    }

    @Override
    public void slice() {
        System.out.println("It's impossible to slice me!");
    }
}

import javax.inject.Inject;

public class Foo {

    @Inject
    Bar bar;

    @Inject
    public Foo() {}

    public void print() {
        System.out.println("bar = " + bar);
    }

    public void setBar(String other) {
        bar.setName(other);
    }
}

public class Solution {

    public static void main(String[] args) {
        BazComponent component = DaggerBazComponent.create();
        Foo foo = component.getBar();
        foo.print();
        foo.setBar("foo");
        Foo foo2 = component.getBar();
        foo2.print();
    }
}

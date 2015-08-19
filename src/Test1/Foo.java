package Test1;

/**
 * Created by Java Developer on 17.08.2015.
 */
public class Foo {
    @Test1(a=1, b=5)
    public void sum(int a, int b) {
        System.out.println("Sum method: " + (a+b));
    }

    @Test1(a=4, b=6)
    public void multipl(int a, int b) {
        System.out.println("Multiply method: " + (a*b));
    }

}

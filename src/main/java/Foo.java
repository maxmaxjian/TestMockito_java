public class Foo {

    private static final String STR = "string";
    private static final String CONST_STR = String.format("const.%s", STR);

    public Foo() {}

    public void print() {
        foo();
    }

    void foo() {
        System.out.println(CONST_STR);
    }
}

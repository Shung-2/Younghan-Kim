package nested.test;

import nested.Inner.ex2.Hello;

public class AnonymousMain {
    public static void main(String[] args) {

        Hello hello = new Hello() {

            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        hello.hello();
    }
}

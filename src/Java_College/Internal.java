package Java_College;

public class Internal {

    public interface IF {

        void fun1();

        default void fun2() {
            System.out.println("fun2 called :)");
        }

    }

    public static void main(String[] args) {

        IF i = new IF() {
            @Override
            public void fun1() {
                System.out.println("fun1 called :)");
            }

            @Override
            public void fun2() {
                System.out.println("fun2 called :):)");
            }

        };

        i.fun1();
        i.fun2();

    }

}

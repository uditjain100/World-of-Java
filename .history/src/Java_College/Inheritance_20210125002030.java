package Java_College;

public class Inheritance {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.fun1();
        p.fun2();

        c.fun1();
        c.fun2();

        Parent parent = new Child();

        parent.fun1();
        parent.fun2();

        Child child = new Parent();

        child.fun1();
        child.fun2();

    }

    public static class Parent {

        public void fun1() {
            System.out.println("Parent :: fun1 Called !!");
        }

        public static void fun2() {
            System.out.println("Parent :: fun2 Called !!");
        }

    }

    public static class Child extends Parent {

        @Override
        public void fun1() {
            System.out.println("Child :: fun1 Called !!");
        }

        public static void fun2() {
            System.out.println("Child :: fun2 Called !!");
        }

    }

}

package Java_College;

import java.lang.ref.Reference;

public class Inheritance {

    public static void main(String[] args) {

        // Ststic => Reference
        // Non Static => Instance

        Parent p = new Parent();
        p.fun1();
        p.fun2();

        Child c = new Child();
        c.fun1();
        c.fun2();

        Parent parent = new Child();
        parent.fun1();
        parent.fun2();

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

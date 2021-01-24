package Java_College;

public class Inheritance {

    public static void main(String[] args) {

        Parent p = new Parent();

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

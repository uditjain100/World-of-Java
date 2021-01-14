package First;

public class Inheritance {

    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }

    public static class Parent {

        static {
            System.out.println("Parent : Static IB Called");
        }

        {
            System.out.println("Parent : IB Called");
        }

        public Parent() {
            System.out.println("Parent : Constructor Called");
        }

        public void fun() {
            System.out.println("Parent : fun Called");
        }

    }

    public static class Child extends Parent {

        static {
            System.out.println("Child : Static IB Called");
        }

        {
            System.out.println("Child : IB Called");
        }

        public Child() {
            System.out.println("Child : Constructor Called");
        }

        @Override
        public void fun() {
            super.fun();
            System.out.println("Child : fun Called");
        }

    }

}

package First;

public class Generics {

    public static void main(String[] args) {

        Parent<A> pA = new Parent<A>(new A());
        Parent<B> pB = new Parent<B>(new B());
        Parent<C> pC = new Parent<C>(new C());

        pA.fun();
        pA.object.display_01();
        pA.object.display_02();
        pA.object.fun();

        pB.fun();
        pB.object.display_01();
        pB.object.display_02();
        pB.object.fun();

        pC.fun();
        pC.object.display_01();
        pC.object.display_02();
        pC.object.fun();

    }

    public static class Parent<T extends A & INTERFACE & INTERFACE_02> {

        T object;

        public Parent(T object) {
            this.object = object;
        }

        public void fun() {
            System.out.println("Parent : fun Called");
        }
    }

    public static interface INTERFACE {
        void display_01();
    }

    public static interface INTERFACE_02 {
        void display_02();
    }

    public static class A implements INTERFACE, INTERFACE_02 {
        public void fun() {
            System.out.println("A : fun Called");
        }

        @Override
        public void display_01() {
            System.out.println("A : Interface _ 01 display Called");
        }

        @Override
        public void display_02() {
            System.out.println("A : Interface _ 02 display Called");
        }
    }

    public static class B extends A {
        @Override
        public void fun() {
            System.out.println("B : fun Called");
        }

        @Override
        public void display_01() {
            System.out.println("B : Interface _ 01 display Called");
        }

        @Override
        public void display_02() {
            System.out.println("B : Interface _ 02 display Called");
        }
    }

    public static class C extends A {
        @Override
        public void fun() {
            System.out.println("C : fun Called");
        }

        @Override
        public void display_01() {
            System.out.println("C : Interface _ 01 display Called");
        }

        @Override
        public void display_02() {
            System.out.println("C : Interface _ 02 display Called");
        }
    }

}

package Java_College;

import java.util.ArrayList;

public class Lab_04 {

    public static void main(String[] args) {

        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(0, 0, 5.0));
        list.add(new Circle(0, 2, 2.8));
        list.add(new Circle(3, 5, 1.6));
        list.add(new Circle(8, 9, 3.9));
        list.add(new Circle(0, 5, 25.0));
        list.add(new Circle(-1, 0, 5.0));
        list.add(new Circle(33, 2, 6.8));
        list.add(new Circle(3, 7, 1.9));
        list.add(new Circle(3, 9, 3.9));
        list.add(new Circle(0, 58, 2.0));

        for (Circle c : list)
            c.display();

        // Person p = new Person("Anupam", 21, 30000);
        // p.display();
        // p.setName("Anupam Sharma");
        // p.display();

        // Triangle t = new Triangle();
        // t.area(10, 20);

        // Rectangle r = new Rectangle();
        // r.area(5, 15);

    }

    public static class DynamicStack extends Stack {
        @Override
        public void push(int data) throws Exception {
            if (isFull()) {
                int[] old_array = arr;
                int[] new_array = new int[2 * old_array.length];
                for (int i = 0; i < arr.length; i++)
                    new_array[i] = old_array[i];
                arr = new_array;
            }
            super.push(data);
        }
    }

    public static class Circle {

        private int centre_x;
        private int centre_y;
        private double radius;
        private int instance_num;

        public static int count = 0;

        public Circle() {
            this.centre_x = 0;
            this.centre_y = 0;
            this.radius = 5.0;
            this.instance_num = ++count;
        }

        public Circle(int x, int y, Double radius) {
            this.centre_x = x;
            this.centre_y = y;
            this.radius = radius;
            this.instance_num = ++count;
        }

        public void display() {
            System.out.println("Centre of the Circle " + this.instance_num + " is : [" + this.centre_x + " , "
                    + this.centre_y + "]");
            System.out.println("Radius of the Circle " + this.instance_num + " is : " + this.radius);
        }

    }

    public static class Person {

        private String Name;
        private int age;
        private int salary;

        private Person(String name, int age, int salary) {
            this.Name = name;
            this.age = age;
            this.salary = salary;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void display() {
            System.out.println("Name of the person is : " + this.Name);
            System.out.println("Age of the person is : " + this.age);
            System.out.println("Salary of the person is : " + this.salary);
        }
    }

}

interface Shape {
    public void area(int a, int b);
}

class Triangle implements Shape {
    public void area(int l, int b) {
        System.out.println("Area of Triangle : " + ((double) ((0.5) * l * b)));
    }
}

class Rectangle implements Shape {
    public void area(int l, int b) {
        System.out.println("Area of Rectangle : " + (l * b));
    }
}

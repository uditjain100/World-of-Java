package Java_College;

public class Lab_05 {

    public static void main(String[] args) {

        // Student student = new Student("Raman", 55896);
        // Subject subject = new Subject("Maths", "ETMH285");

        // student.displayDetails();
        // subject.displayDetails();

        // Box box = new Box(1.2, 1.5, 1.6);
        // BoxVolume boxVolume = new BoxVolume(1.2, 1.5, 1.6);
        // Shipment boxShipment = new Shipment(1.2, 1.5, 1.6, 100000.56);

        // box.display();
        // boxVolume.displayVolume();
        // boxShipment.displayCost();

        Trio trio = new Trio();
        trio.display();

    }

    // Overriding

    public static class Student {

        private String name;
        private int rollno;

        public Student() {
            this.name = "NULL";
            this.rollno = -1;
        }

        public Student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        public void displayDetails() {
            System.out.println("Student Name : " + this.name + ", Student Roll Number : " + this.rollno);
        }
    }

    public static class Subject extends Student {

        private String name;
        private String code;

        public Subject() {
            this.name = "NULL";
            this.code = "NULL";
        }

        public Subject(String name, String code) {
            this.name = name;
            this.code = code;
        }

        @Override
        public void displayDetails() {
            System.out.println("Subject Name : " + this.name + ", Subject Code : " + this.code);
        }

    }

    // super keyword

    public static class Box {

        double length;
        double width;
        double height;

        public Box() {
            this.length = 0.0;
            this.width = 0.0;
            this.height = 0.0;
        }

        public Box(double l, double w, double h) {
            this.length = l;
            this.width = w;
            this.height = h;
        }

        public void display() {
            System.out.println("Box Dimensions are : ");
            System.out.println("Length : " + this.length);
            System.out.println("Width : " + this.width);
            System.out.println("Height : " + this.height);
        }

    }

    public static class BoxVolume extends Box {

        double volume;

        public BoxVolume() {
            super();
            this.volume = 0.0;
        }

        public BoxVolume(double l, double w, double h) {
            super(l, w, h);
            this.volume = l * w * h;
        }

        public void displayVolume() {
            super.display();
            System.out.println("Volume : " + this.volume);
        }

    }

    public static class Shipment extends BoxVolume {

        private double cost;

        public Shipment() {
            super();
            this.cost = 0.0;
        }

        public Shipment(double l, double w, double h, double cost) {
            super(l, w, h);
            this.cost = cost;
        }

        public void displayCost() {
            super.displayVolume();
            System.out.println("Shipment Cost : " + this.cost);
        }

    }

    // Interface
    
    public interface Shape {
        String name = "Triangle";

        public void fun();
    }

    public interface Color {
        String name = "Blue";
    }

    public interface Triangle extends Shape, Color {
        public void display();
    }

    public static class Trio implements Triangle {

        public Trio() {

        }

        @Override
        public void fun() {
            System.out.println("Fun function called");
        }

        @Override
        public void display() {
            System.out.println("Shape Name : " + Shape.name + ", Shape Color : " + Color.name);
        }

    }

}

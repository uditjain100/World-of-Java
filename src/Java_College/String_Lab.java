package Java_College;

public class String_Lab {

    public static void main(String[] args) {

        // hello();

        // ascii('A');
        // ascii('+');
        // ascii('z');
        // ascii('&');

        // Primes(5);

        // charToString('c');

        // stringToChar("Hello there!!");

        // perimeter(10, 20);
        // perimeter(10, 20, 30);
    }

    // Perimeer of Rectangle
    public static void perimeter(int length, int bredth) {
        System.out.println("Perimeter of Rectangle : " + (2 * (length + bredth)));
    }

    // Perimeer of Triangle
    public static void perimeter(int side1, int side2, int side3) {
        System.out.println("Perimeter of Triangle : " + (side1 + side2 + side3));
    }

    public static void hello() {
        System.out.println("Hello World");
    }

    public static void ascii(char ch) {
        System.out.println(ch + " : " + (int) ch);
    }

    public static void Primes(int n) {
        System.out.print("2, ");
        n--;
        for (int i = 3; n > 0; i++) {
            if (isPrime(i)) {
                n--;
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void charToString(char ch) {
        System.out.println(Character.toString(ch));
    }

    public static void stringToChar(String str) {
        for (char ch : str.toCharArray())
            System.out.print(ch + ", ");
        System.out.println();
    }

}
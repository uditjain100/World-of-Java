package Java_College;

import java.util.PriorityQueue;

public class College {

    public static void main(String[] args) {

        // Scanner scn = new Scanner(new InputStreamReader(System.in));
        // System.out.println("Answer : " + Calculator(1, 6, '+'));
        // System.out.println(isPrime(13));
        // System.out.println("Is Armstrong : " + armstrong(153));
        // System.out.println("isPalindrome : " + isPalindrome("nitin"));
        // fibonnaci(5);
        // System.out.println("Factorial : " + fac(5));
        // compareObjects();
    }

    public static void compareObjects() {
        // PriorityQueue<Demo> pq = new PriorityQueue<>(new demoComparator());
        PriorityQueue<Demo> pq = new PriorityQueue<>((b, a) -> {
            return a.str.length() - b.str.length();
        });
        pq.add(new Demo("Rakesh"));
        pq.add(new Demo("Ram"));
        pq.add(new Demo("Rama"));
        pq.add(new Demo("Nidhi"));
        pq.add(new Demo("Sami"));
        pq.add(new Demo("Sharma"));
        while (!pq.isEmpty())
            System.out.println(pq.remove().str);
    }

    public static int Calculator(int a, int b, char op) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else {
            if (b != 0)
                return a / b;
            else
                System.out.println("ERROR");
        }
        return -1;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean armstrong(int n) {
        int num = n;
        int nn = 0;
        while (num != 0) {
            nn += (int) Math.pow(num % 10, 3);
            num /= 10;
        }
        if (n == nn)
            return true;
        return false;

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--))
                return false;
        }
        return true;
    }

    public static void fibonnaci(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        for (int ele : dp)
            System.out.print(ele + ", ");
        System.out.println();
    }

    public static int fac(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

}

// class demoComparator implements Comparator<Demo> {
// @Override
// public int compare(Demo d1, Demo d2) {
// return d2.str.length() - d1.str.length();
// }
// }

class Demo {
    String str;

    public Demo(String str) {
        this.str = str;
    }
}

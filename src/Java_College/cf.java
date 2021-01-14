package Java_College;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class cf {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scn.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(fun(scn.nextInt(), scn.nextLine()));

    }

    public static String fun(int n, String str) {
        str.replace(')', '&');
        System.out.println(str);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == '&')
                count++;
            else
                break;
        }
        System.out.println(count);
        if (count > n - count)
            return "YES";
        return "NO";
    }

}
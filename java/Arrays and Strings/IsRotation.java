import java.util.*;
import java.lang.*;
import java.io.*;

class IsRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length()) {
            String newString = s1 + s1;
            return newString.contains(s2);
        }
        return false;
    }
}

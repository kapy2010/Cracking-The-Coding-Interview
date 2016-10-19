import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2) {
        int char_set[] = new int[256];

        for (int i = 0; i < str1.length(); i++)
            char_set[(int) str1.charAt(i)]++;

        for (int i = 0; i < str2.length(); i++) {
            if (char_set[(int) str2.charAt(i)] > 0)
                char_set[(int) str2.charAt(i)]--;
            else
                char_set[(int) str2.charAt(i)]++;
        }

        int sum = 0;
        for (int i = 0; i < 256; i++) sum += char_set[i];

        if (sum ==0) return true;

        return false;
    }
}

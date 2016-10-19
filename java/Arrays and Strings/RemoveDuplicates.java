import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char charArr[] = str.toCharArray();
        System.out.println(removeDuplicates2(charArr));
    }

    public static char[] removeDuplicates(char[] str) {
        if (str == null) return null;
        if (str.length == 2) return str;

        Arrays.sort(str);

        int in_index = 1;
        int res_index = 1;

        while (in_index < str.length) {
            if (str[in_index] != str[in_index - 1]) {
                str[res_index] = str[in_index];
                res_index++;
            }

            in_index++;
        }
        return Arrays.copyOfRange(str, 0, res_index);
    }

    public static char[] removeDuplicates2(char[] str) {
        if (str == null) return null;
        if (str.length == 2) return str;

        boolean char_set[] = new boolean[256];

        int in_index = 0;
        int res_index = 0;

        while (in_index < str.length) {
            if (!char_set[(int)str[in_index]]) {
                char_set[(int)str[in_index]] = true;
                str[res_index] = str[in_index];
                res_index++;
            }
            in_index++;
        }
        return Arrays.copyOfRange(str, 0, res_index);
    }
}

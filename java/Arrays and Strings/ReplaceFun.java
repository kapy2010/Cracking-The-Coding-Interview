import java.util.*;
import java.lang.*;
import java.io.*;

class ReplaceFun {
    public static void main(String[] args) {
        char str[] = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', ' ', ' '};
        replaceFun(str, 11);
        System.out.println(str);
    }

    public static void replaceFun(char[] str, int length) {
        int spaceCount = 0, newLength;
        for (int i = 0; i < length; i++) {
            if (str[i] == ' ')
                spaceCount++;
        }
        newLength = length + spaceCount * 2;

        for (int i = length - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[newLength - 1] = '0';
                str[newLength - 2] = '2';
                str[newLength - 3] = '%';
                newLength -= 3;
            } else {
                str[newLength-1] = str[i];
                newLength -= 1;
            }
        }
    }
}

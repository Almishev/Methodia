package com.methodia.academy;

public class ReverseArray {

    public static void main(String[] args) {
        String str = "Anton Almishev";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }

        return new String(charArray);
    }
}

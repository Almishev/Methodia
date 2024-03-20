package com.methodia.academy;

import java.util.ArrayList;
import java.util.Arrays;

public class Iteration {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anton", "Gosho", "Vasko", "Marya"));

        iterationWithForLoop(list);
        System.out.println();
        iterationWithWhileLoop(list);
    }

    public static void iterationWithForLoop(ArrayList<String> list) {
        System.out.println("With FOR loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void iterationWithWhileLoop(ArrayList<String> list) {
        System.out.println("WHILE loop:");
        int j = 0;
        while (j < list.size()) {
            System.out.print(list.get(j));
            if (j < list.size() - 1) {
                System.out.print(", ");
            }
            j++;
        }
    }
}

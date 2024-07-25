package org.example;

public class numbericPattern {
    public static void numberpattern(int n, int m) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    //here i am using the same variable which will incremented till 9

//   123
//   456
//   789
    public static void numberpattern_KEYPAD() {
        int n=1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(n++);
            }
            System.out.println();
        }
    }
}

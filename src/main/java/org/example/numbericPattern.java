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
        int n = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(n++);
            }
            System.out.println();
        }
    }

    public static void number_pattern_mix(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int j = 2; j < i * 2; j++) {
                System.out.print("*");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void number_pattern_circle(int n) {
        int w=0;
        int t = 0;
//        int l=n;
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > n - i; j--) { //5
                System.out.print(j);
                t = j;
            }
            for (int j = 1; j < (t * 2) - 1; j++) {
                System.out.print(t);
            }

            for (int j = t + 1; j <= n; j++) {
                System.out.print(j);
                w=t;
            }

            System.out.println();
        }
t=0;
     for (int i = 1; i <n-1; i++) {

        for (int j = n; j >w; j--) { //5
            System.out.print(j);
            t=j;
        }
        for (int j = 1; j < (t*2) - 1; j++) {
            System.out.print(t);
        }

        for (int j = t+1; j <=n; j++) {
            System.out.print(j);
        }
w++;
        System.out.println();
    }
}
// 543222345
// 543333345
}

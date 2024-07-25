package org.example;

public class starPattern {
    public void starPatter_1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starpatterm_2(int n)
    {
        int m=n;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >0; j--) {
                System.out.print(" ");
            }
            m--;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void starpatter_3(int n)
    {
        int m=0;
        for (int i = 0; i < n; i++) {
            for (int j = m; j >0; j--) {
                System.out.print(" ");
            }
            m++;
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

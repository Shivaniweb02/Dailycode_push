package org.example;

public class AlphabeticalPattern {
    public static void alphabets(){
        char C='A';
        for(int i=0;i<26;i++)
        {
            System.out.print((char)(C+i)+" ");
        }
    }
    public static void aplha_pattern(int n)
    {
        char C='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char)(C+i)+" ");
            }
            System.out.println();
        }
    }

    public static void aplha_pattern_triangle(int n)
    {
        char C='A';
        for (int i = 0; i < n; i++) {
            for (int j = i; j >=0; j--) {
                System.out.print((char)(C+i)+" ");
            }
            System.out.println();
        }
    }

    public static void aplha_pattern_triangle_increment(int n)
    {
        char C='A';
        int m=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >=0; j--) {
                if(m>=26)
                {
                    System.out.print("- ");
                }
                else
                System.out.print((char)(C+m)+" ");
                m++;
            }

            System.out.println();
        }
    }
}

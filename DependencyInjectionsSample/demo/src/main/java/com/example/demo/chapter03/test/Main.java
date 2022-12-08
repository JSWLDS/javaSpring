package com.example.demo.chapter03.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num;i++)
        {
            for (int j=0; j<num;j++ )
            {
                if(i<=num/2)
                {
                    if (i+j<=num/2-1)
                        System.out.printf("     ");
                    else if(j-i>=num/2+1)
                        System.out.printf("     ");
                    else
                        System.out.printf("[%dx%d]",i,j);
                }
                else if(i>num/2)
                {
                    if(i-j>=num/2+1)
                        System.out.printf("     ");
                    else if(i+j>=num/2*3+1)
                        System.out.printf("     ");
                    else
                        System.out.printf("[%dx%d]",i,j);
                }
            }
            System.out.println();
        }
    }
}
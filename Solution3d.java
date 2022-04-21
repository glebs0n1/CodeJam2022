package com.company;

import java.util.Scanner;
import java.lang.*;

public class Solution3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int ar[][] = new int[3][4];
            for (int y = 0; y < 3; y++) {
                ar[y][0] = sc.nextInt();
                ar[y][1] = sc.nextInt();
                ar[y][2] = sc.nextInt();
                ar[y][3] = sc.nextInt();
            }
            System.out.print("Case #"+x+":  ");

            int answer[] = new int[4];
            int sum=0;
            for (int y = 0; y < 4; y++) {
                answer[y] = Math.min(Math.min(ar[0][y], ar[1][y]) , ar[2][y]);
                sum+=answer[y];
            }
            if(sum<1000000)
                System.out.print("IMPOSSIBLE");
            else{
                sum=1000000;
                int y;
                for(y=0;y<4;y++) {
                    if (sum - answer[y] < 0) {
                        System.out.print(sum + " ");
                        break;
                    }
                    else {
                        System.out.print(answer[y] + " ");
                        sum -= answer[y];
                    }
                }
                y++;
                for(;y<4;y++)
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
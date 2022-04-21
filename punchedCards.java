package com.company;

import java.util.Scanner;


public class punchedCards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=1;x<=t;x++){
            int r=sc.nextInt();
            int c=sc.nextInt();
            System.out.println("Case #"+x);
            period(r,c);
        }

    }
    public static void period(int r,int c){
        String per="+";
        String code="|";
        for(int x=1;x<=c;x++){
            per=per+"-+";
            code=code+".|";

        }
        System.out.println(".."+per.substring(2));
        System.out.println(".."+code.substring(2));
        for(int x=1;x<r;x++){
            System.out.println(per);
            System.out.println(code);
        }
        System.out.println(per);
    }
}
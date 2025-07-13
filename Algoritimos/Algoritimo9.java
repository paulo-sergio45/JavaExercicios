package Algoritimos;

import java.util.Scanner;

public class Algoritimo9 {
    public  void algoritimo9(){
        Scanner scan = new Scanner(System.in);
        double N,C=0,P,R=0,S;

        while(C!=10){ C++;
            System.out.println("salario");
            P=scan.nextDouble();
            R=R+P;

        }
        N=R/C;
        System.out.println("media " +N);
        System.out.println("total " +R);


    }}

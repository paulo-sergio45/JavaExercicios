package Algoritimos;

import java.util.Scanner;

public class Algoritimo7 {
    public  void algoritimo7(){
        Scanner scan = new Scanner(System.in);
        double N=1,C=0,NR,D=101,R=0,CC=0,G=1,H;
        // System.out.println("quantidade");
        // H=scan.nextDouble();

        while(C!=20){
            D=D-1;
            C++;
            G=C;
            G=G-1;
            CC=C;
            N=CC*N;
            NR=D/N;
            R=R+NR;
            System.out.println(   D + " / " +C  +"  =  "+NR );

        }  System.out.println("valor de Soma e = "+R); }}

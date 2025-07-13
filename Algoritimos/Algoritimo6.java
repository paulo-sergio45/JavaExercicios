package Algoritimos;

import java.util.Scanner;

public class Algoritimo6 {
    public  void algoritimo6(){
        Scanner scan = new Scanner(System.in);
        double N,C=0,NR,D=1,R=0;
        System.out.println("N");
        N=scan.nextDouble();
        while(C!=N){
            C++;
            NR=D/C;
            R=R+NR;
            System.out.println(   D + " / " +C  +"  =  "+NR );
        }  System.out.println("valor de S e ="+R); }}

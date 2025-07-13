package Algoritimos;

import java.util.Scanner;

public class Algoritimo5 {



    public  void algoritimo5(){
        Scanner scan = new Scanner(System.in);
        double N,D,R=0,H,C=0,CR=-1;
        while(C!=50){
            CR=CR+2;

            C++;
            H=C/CR;
            R=R+H;

            System.out.println(   CR + " / " +C  +"  =  "+H );
        }  System.out.println("valor de S e ="+R); }}

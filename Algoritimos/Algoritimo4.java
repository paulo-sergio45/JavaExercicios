package Algoritimos;

import java.util.Scanner;

public class Algoritimo4 {



    public  void algoritimo4(){
        Scanner scan = new Scanner(System.in);
        double N,D,R=0,S,C=0,CR=62;
        while(C!=30){
            C++;
            CR=CR-2;

            S=C/CR;

            R=R+S;

            System.out.println(   CR + " / " +C  +"  =  "+S  );
        }  System.out.println("valor de S e ="+R); }}

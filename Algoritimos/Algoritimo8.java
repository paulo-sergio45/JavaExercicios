package Algoritimos;

import java.util.Scanner;

public class Algoritimo8 {
    public  void algoritimo8(){
        Scanner scan = new Scanner(System.in);
        double N,C=0,P,R=0,B=0,A=0;

        while(C!=10){ C++;
            System.out.println("altura");
            P=scan.nextDouble();
            R=R+P;
            if(P<1.30){ B++;  }
            if(P>1.60){ A++;  }
        }
        N=R/C;
        System.out.println("media " +N);
        System.out.println("menores 1,30 " +B);
        System.out.println("maiores 1,60 " +A);

    }}

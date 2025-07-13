package Algoritimos;

import java.util.Scanner;

public class Algoritimo2 {


    public  void algoritimo2(){
        Scanner scan = new Scanner(System.in);
        int M,N,R,C=0;
        System.out.println("multiplicando ");
        M=scan.nextInt();
        System.out.println("multiplicandor ");
        N=scan.nextInt();

        do{ C++;

            R=C*N;
            System.out.println("resutado =" +C+"*"+N+"="+R);
        }while(M!=C);

    }}

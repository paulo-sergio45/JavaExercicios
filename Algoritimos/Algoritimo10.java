package Algoritimos;

import java.util.Scanner;

public class Algoritimo10 {
    public  void algoritimo10(){
        Scanner scan = new Scanner(System.in);
        int N,C=0,R,CC=0,P=0;
        System.out.println("quantidade");
        N=scan.nextInt();
        do{

            CC=0;  P=0;
            C++;

            for(;N!=CC;){CC++;
                R=C%CC;
                //  System.out.println("respo"+R+"="+C+"%"+CC);

                if(R==0){ P=P+1; }

            }if(P==2){System.out.println("primo"+C);}

        }while(N!=C); }}

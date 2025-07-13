package Exercicios;

import java.util.Scanner;

public class  Exercicio2 {
    public  void exercicio2(){
        Scanner scan=new Scanner(System.in);

        int vet[]={10,2,3,4,5,6,7,8,9,1};
        int M=0,N=10;
        for(M=0;M<10;M++){
            System.out.print("V"+vet[M]);  }
        System.out.println();
        for(M=10-1;M>=0;M--){
            System.out.print("R"+vet[M]);}
    }}

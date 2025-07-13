package Exercicios;

import java.util.Scanner;

public class  Exercicio1 {
    public  void exercicio1( ) {
        Scanner scan=new Scanner(System.in);
        int vet[]= {6,0,-1,-3,1,2,1};
        int I,S=0,N=0;
        for(I=0;I<7;I++){
            if(vet[I]<0){ vet[I]=0;  }
            System.out.print(""+vet[I]);
            if(vet[I]>0){ S=vet[I]+S;}
            else{N++;}
        }
        System.out.print("  Soma "+S);
        System.out.println(" numeros N"+N);
    }}

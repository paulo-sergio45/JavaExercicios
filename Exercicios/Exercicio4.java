package Exercicios;

import java.util.Scanner;

public class  Exercicio4 {
    public  void exercicio4(){
        Scanner scan=new Scanner(System.in);

        int vet01[]={9,8,7,6,5,4,3,2,1};
        int vet02[]={1,2,3,4,5,6,7,8,9};
        int vet03[]=new int[30];
        int V01,V02,V03,A=1;
        for(V01=0,V03=0;V01<9;V01++,V03=V03+2){ System.out.print(""+vet01[V01]); vet03[V03]=vet01[V01]; }

        System.out.println("");

        for(V02=0,V03=1;V02<9;V02++,V03=V03+2){ System.out.print(""+vet02[V02]); vet03[V03]=vet02[V02]; }

        System.out.println("");
        for(V03=0;V03<20;V03++){  System.out.print(""+vet03[V03]);  }
    }}

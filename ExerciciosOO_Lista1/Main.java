package ExerciciosOO_Lista1;

import ExerciciosOO_Lista1.Exercicio01.*;
import ExerciciosOO_Lista1.Exercicio2.Ponto;
import ExerciciosOO_Lista1.Exercicio3.Circulo;

public class Main {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		c.setRaio(10);
		System.out.printf("Area = %.2f\n",c.Area());
		System.out.printf("Comp. = %.2f\n",c.Comprimento());
		

	
	/* Exercicio 2 */
	  Ponto p1 = new Ponto();
		p1.AtualizarCoodernadas(0, 0);
		
		Ponto p2 = new Ponto();
		p2.AtualizarCoodernadas(10, 10);
		
		double d = p2.Distancia(p1);
		
		System.out.printf("P1(%.2f,%.2f)\n",p1.CoordenadaX(),p1.CoordenadaY());
		System.out.printf("P2(%.2f,%.2f)\n",p2.CoordenadaX(),p2.CoordenadaY());
		System.out.printf("d=%.2f\n",d);

	
	/* Exercicio 1 */
	 	Conta cc;
		cc = new Conta();
		
		System.out.println(cc.VerificarSaldo());
		cc.Depositar(100);
		System.out.println(cc.VerificarSaldo());
		cc.Sacar(45.50);
		System.out.println(cc.VerificarSaldo());
		cc.Sacar(2000);
		System.out.println(cc.VerificarSaldo());

}
}

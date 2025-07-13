package ExerciciosOO_Lista1.Exercicio3;

public class Circulo {
	private double r;
	
	public void setRaio(double raio){
		this.r = raio;
	}
	
	public double Area(){
		return Math.PI*r*r;
	}
	
	public double Comprimento(){
		return 2*r*Math.PI;
	}
}

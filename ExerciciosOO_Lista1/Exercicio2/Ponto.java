package ExerciciosOO_Lista1.Exercicio2;

public class Ponto {
	private double x,y;
	
	public void AtualizarCoodernadas(double X,double Y){
		this.x = X;
		this.y = Y;
	}
	
	public double CoordenadaX(){
		return this.x;
	}
	
	public double CoordenadaY(){
		return this.y;
	}
	
	public double Distancia(Ponto p){
		double dx = this.x - p.CoordenadaX();
		double dy = this.y - p.CoordenadaY();
		
		return Math.sqrt(dx*dx + dy*dy);
	}
}

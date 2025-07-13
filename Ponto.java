public class Ponto {
	private double x,y;
	
	public Ponto(){
		x = 0;
		y = 0;
	}
	
	public Ponto(double X, double Y){
		this.x = X;
		this.y = Y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void Print(){
		System.out.printf("[%.2f,%.2f]",this.x,this.y);
	}

	public boolean Equal(Ponto outro) {
		return this.x == outro.x && this.y == outro.y;
	}

}

public class Complexo {
	private double parteReal, parteImaginaria;

	private double getParteReal() {
		return parteReal;
	}

	private void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}

	private double getParteImaginaria() {
		return parteImaginaria;
	}

	private void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
	public Complexo(double real,double imaginario){
		this.parteReal = real;
		this.parteImaginaria = imaginario;
	}
	
	public Complexo(){
		this.parteReal = 0;
		this.parteImaginaria = 0;
	}
	
	public Complexo Soma(Complexo numero){
		double somaReal = this.parteReal + numero.getParteReal();
		double somaImaginario = this.parteImaginaria + numero.getParteImaginaria();
		return new Complexo(somaReal,somaImaginario);
	}
	
	public Complexo Subtracao(Complexo numero){
		double Real = this.parteReal - numero.getParteReal();
		double Imaginario = this.parteImaginaria - numero.getParteImaginaria();
		return new Complexo(Real,Imaginario);
	}
	
	public String toString(){
		return this.parteReal + (this.parteImaginaria < 0 ? " - " : " + ") + Math.abs(this.parteImaginaria)+"i";
	}
	
	
	
}

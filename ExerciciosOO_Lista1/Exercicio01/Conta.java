package ExerciciosOO_Lista1.Exercicio01;

public class Conta {
	private double saldo;
	private double limite = 1000;
	
	public void Depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public void Sacar(double valor){
		if ((saldo-valor) + limite < 0){
			System.out.println("Saldo insuficiente!");
		}else{
			saldo = saldo - valor;
		}
	}
	
	public double VerificarSaldo(){
		return saldo + limite;
	}
}

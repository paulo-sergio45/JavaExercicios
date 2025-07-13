
public class Aluno {
	private String nome, matricula;
	private double[] notas;
	private int index = 0;
	
	public Aluno(int quantidadeNotas){
		notas = new double[quantidadeNotas];
	}
	
	public void AddNota(double nota){
		if (index + 1 > notas.length-1){
			System.out.println("Numero máximo de notas informado");
			return;
		}
		notas[index]=nota;
		index++;
	}

	public double Media(){
		double soma = 0;
		for(int i=0;i<notas.length;i++){
			soma = soma + notas[i];
		}
		return soma/notas.length;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void Print(){
		System.out.println(this.matricula + " " + 
	                       this.nome + " " + this.Media());
	}
	
}


public class Date {
	private int dia,mes,ano;
	
	public Date(int Dia, int Mes,int Ano){
		dia = -1;
		mes = -1;
		ano = -1;
		
		if (Dia >= 1 && Dia <= NumDias(Mes,Ano)){
			this.dia = Dia;
			this.mes = Mes;
			this.ano = Ano;
		}
	}
	
	public String toString(){
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
	
	public Date NextDay(){
		int numMax = NumDias(this.mes,this.ano);
		
		if (this.dia + 1 > numMax){
			this.dia = 1;
			if (this.mes+1 > 12){
				this.mes = 1;
				this.ano++;
			}
			else{
				this.mes++;
			}
		}else{
			this.dia++;
		}
		
		return new Date(this.dia,this.mes,this.ano);
	}
	
	private int NumDias(int Mes,int Ano){
		int numDays = 0;
		switch (Mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				numDays = 30;
				break;
			case 2:
				if (((Ano%4==0) && !(Ano%100== 0)) || (Ano % 400 == 0))
					numDays = 29;
				else
					numDays = 28;
				break;
		default:
			numDays = 0;
			break;
		}
		return numDays;
	}
}

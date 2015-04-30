//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
public class Aviao{
	private String modelo;
	private Assento primClasse[], economico[];
	private int horario;

	public Aviao(String m, int qnt, int h){
		modelo = m;
		this.defineAssentos(qnt);
		horario = h;
	}
	public void defineAssentos(int qnt){
		int num_ec = (qnt*70)/100;;
		int num_pC = (qnt*30)/100;
		primClasse[] = new Assento(num_pC);
		economico[] = new Assento(num_ec);
	}
	public String getModelo(){
		return modelo;
	}

	public int getQntAssentPC(){
		return (primClasse.length);
	}

	public int getQntAssentEc(){
		return (economico.length);
	}

	public int getTotalAssentos(){
		return (economico.lenght+primClasse.length);
	}

	public int getHorario(){
		return horario;
	}

	public void setModelo(String m){
		modelo = m;
	}

	public void setAssentoEc(int i, Assento e){
		economico[i] = e;
	}

	public void setAssentoPC(int i, Assento pc){
		primClasse[i] = pc;
	}

	public void setHorario(int h){
		horario = h;
	}
}
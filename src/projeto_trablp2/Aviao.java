//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
public class Aviao{
	private String modelo;
	private Assentos primClasse[], economico[];
	private int horario;

	public Aviao(String m, int qnt, int h){
		modelo = m;
		this.defineAssentos(qnt);
		horario = h;
	}
	public void defineAssentos(int qnt){
		int num_ec;
		int num_pC;
		num_pC = (qnt*30)/100;
		num_ec = (qnt*70)/100;
		primClasse[] = new Assentos(num_pC);
		economico[] = new Assentos(num_ec);
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

	public void setAssento(int i, Assento a){
		assentos[i] = s;
	}

	public void setHorario(int h){
		horario = h;
	}
}
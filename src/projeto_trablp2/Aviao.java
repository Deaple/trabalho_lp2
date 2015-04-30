//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
public class Aviao{
	private String modelo;
	private Assentos assentos[];
	private int horario;

	public Aviao(String m, int qnt, int h){
		modelo = m;
		assentos[] = new Assentos(qnt);
		horario = h;
	}

	public String getModelo(){
		return modelo;
	}

	public Assentos getAssento(int i){
		return assentos[i];
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
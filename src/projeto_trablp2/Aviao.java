//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
import java.util.Scanner;
public class Aviao{
	private String modelo;
	private String destino;
	private Assento[] primClasse;
	private Assento[] economico;
	private int horario;
	private int num_ass_ec;
	private int	num_ass_pc;

	public Aviao(){
		System.out.println("****CADASTRO DE AVIAO****");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o modelo: ");
		modelo = entrada.nextLine();
		System.out.println("Digite o destino: ");
		destino = entrada.nextLine();
		System.out.println("Quantidade de assentos: ");
		this.defineAssentos(entrada.nextInt());
		System.out.println("Horario de voo: ");
		horario = entrada.nextInt();
	}

	public Aviao(String m, String d, int qnt, int h){
		modelo = m;
		destino = d;
		this.defineAssentos(qnt);
		horario = h;
		num_ass_ec = 0;
		num_ass_pc = 0;
	}

	public int getTotalAssentPrimClass(){
		return num_ass_pc;
	}

	public int getTotalAssentEconomico(){
		return num_ass_ec;
	}

	public void defineAssentos(int qnt){
		//define 70% da quantidadde para assentos economicos e 30% para os de primeira classe
		int num_ec = (qnt*70)/100;;
		int num_pC = (qnt*30)/100;
		primClasse = new Assento[num_pC];
		economico = new Assento[num_ec];
	}
	public void ocupaAssEc(int i){
		economico[i] = new Assento(true);
		num_ass_ec++;
	}

	public void ocupaAssPC(int i){
		primClasse[i] = new Assento(true);
		num_ass_pc++;
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
		return (economico.length+primClasse.length);
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
	public String getDestino(){
		return destino;
	}
}
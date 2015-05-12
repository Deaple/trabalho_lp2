//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
import java.util.Scanner;
public class Aviao{
	private String modelo;
	private String destino;
	private boolean[] primClasse;
	private boolean[] economico;
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
		entrada.nextLine();
	}

	public Aviao(String m, String d, int qnt, int h){
		modelo = m;
		destino = d;
		this.defineAssentos(qnt);
		horario = h;
		num_ass_ec = 0;
		num_ass_pc = 0;
	}

	public void defineAssentos(int qnt){
		//define 70% da quantidadde para assentos economicos e 30% para os de primeira classe
		int num_ec = (qnt*70)/100;;
		int num_pC = (qnt*30)/100;
		primClasse = new boolean[num_pC];
		economico = new boolean[num_ec];
	}

	public void ocupaAssEc(){
		if(num_ass_ec<=economico.length-1){
			economico[num_ass_ec++] = true; //ocupa um assento
		} else {
			System.out.println("Nao ha mais assentos economicos");
			return;
		}
	}

	public void ocupaAssPC(){
		if(num_ass_pc<=primClasse.length-1){
			primClasse[num_ass_pc++] = true; //ocupa um assento
		} else {
			System.out.println("Nao ha mais assentos de primeira classe");
			return;
		}	
	}

	public int getEconomicosOcp(){
		return num_ass_ec;
	}

	public int getPrimClassOcp(){
		return num_ass_pc;
	}

	public String getModelo(){
		return modelo;
	}

	public String getDestino(){
		return destino;
	}

	public int getHorario(){
		return horario;
	}
}
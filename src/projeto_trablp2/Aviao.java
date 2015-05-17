//nome do modelo e quantidade de assentos, horario de voo(cliente escolhe seu horario), destino   
package projeto_trablp2;
import java.util.Scanner;
public class Aviao{
	private String modelo;
	private String destino;
	private boolean[] primClasse;
	private boolean[] economico;
	private String horario;
	private int num_ass_ec;
	private int	num_ass_pc;

	public Aviao(){
		System.out.println("****CADASTRO DE AVIAO****");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o modelo: ");
		modelo = entrada.next();
		System.out.println("Digite o destino: ");
		destino = entrada.next();
		System.out.println("Quantidade de assentos: ");
		this.defineAssentos(entrada.nextInt());
		System.out.println("Horario de voo: ");
		horario = entrada.next();
		entrada.nextLine();
	}

	public Aviao(String m, String d, int qnt, String h){
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
		economico[num_ass_ec++] = true; //ocupa um assento
	}

	public void ocupaAssPC(){
		primClasse[num_ass_pc++] = true; //ocupa um assento
	}

	public boolean assentoDisponivel(String tipo){ //verifica se ha assento do tipo solicitado disponivel
		boolean resp = false;
		System.out.println("Total economico: "+economico.length+" Total Primeira Classe: "+primClasse.length+"\nOcupados Economico: "+num_ass_ec+"\nOcupados Prim Classe: "+num_ass_pc);
		if((tipo.equals("economico"))&&(economico.length!=num_ass_ec))
				resp = true;
		else if((tipo.equals("primeira classe"))&&(primClasse.length!=num_ass_pc))
				resp = true;
		return resp;	
	}

	public int getAssentos(){
		return (primClasse.length+economico.length);
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

	public String getHorario(){
		return horario;
	}
}
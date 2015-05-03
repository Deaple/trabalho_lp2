package projeto_trablp2;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resp = 0;
		//teste
		Aviao[] avioes = new Aviao[5];
		Cliente[] clientes = new Cliente[5];
		int cont_av = 0, cont_c = 0;

		while(resp!=5){
			System.out.println("Cadastratr aviao - 1");
			System.out.println("Cadastratr cliente - 2");
			System.out.println("Verificar horario dos voos - 3");
			System.out.println("Verificar clientes cadastrados - 4");
			System.out.println("Sair - 5");
			resp = entrada.nextInt();
			switch(resp){
				case 1:
					avioes[cont_av] = new Aviao();
					cont_av++; 
				break;
				case 2:
					clientes[cont_c] = new Cliente();
					cont_c++;
				break;
				case 3:
					if(cont_av==0)
						System.out.println("Nao ha avioes cadastrados!");
					else
						for (int i=0;i<cont_av ;i++ ) {
						System.out.printf("Modelo: %s \nDestino: %s\n Horario: %i\n\n",
							avioes[i].getModelo(),avioes[i].getDestino(),avioes[i].getHorario());
						}
				break;
				case 4:
					if(cont_c==0)
						System.out.println("Nao ha clientes cadastrados!");
					else	
						for(int i=0;i<cont_c;i++){
							System.out.printf("Nome: %s \nRG: %i\n Destino: %s\n\n",
								clientes[i].getNome(),clientes[i].getRg(),clientes[i].getDestino());
						}
				break;
				case 5: System.exit(0);
				default: System.out.println("Opcao invalida! Escolha novamente:");
				break;
			}
		}
	}
}
	
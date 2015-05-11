package projeto_trablp2;			
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resp = 0, horario;
		String destino, assento;
		//vetor apenas para teste
		Aviao[] avioes = new Aviao[5];
		Cliente[] clientes = new Cliente[5];
		int cont_av = 0, cont_c = 0;

		while(resp!=5){
			System.out.println("Cadastratr aviao - 1");
			System.out.println("Cadastratr cliente - 2");
			System.out.println("Verificar horario dos voos - 3");
			System.out.println("Verificar clientes cadastrados - 4"); //função incompleta
			System.out.println("Sair - 5");
			resp = entrada.nextInt();
			switch(resp){
				case 1:
					avioes[cont_av] = new Aviao();
					cont_av++; 
				break;

				case 2:
					if(cont_av==0)
						System.out.println("Nao ha avioes cadastados! Impossivel cadastrar cliente!");
					else{
						entrada.nextLine();
						System.out.println("Digite o horario:");
						horario = entrada.nextInt();
						entrada.nextLine();
						System.out.println("Digite o destino:");
						destino = entrada.nextLine();
						System.out.println("Digite o tipo de assento:");
						assento = entrada.nextLine();
						for(int i=0;i<cont_av;i++){
							if(destino.equals(avioes[i].getDestino())){
								System.out.println("ok");	
								break;
							} else 
								if(i==cont_av-1)
									System.out.println("Destino indisponivel");	
						}		
					}
				break;

				case 3:
					if(cont_av==0)
						System.out.println("Nao ha avioes cadastrados!");
					else{
						for (int i=0;i<cont_av;i++ ) {
						System.out.printf("Modelo: %s\nDestino: %s\nHorario: %d\n",
							avioes[i].getModelo(),avioes[i].getDestino(),avioes[i].getHorario());
						}
						System.out.println();
					}	
				break;

				case 4:
					if(cont_c==0)
						System.out.println("Nao ha clientes cadastrados!");
					else	
						for(int i=0;i<cont_c;i++){
							System.out.printf("Nome: %s \nRG: %d\n Destino: %s\n\n",
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
	
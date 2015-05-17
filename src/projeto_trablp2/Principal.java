package projeto_trablp2;			
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resp = 0;
		final int tam_avioes = 10;
		final int tam_clientes = 20;
		String destino, assento, horario,horarios_voos="";
		Aviao[] avioes = new Aviao[tam_avioes];
		Cliente[] clientes = new Cliente[tam_clientes];
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
					if(cont_av<tam_avioes){
						avioes[cont_av] = new Aviao();
						cont_av++; 
					}
					else
						System.out.println("Limite maximo de avioes cadastrados");	
				break;

				case 2:
					if(cont_av==0)
						System.out.println("Nao ha avioes cadastados! Impossivel cadastrar cliente!");
					else if(cont_c<tam_clientes){
						entrada.nextLine();
						System.out.println("Digite o destino:");
						destino = entrada.nextLine();
						System.out.println("Digite o tipo de assento(economico/primeira classe):");
						assento = entrada.nextLine();
						if(!(assento.equals("economico")||assento.equals("primeira classe"))){//se assento nao for igual a economico ou primeira classe
							System.out.println("O tipo "+assento+" de assento nao existe");
							horarios_voos="";//limpa horario voos
							break;//volta pro menu
						}
						for(int i=0;i<cont_av;i++){
							if(destino.equals(avioes[i].getDestino()))//verifica se há o destino requisitado
								horarios_voos += avioes[i].getHorario()+'\n';//preenche o horarios_voos com os horarios do "destino"
							else if((i==cont_av-1)&&(horarios_voos=="")) //se estiver na ultima posicao do aviao e nao houver preenchimento de horario_voos
									System.out.println("Destino indisponivel");	
						}
						if(horarios_voos!=""){//se horario_voos foi preenchido com algum valor
							System.out.println("Horarios disponiveis para "+destino+"\n"+horarios_voos+"\nEscolha um horario: ");
							horario = entrada.nextLine();//le um horario para checa-lo
							for(int i=0;i<cont_av;i++){
								if((horario.equals(avioes[i].getHorario()))&&(destino.equals(avioes[i].getDestino()))){ //se o horario e destinos escolhidos existitem em avioes[]
									if(avioes[i].assentoDisponivel(assento)){ //metodo que verifica se ha assento disponiveis do tipo requisitado, se nao houver mostra uma mensagem e volta pro menu
										clientes[cont_c] = new Cliente(destino,horario,assento);
										if(assento.equals("economico"))
											avioes[i].ocupaAssEc(); //ocupa assento economico
										else if(assento.equals("primeira classe"))
												avioes[i].ocupaAssPC(); //ocupa assento primeira classe
										System.out.println("Seu assento foi registrado com sucesso!");
										cont_c++; 
										horarios_voos =""; //limpa a variavel de horarios
										break; //sai do loop ao encontrar o destino
									} else {
										System.out.println("Nao ha mais assentos disponiveis para "+assento);
										horarios_voos="";
										break;
									}	
								} 
								else 
									if(i==cont_av-1){ //se chegar na ultima posicao do vetor e o horario/destino nao existirem, entao o horario é invalido(pq o destino ja foi checado anteriormente)
										System.out.println("Horario informado invalido.");	
										horarios_voos =""; //"limpa" a variavel
								  	}	
							}
						}
						
					}
					else 
						System.out.println("Capacidade maxima de clientes atingida!");
				break;

				case 3:
					if(cont_av==0)
						System.out.println("Nao ha avioes cadastrados!");
					else{
						System.out.println("\n\nAvioes: \nCadastrados: "+cont_av+" Quantidade maxima: "+avioes.length+"\n");
						for (int i=0;i<cont_av;i++ ) {
						System.out.printf(" Modelo: %s\n Destino: %s\n Horario: %s\n Assentos ocupados: \n  Economicos: %d\n  Prim Classe: %d\n Total Assentos: %d\n\n",
							avioes[i].getModelo(),avioes[i].getDestino(),avioes[i].getHorario(),avioes[i].getEconomicosOcp(), avioes[i].getPrimClassOcp(), avioes[i].getAssentos());
						}
						System.out.println();
					}	
				break;

				case 4:
					if(cont_c==0)
						System.out.println("Nao ha clientes cadastrados!");
					else{
						System.out.println("\n\nClientes: \nCadastrados: "+cont_c+"Quantidade maxima: "+clientes.length);	
						for(int i=0;i<cont_c;i++){
							System.out.printf(" Nome: %s \n RG: %s\n CPF: %s\n Destino: %s\n Telefone: %d\n Horario: %s\n Tipo Assento: %s\n\n",
								clientes[i].getNome(),clientes[i].getRg(),clientes[i].getCpf(),clientes[i].getDestino(),clientes[i].getTel(),clientes[i].getHorario(),clientes[i].getTipoAssent());
						}
					}	
				break;

				case 5: System.exit(0);

				default: System.out.println("Opcao invalida! Escolha novamente:");
				break;
			}
		}
	}
}
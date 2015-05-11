package projeto_trablp2;
import java.util.Scanner;
/**
 * @author André Sobreira
 */
public class Cliente {
    private String nome;
    private double rg;
    private double cpf;
    private int datanasc;
    private int horario;
    private double tel;
    private String destino;
    private String assento;

    public Cliente(int horario, String destino, String assento){
        Scanner in=new Scanner(System.in);
        System.out.println("****CADASTRO DE CLIENTES****");
        System.out.println("Digite o nome:");
        nome=in.next();
        System.out.println("Digite o RG:");
        rg=in.nextDouble();
        System.out.println("Digite o CPF:");
        cpf=in.nextDouble();
        System.out.println("Digite a data de nascimento(dia/mes/ano):");
        datanasc=in.nextInt();
        System.out.println("Digite o telefone de contato:");
        tel=in.nextDouble();
        this.horario = horario;
        this.destino = destino;
        this.assento = assento;
        in.nextLine();
        //System.out.println("Digite o destino:");
        //Destino ira ser selecionado no main, pois só cadastraremos o cliente se ele tiver um destino definido.
}
    public Cliente(String nome, double rg, double cpf, int datanasc, double tel, String destino){
        this.nome=nome;
        this.rg=rg;
        this.cpf=cpf;
        this.datanasc=datanasc;
        this.tel=tel;
        this.destino=destino;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public double getTel() {
        return tel;
    }
    public String getDestino() {
        return destino;
    }
    public String getNome() {
        return nome;
    }
    public double getRg() {
        return rg;
    }
    public double getCpf() {
        return cpf;
    }
    public int getDatanasc() {
        return datanasc;
    }
}

package projeto_trablp2;
import java.util.Scanner;
/**
 * @author André Sobreira
 */
public class Cliente {
    private String nome;
    private int rg;
    private int cpf;
    private int datanasc;
    private int tel;
    private String destino;
    
    public Cliente(String destino){
        Scanner in=new Scanner(System.in);
        System.out.println("****CADASTRO DE CLIENTES****");
        System.out.println("Digite o nome:");
        nome=in.next();
        System.out.println("Digite o RG:");
        rg=in.nextInt();
        System.out.println("Digite o CPF:");
        cpf=in.nextInt();
        System.out.println("Digite a data de nascimento(dia/mes/ano):");
        datanasc=in.nextInt();
        System.out.println("Digite o telefone de contato:");
        tel=in.nextInt();
        this.destino = destino;
        //System.out.println("Digite o destino:");
    }

    public Cliente(String nome, int rg, int cpf, int datanasc, int tel, String destino){
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
    public int getTel() {
        return tel;
    }
    public String getDestino() {
        return destino;
    }
    public String getNome() {
        return nome;
    }
    public int getRg() {
        return rg;
    }
    public int getCpf() {
        return cpf;
    }
    public int getDatanasc() {
        return datanasc;
    }
}

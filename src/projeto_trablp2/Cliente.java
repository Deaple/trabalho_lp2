package projeto_trablp2;
import java.util.Scanner;
/**
 * @author André Sobreira
 */
public class Cliente {
    private String nome;
    private String rg;
    private String cpf;
    private int datanasc;
    private int tel;
    private String destino;
    private String horario;
    private String tipo_assento;
    
    public Cliente(String destino, String horario, String tipo_assento){
        Scanner in=new Scanner(System.in);
        System.out.println("****CADASTRO DE CLIENTES****");
        System.out.println("Digite o nome:");
        nome=in.next();
        System.out.println("Digite o RG:");
        rg=in.next();
        System.out.println("Digite o CPF:");
        cpf=in.next();
        System.out.println("Digite a data de nascimento(dia/mes/ano):");
        datanasc=in.nextInt();
        System.out.println("Digite o telefone de contato:");
        tel=in.nextInt();
        this.destino = destino;
        this.horario = horario;
        this.tipo_assento = tipo_assento;
        //System.out.println("Digite o destino:");
    }

    public Cliente(String nome, String rg, String cpf, int datanasc, int tel, String destino, String horario, String tipo_assento){
        this.nome=nome;
        this.rg=rg;
        this.cpf=cpf;
        this.datanasc=datanasc;
        this.tel=tel;
        this.destino=destino;
        this.horario = horario;
        this.tipo_assento = tipo_assento;
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
    public String getRg() {
        return rg;
    }
    public String getCpf() {
        return cpf;
    }
    public int getDatanasc() {
        return datanasc;
    }

    public String getTipoAssent(){
        return tipo_assento;
    }
    public String getHorario(){
        return horario;
    }
}

package projeto_trablp2;

/**
 * @author André Sobreira
 * tipo do assento(classe), Controle de assentos(disponivel ou vendido)
 */
public class Assento {
    private boolean status;
    
    public Assento(){
        status=false;
    }

    public void ocupaAssento(boolean status){
    	this.status = status;
    }

    public boolean getStatus(){
    	return status;
    }
}

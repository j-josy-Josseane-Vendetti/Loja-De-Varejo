import java.time.LocalDateTime;

public class Vendedor{
    private String nome;
    private String telefone;
    private Float comissao;
 
    
//Getters
public String getNome(){
    return this.nome;
}
public String getTelefone(){
    return this.telefone;
}
public Float getComissao(){
    return this.comissao;
}

//Setters

public void setTelefone(String telefone){
    this.telefone = telefone;
    }
public void setComissao(Float comissao){
    this.comissao = comissao;
    }
  }

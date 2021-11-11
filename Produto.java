import java.time.LocalDate; 
    public class Produto {
    private String descricao;
    private Long codigoDeBarra;
    private  Float precoUnitario;
    private Short quantidade;
    private String unidadeDeMedida;
    private LocalDate dataDeFabricacao;
    private LocalDate dataDeValidade;
    public Fornecedor fornecedor;
    
//Getters

public String getDescricao(){
    return this.descricao;  
}

public Long getCodigoDeBarra(){
    return this.codigoDeBarra;
}
public Float getPrecoUnitario(){
    return this.precoUnitario;
}
public Short getQuantidade(){
    return this.quantidade;
}
public String getUnidadeDeMedida(){
    return this.unidadeDeMedida;
}
public LocalDate getDateDeFabricacaO(){
    return this.dataDeFabricacao;
}
public LocalDate getDateDeValidade(){
    return this.dataDeValidade;
}
public Fornecedor getFornecedor(){
    return this.fornecedor;
}

//Setters
public void setDescricao(String descricao){
    this.descricao = descricao;
}
public void setQuantidade(Short quantidade){
    this.quantidade = quantidade;
}
public void setPrecoUnitario(Float precoUnitario){
    this.precoUnitario = precoUnitario;

}


}

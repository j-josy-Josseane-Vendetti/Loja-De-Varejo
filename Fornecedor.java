
import java.time.LocalDate;


public class Fornecedor {

     private String  nomeFantasia;
     private String razaoSocial;
     private String CNPJ;
     private String telefone;
     private String pessoaDeContato;

     //Getters
     public String getNomeFantasia(){
         return this.nomeFantasia;
     }
     public String getRazaoSocial(){
         return this.razaoSocial;
            
     }

     public String getCNPJ(){
         return this.CNPJ;
     }

     public String getTelefone(){
         return this.telefone;
     }

     public String getPessoaDeContato(){
         return this.pessoaDeContato;
     }

     // Setters
     public  void setNomeFantasia(String nomeFantasia){
         this.nomeFantasia = nomeFantasia;
     }

     public void setTelefone(String telefone){
         this.telefone = telefone;
     }
    public void setPessoaDeContato(String pessoaDeContato){
        this.pessoaDeContato = pessoaDeContato;
    }


 }


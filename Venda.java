import java.time.LocalTime;

public class Venda {
    private Float valor; 
    private LocalTime horario;
    private Short codigo;
    private Cliente cliente;

    
   //Getters
   public Float getValor(){
       return this.valor;
   } 
   public LocalTime gethorario(){
       return this.horario;
   }
   
   
   public Short getCodigo(){
       return this.codigo;
   }
   public Cliente getCliente(){
       return this.cliente;      
     
    }
       //Setters
        public Void setValor (Float valor){
            this.valor = valor;
            return null;

    } 



}


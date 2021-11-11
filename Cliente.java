import java.time.LocalDate;
import java.time.Month;


public class App {
    
    public static void main (String[]args){
        Cliente claudia = new Cliente();
        //claudia.nome = "Claudia Bernardes";
        //claudia.rg ="99999";
        //claudia.cpf = "888888";
        //claudia.dataDeNascimento = LocalDate.of(1970, Month.FEBRUATY, 23);
        //claudia.email = "claudia@gmail.com";
        //claudia.telefone = "(51) 9999-9999";

     Cliente paulo = new Cliente();

        //paulo.nome = "Paulo de Souza";
        //paulo.rg = "55555555";
        //paulo.cpf = "666666";
        //paulo.dataDeNascimento = LocalDate.of(1971, Month.Julho, 12);
        //paulo.email = "paulo@gmail.com";
        //paulo.telefone = "(51) 8888-8888";


        claudia.setEmail ("claudia@gmail.com");
        claudia.setTelefone ("(51) 9999-9999");


        paulo.setEmail ("paulo@gmail.com");
        paulo.setTelefone ("(51) 8888-8888");


        Produto produto1 = new Produto();
        produto1.setDescricao("Trakinas de banana");
        produto1.setPrecoUnitario(3.40f);
         System.out.println(produto1.getDescricao());

    }

}

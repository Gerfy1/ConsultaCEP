import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner buscado = new Scanner(System.in);
        ConsultarCep consultacep = new ConsultarCep();
        List<Endereco> enderecos = new ArrayList<>();
        String condicao = "sim";


        while (condicao.equalsIgnoreCase("Sim")) {
        System.out.println("Digite o CEP desejado para realizar a consulta de endereço:");
        String cep = buscado.nextLine();
        try {
            Endereco novoEndereco = consultacep.buscaCEP(cep);
            System.out.println(novoEndereco);
            GerandoJson gerar = new GerandoJson();
            enderecos.add(novoEndereco);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a consulta.\nVerifique se o CEP está correto!");
        }
        System.out.println("Iniciar uma nova consulta?");
        condicao = buscado.nextLine();
        }
        GerandoJson gerar = new GerandoJson();
        gerar.gerarJson(enderecos);
        buscado.close();
    }
}

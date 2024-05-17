import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner buscado = new Scanner(System.in);
        ConsultarCep consultacep = new ConsultarCep();

        System.out.println("Digite o CEP desejada para realizar a consulta de endereço:");
        String cep = buscado.nextLine();
        try {
            Endereco novoEndereco = consultacep.buscaCEP(cep);
            System.out.println(novoEndereco);
            GerandoJson gerar = new GerandoJson();
            gerar.gerarJson(novoEndereco);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao realizar a consulta.\nVerifique se o CEP está correto!");
        }

    }
}
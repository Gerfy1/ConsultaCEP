import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner cep = new Scanner(System.in);
        String buscador = "";

        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        FileWriter CepSerializado = new FileWriter("Ceps.json");
        while (!buscador.equalsIgnoreCase("sair")) {
            System.out.println("Digite o CEP desejado para realizar a busca ou digite 'Sair':");
            buscador = cep.nextLine();
            if (buscador.equalsIgnoreCase("sair")) {
                break;
            }
            String enderecoAPICep = "https://viacep.com.br/ws/" + buscador + "/json/";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(enderecoAPICep))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                Cep cepformat = gson.fromJson(json, Cep.class);
                System.out.println(cepformat);
                CepSerializado.write(gson.toJson(cepformat) + "\n");
            } catch (Exception e) {
                System.out.println("Não encontrado!");
                System.out.println("Verifique se o CEP digitado é valido!");
            }
        }
        CepSerializado.close();
    }
}
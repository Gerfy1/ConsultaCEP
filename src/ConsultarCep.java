import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCep {

    public Endereco buscaCEP(String cep) {
        URI enderecoAPICep = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(enderecoAPICep)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            System.out.println("Não encontrado!");
            System.out.println("Verifique se o CEP digitado é valido!");
        }
        return null;
    }
}


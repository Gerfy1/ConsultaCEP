import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GerandoJson {
    public void gerarJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter registro = new FileWriter("CepsConsultados.json");
        registro.write(gson.toJson(endereco));
        registro.close();
    }
}

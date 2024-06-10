import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GerandoJson {
    public void gerarJson(List<Endereco> enderecos) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter registro = new FileWriter("CepsConsultados.json");
        registro.write(gson.toJson(enderecos));
        registro.close();
    }
}

package com.aluracursos.screenmatch.modelos;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersistenciaDatos {

    public void guardarTitulos(List<Titulo> titulos, Gson gson) throws IOException {
        String jsonParaGuardar = gson.toJson(titulos);

        // El nombre del archivo puede ser un parámetro o una constante.
        try (FileWriter escritura = new FileWriter("titulos.json")) {
            escritura.write(jsonParaGuardar);
        } // El 'try-with-resources' asegura que 'escritura.close()' se llame automáticamente.
    }
}
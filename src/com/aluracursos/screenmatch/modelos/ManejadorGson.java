package com.aluracursos.screenmatch.modelos;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class ManejadorGson {

    public Gson obtenerGson() {
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
    }

    public String convertirAJson(List<Titulo> titulos, Gson gson) {
        return gson.toJson(titulos);
    }
}
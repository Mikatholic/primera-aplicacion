package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class AdministradorGson {
    public Gson obtenerGson(){
    return new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();
    }
    public String convertirAJson(List<Titulo> titulos)
}

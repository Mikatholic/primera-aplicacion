package com.aluracursos.screenmatch.modelos;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaPeliculas {
    private static final String API_KEY = "ba29c8e"; // Mantenemos la clave en un lugar centralizado.
    private static final String BASE_URL = "https://www.omdbapi.com/?t=";

    public String buscarTitulo(String nombre) throws IOException, InterruptedException {
        String direccion = BASE_URL + nombre + "&apikey=" + API_KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
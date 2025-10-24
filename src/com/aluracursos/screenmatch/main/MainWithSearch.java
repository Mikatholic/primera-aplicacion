package com.aluracursos.screenmatch.main;

import java.net.http.HttpClient;

public class MainWithSearch {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://foo.com/"))
                .build();
    }
}

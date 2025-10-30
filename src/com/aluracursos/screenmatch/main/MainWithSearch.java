package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.aluracursos.screenmatch.modelos.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        // 1. Inicialización de Clases
        ManejadorGson manejadorGson = new ManejadorGson();
        Gson gson = manejadorGson.obtenerGson();
        BusquedaPeliculas buscador = new BusquedaPeliculas();
        PersistenciaDatos persistencia = new PersistenciaDatos();

        while (true) {
            System.out.println("Escriba el nombre de una pelicula: ");
            var nombreBusqueda = lectura.nextLine(); // Es mejor usar nextLine() para películas con espacios

            if (nombreBusqueda.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                // 2. Uso del Buscador
                String json = buscador.buscarTitulo(nombreBusqueda);
                System.out.println("Respuesta de la API:\n" + json);

                // 3. Conversión del JSON (usando las clases TituloOmdb y Titulo)
                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Título convertido a Modelo: " + miTitulo);

                titulos.add(miTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Ocurrió un error en el formato de un número: " + e.getMessage());
            } catch (ErrorEnConversionDeDuracionException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) { // Captura otros errores como I/O o conexión
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        // 4. Persistencia de Datos
        System.out.println("\nLista de títulos guardados:\n" + titulos);
        try {
            persistencia.guardarTitulos(titulos, gson);
            System.out.println("Los títulos se han guardado en 'titulos.json' exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        System.out.println("Finalizó la ejecución del programa");
    }
}
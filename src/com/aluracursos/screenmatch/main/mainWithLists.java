package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class mainWithLists {
    public static void main(String[] args) {


        Pelicula matrix1 = new Pelicula("Matrix", 1999);
        var matrix2 = new Pelicula("Matrix Recargado", 2003);
        var matrix3 = new Pelicula("Matrix Revoluciones", 2003);
        Serie howIMeetYourMother = new Serie("How I meet your mother", 2005);

        ArrayList<Pelicula> lista = new ArrayList<>();
        lista.add(matrix1);
        lista.add(matrix2);
        lista.add(matrix3);
    }
}

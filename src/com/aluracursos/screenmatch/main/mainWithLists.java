package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class mainWithLists {
    public static void main(String[] args) {


        Pelicula matrix1 = new Pelicula("Matrix", 1999);
        matrix1.evalua(9);
        var matrix2 = new Pelicula("Matrix Recargado", 2003);
        matrix2.evalua(7);
        var matrix3 = new Pelicula("Matrix Revoluciones", 2003);
        matrix3.evalua(10);
        Serie howIMeetYourMother = new Serie("How I meet your mother", 2005);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(matrix1);
        lista.add(matrix2);
        lista.add(matrix3);
        lista.add(howIMeetYourMother);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula){
                Pelicula pelicula = (Pelicula)item;
                System.out.println(pelicula.getClasificacion());
            }

        }
    }
}

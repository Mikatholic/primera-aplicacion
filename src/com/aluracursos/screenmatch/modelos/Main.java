package com.aluracursos.screenmatch.modelos;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix1 = new Pelicula();
        matrix1.nombre = "Matrix";
        matrix1.duracionEnMinutos = 131;
        matrix1.fechaDeLanzamiento = 1999;

        matrix1.muestraFichaTecnica();
        matrix1.evalua(8.9);
        matrix1.evalua(10);

        System.out.println(matrix1.getTotalDeLasEvaluaciones());
        System.out.println(matrix1.calculaMedia());

//        com.aluracursos.screenmatch.modelos.Pelicula matrix2 = new com.aluracursos.screenmatch.modelos.Pelicula();
//        matrix2.nombre = "Matrix Recargado";
//        matrix2.duracionEnMinutos = 138;
//        matrix2.fechaDeLanzamiento = 2003;
//
//       matrix2.muestraFichaTecnica();
    }
}
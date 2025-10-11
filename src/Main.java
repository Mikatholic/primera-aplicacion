public class Main {
    public static void main(String[] args) {
        Pelicula matrix1 = new Pelicula();
        matrix1.nombre = "Matrix";
        matrix1.duracionEnMinutos = 131;
        matrix1.fechaDeLanzamiento = 1999;

        matrix1.muestraFichaTecnica();

        Pelicula matrix2 = new Pelicula();
        matrix2.nombre = "Matrix Recargado";
        matrix2.duracionEnMinutos = 138;
        matrix2.fechaDeLanzamiento = 2003;

        matrix2.muestraFichaTecnica();
    }
}
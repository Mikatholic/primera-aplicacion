public class Main {
    public static void main(String[] args) {
        Pelicula matrix1 = new Pelicula();
        matrix1.nombre = "Matrix";
        matrix1.duracionEnMinutos = 131;
        matrix1.fechaDeLanzamiento = 1999;

        System.out.println("La pelicula es: " + matrix1.nombre);
        System.out.println("El tiempo de duración es: " + matrix1.duracionEnMinutos);
        System.out.println("Se estreno en: " + matrix1.fechaDeLanzamiento);

        Pelicula matrix2 = new Pelicula();
        matrix2.nombre = "Matrix Recargado";
        matrix2.duracionEnMinutos = 138;
        matrix2.fechaDeLanzamiento = 2003;

        System.out.println("La pelicula es: " + matrix2.nombre);
        System.out.println("El tiempo de duración es: " + matrix2.duracionEnMinutos);
        System.out.println("Se estreno en: " + matrix2.fechaDeLanzamiento);
    }
}
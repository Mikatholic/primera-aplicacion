public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;


    void muestraFichaTecnica() {
        System.out.println("La pelicula se llama: " + nombre);
        System.out.println("El tiempo de duración es: " + duracionEnMinutos);
        System.out.println("Se estreno en: " + fechaDeLanzamiento);
        }

    void evalua(double nota){
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;
        }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula matrix1 = new Pelicula();
        matrix1.setNombre("Matrix");
        matrix1.setDuracionEnMinutos(131);
        matrix1.setFechaDeLanzamiento(1999);
        matrix1.setIncluidoEnElPlan(true);

        matrix1.muestraFichaTecnica();
        matrix1.evalua(8.9);
        matrix1.evalua(10);

        System.out.println(matrix1.getTotalDeLasEvaluaciones());
        System.out.println(matrix1.calculaMedia());


        Serie howIMeetYourMother = new Serie();
        howIMeetYourMother.setNombre("How I meet your mother");
        howIMeetYourMother.setFechaDeLanzamiento(2005);
        howIMeetYourMother.setTemporadas(9);
        howIMeetYourMother.setEpisodiosPorTemporada(24);
        howIMeetYourMother.setMinutosPorEpisodio(22);
        howIMeetYourMother.muestraFichaTecnica();

        System.out.println(howIMeetYourMother.getDuracionEnMinutos());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(matrix1);
        calculadora.incluye(howIMeetYourMother);
        System.out.println("Tiempo necesario para ver " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(matrix1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("");
        episodio.setSerie(howIMeetYourMother);
        episodio.setTotalVisualizaciones(0);

        filtroRecomendacion.filtra(episodio);

        var matrix2 = new Pelicula();
        matrix2.setNombre("Matrix Recargado");
        matrix2.setFechaDeLanzamiento(2003);
        matrix2.setDuracionEnMinutos(138);
        matrix2.setIncluidoEnElPlan(false);

        var matrix3 = new Pelicula();
        matrix3.setNombre("Matrix Revoluciones");
        matrix3.setFechaDeLanzamiento(2003);
        matrix3.setDuracionEnMinutos(129);
        matrix3.setIncluidoEnElPlan(false);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();




    }
}
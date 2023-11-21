package co.edu.uptc.controller;

import java.util.ArrayList;

import co.edu.uptc.model.Movie;
import co.edu.uptc.model.MultimediaContent;
import co.edu.uptc.model.Serie;

public class UserRegisteredController {

        ArrayList<Movie> movies = new ArrayList<Movie>();
        ArrayList<Serie> series = new ArrayList<Serie>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    //Reproducir película
    String name="";
    MultimediaContent mc= new MultimediaContent(name);
    public boolean playMovie(int duracionMilisegundos) {

        System.out.println("Reproduciendo la película " + mc.getName() + "...");
        try {
            Thread.sleep(duracionMilisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Película Finalizada");
        return true;
    }

    //Reproducir Serie
    int seasons = 0;
    Serie sp = new Serie(name, null);
    public boolean playSerie(int duracionMilisegundos){
        System.out.println("Reproduciendo la serie " + sp.getName() + "...");
        try {
            Thread.sleep(duracionMilisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Serie Finalizada");
        return true;
    }

    
    //Buscar película
    public String[] getMovieNames() {
        String[] options = new String[movies.size()];
        for (int i = 0; i < movies.size(); i++) {
            options[i] = movies.get(i).getName();
        }
        return options;
     }

     //Buscar serie
    public String[] getSerieNames() {
        String[] options = new String[series.size()];
        for (int i = 0; i < series.size(); i++) {
            options[i] = series.get(i).getName();
        }
        return options;
     }

     //Mostrar película
        public Movie getMovie(String movieName) {
            for (Movie movie : movies) {
                if (movie.getName().equals(movieName)) {
                    return movie;
                }
            }
            return null;
        }

     //Mostrar serie
        public Serie getSerie(String serieName) {
            for (Serie serie : series) {
                if (serie.getName().equals(serieName)) {
                    return serie;
                }
            }
            return null;
        }
        

  
}

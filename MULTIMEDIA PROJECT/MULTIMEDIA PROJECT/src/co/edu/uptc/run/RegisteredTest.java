package co.edu.uptc.run;

import java.util.Scanner;

import javax.swing.JOptionPane;

import co.edu.uptc.controller.UserRegisteredController;
import co.edu.uptc.model.Movie;
import co.edu.uptc.model.Serie;

public class RegisteredTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserRegisteredController rc = new UserRegisteredController();

        rc.addMovie(new Movie("El padrino", "Francis Ford", "Estrenada en 1972 basada en la novela homónima de Mario Puzo", "02:20"));
        rc.addMovie(new Movie("Iron man", "Jon Favreau", "Basada en el personaje de Marvel comics", "03:20"));
        rc.addMovie(new Movie("Días del cielo", "Terrence Malick", "Fué estrenada en 1978 y es conocida por su belleza visual", "02:36"));

        rc.addSerie(new Serie("El chapo", null, null, null, null));
        rc.addSerie(new Serie("Vis a Vis ", null, null, null, null));
        rc.addSerie(new Serie("Designated Survivor", null, null, null, null));

        int op = JOptionPane.showOptionDialog(null, "Welcome to registered user",
                "Registered Menu", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE,
                null, new Object[] { "Movies", "Series", "MyList Management", "Suscriptions",
                        "Return" },
                null);

        switch (op) {
            case 0:
                //Movies
                String[] movieNames = rc.getMovieNames();

                if (movieNames.length == 0) {
                JOptionPane.showMessageDialog(null, "No hay películas disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                String selectedMovieName = (String) JOptionPane.showInputDialog(null, "Selecciona una película", "Menú de películas",
                JOptionPane.PLAIN_MESSAGE, null, movieNames, movieNames[0]);
                System.out.println("Has seleccionado la película: " + selectedMovieName);
                Movie selectedMovie = rc.getMovie(selectedMovieName);
                JOptionPane.showMessageDialog(null, selectedMovie.toString(), "Detalles de la película", JOptionPane.INFORMATION_MESSAGE);
                }

                String[] optionsMov = new String[] {"Reproducir película", "No reproducir película"};
                int playOptionMov = JOptionPane.showOptionDialog(null, "¿Deseas reproducir la película?", "Reproducir película", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsMov, optionsMov[0]);
                if (playOptionMov == 0) {
                    rc.playMovie(10000);
               }

                break;

            case 1:
                //Series
                String[] serieNames = rc.getSerieNames();
                if (serieNames.length == 0) {
                JOptionPane.showMessageDialog(null, "No hay series disponibles", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                String selectedSerieName = (String) JOptionPane.showInputDialog(null, "Selecciona una serie", "Menú deseries",
                    JOptionPane.PLAIN_MESSAGE, null, serieNames, serieNames[0]);
                Serie selectedSeries = rc.getSerie(selectedSerieName);
                JOptionPane.showMessageDialog(null, selectedSeries.toString(), "Detalles de la serie", JOptionPane.INFORMATION_MESSAGE);
                
                String[] optionsSer = new String[] {"Reproducir serie", "No reproducir serie"};
                int playOptionSer = JOptionPane.showOptionDialog(null, "¿Deseas reproducir la serie?", "Reproducir serie", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, optionsSer, optionsSer[0]);
                if (playOptionSer == 0) {
                        rc.playMovie(10000);
                }
                }
                break;
            case 2:
                // Código para la opción "MyList Management"
                break;
            case 3:
                // Código para la opción "Suscriptions"
                break;
            case 4:
                // Código para la opción "Return"
                break;
            default:
                // Código para manejar cualquier otro caso, como si el usuario cierra el diálogo
                break;
        }


        sc.close();
    }
}

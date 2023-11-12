package co.edu.uptc.model;

import java.io.File;
import java.util.ArrayList;

public class Serie extends MultimediaContent{
    private ArrayList<Season> seasons;
    private File seasonsFile;

    public Serie(String name, String author, String description, String duration, ArrayList<Season> seasons) {
        super(name, author, description, duration);
        this.seasons = seasons;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }
    public void addSeasons(Season season) {
        this.seasons.add(season);
    }
    public void removeSeasons(Season season) {
        this.seasons.remove(season);
    }

    public File getSeasonsFile() {
        return seasonsFile;
    }

    public void setSeasonsFile(File seasonsFile) {
        this.seasonsFile = seasonsFile;
    } 
}

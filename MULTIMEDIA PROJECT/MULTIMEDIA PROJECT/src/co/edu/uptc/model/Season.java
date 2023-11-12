package co.edu.uptc.model;


import java.util.ArrayList;

public class Season {
    private int seasonNumber;
    private ArrayList<MultimediaContent> seasonMultimediaContent;

    
    public Season(int seasonNumber, ArrayList<MultimediaContent> seasonMultimediaContent) {
        this.seasonNumber = seasonNumber;
        this.seasonMultimediaContent = seasonMultimediaContent;
    }
    public int getSeasonNumber() {
        return seasonNumber;
    }
    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }
    
    public ArrayList<MultimediaContent> getSeasonMultimediaContent() {
        return seasonMultimediaContent;
    }
    public void setSeasonMultimediaContent(ArrayList<MultimediaContent> seasonMultimediaContent) {
        this.seasonMultimediaContent = seasonMultimediaContent;
    }
    public void addSeasonMultimediaContent(MultimediaContent seasonMultimediaContent) {
        this.seasonMultimediaContent.add(seasonMultimediaContent);
    }
    public void removeSeasonMultimediaContent(MultimediaContent seasonMultimediaContent) {
        this.seasonMultimediaContent.remove(seasonMultimediaContent);
    }

    
}

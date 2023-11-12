package co.edu.uptc.model;

public class MultimediaContent {
    private String name;
    private String author;
    private String description;
    private String duration;

    


    public MultimediaContent(String name, String author, String description, String duration) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.duration = duration;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}

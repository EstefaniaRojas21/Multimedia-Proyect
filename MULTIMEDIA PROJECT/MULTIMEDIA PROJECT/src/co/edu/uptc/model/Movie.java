package co.edu.uptc.model;

public class Movie extends MultimediaContent {

    private String duration;

    public Movie(String name, String author, String description, String duration) {
        super(name, author, description);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "param1='" + getName() + '\'' +
                ", param2='" + getAuthor() + '\'' +
                ", param3='" + getDescription() + '\'' +
                ", param4='" + duration + '\'' +
                '}';
    }

}

package co.edu.uptc.model;

public class MultimediaContent extends Multimedia{
    private String name;
    private String author;
    private String description;

    public void created() {
        setName(name);
        setAuthor(author);
        setDescription(description);
    }

    public void remove() {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    public void update() {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    public void delete() {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
    public MultimediaContent() {
    }

    public MultimediaContent(String name) {
        this.name = name;
    }

    public MultimediaContent(String name, String author, String description) {
        this.name = name;
        this.author = author;
        this.description = description;
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

    @Override
    public String toString() {
        return "MultimediaContent [name=" + name + ", author=" + author + ", description=" + description +"]";
    }

    
}

package co.edu.uptc.model;

import java.io.File;
import java.util.ArrayList;

public class Admin extends Person{
    private String user;
    private String contra;
    private ArrayList<MultimediaContent> multimediaContent;
    private File multimediaContentFile;
    
    public Admin(String firstName, String lastName, int id, String user, String contra) {
        super(firstName, lastName, id);
        this.user = user;
        this.contra = contra;

        multimediaContent = new ArrayList<>();
        multimediaContentFile = new File(System.getProperty("user.dir") + "\\src\\co\\edu\\uptc\\persistence\\files");

    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<MultimediaContent> getMultimediaContent() {
        return multimediaContent;
    }
    public void setMultimediaContent(ArrayList<MultimediaContent> multimediaContent) {
        this.multimediaContent = multimediaContent;
    }
    public void addMultimediaContent(MultimediaContent multimediaContent) {
        this.multimediaContent.add(multimediaContent);
    }
    public void removeMultimediaContent(MultimediaContent multimediaContent) {
        this.multimediaContent.remove(multimediaContent);
    }
    
    public File getMultimediaContentFile() {
        return multimediaContentFile;
    }
    public void setMultimediaContentFile(File multimediaContentFile) {
        this.multimediaContentFile = multimediaContentFile;
    }
    
}

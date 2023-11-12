package co.edu.uptc.model;

import java.io.File;
import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList<MultimediaContent> multimediaContentList;
    private File multimediaContentListFile;

    
    public Category(String categoryName, ArrayList<MultimediaContent> multimediaContentList) {
        this.categoryName = categoryName;
        this.multimediaContentList = multimediaContentList;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public ArrayList<MultimediaContent> getMultimediaContentList() {
        return multimediaContentList;
    }
    public void setMultimediaContentList(ArrayList<MultimediaContent> multimediaContentList) {
        this.multimediaContentList = multimediaContentList;
    }
    public void addMultimediaContentToList(MultimediaContent multimediaContent) {
        this.multimediaContentList.add(multimediaContent);
    }
    public void removeMultimediaContentToList(MultimediaContent multimediaContent) {
        this.multimediaContentList.remove(multimediaContent);
    }
    public File getMultimediaContentListFile() {
        return multimediaContentListFile;
    }
    public void setMultimediaContentListFile(File multimediaContentListFile) {
        this.multimediaContentListFile = multimediaContentListFile;
    }
    
}

package co.edu.uptc.model;

import java.util.ArrayList;

public class MyList {
    private String name;
    private ArrayList<MultimediaContent> multimediaContentList;
    
    public MyList(String name, ArrayList<MultimediaContent> multimediaContentList) {
        this.name = name;
        this.multimediaContentList = multimediaContentList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<MultimediaContent> getMultimediaContentList() {
        return multimediaContentList;
    }
    public void setMultimediaContentList(ArrayList<MultimediaContent> multimediaContentList) {
        this.multimediaContentList = multimediaContentList;
    }
    public void addMultimediaContentList(MultimediaContent multimediaContent) {
        this.multimediaContentList.add(multimediaContent);
    }
    public void removeMultimediaContentList(MultimediaContent multimediaContent) {
        this.multimediaContentList.remove(multimediaContent);
    }
    
}

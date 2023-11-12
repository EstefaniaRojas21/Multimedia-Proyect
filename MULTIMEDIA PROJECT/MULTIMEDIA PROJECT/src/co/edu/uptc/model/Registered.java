package co.edu.uptc.model;

import java.util.ArrayList;

public class Registered extends Person{
    private String user;
    private String contra;
    private ArrayList<MyList> myList;
    
    public Registered(String firstName, String lastName, int id, String user, String contra) {
        super(firstName, lastName, id);
        this.user = user;
        this.contra = contra;
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
    public ArrayList<MyList> getMyList() {
        return myList;
    }
    public void setMyList(ArrayList<MyList> myList) {
        this.myList = myList;
    }
    public void addMyList(MyList myList) {
        this.myList.add(myList);
    }
    public void removeMyList(MyList myList) {
        this.myList.remove(myList);
    }
}

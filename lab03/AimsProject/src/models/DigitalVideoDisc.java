/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMatched(String searchString) {
        if (this.getTitle().equals(searchString)) {
            return true;
        }
        return false;
    }

    public boolean isMatched(int id) {
        if (this.getId() == id) {
            return true;
        }
        return false;
    }

    public String printTitle() {
        String str = " - " + this.title;
        return str;
    }

    public String printCategory() {
        String str;
        if (this.category != null) {
            str = " - " + this.category;
        } else {
            str = "";
        }
        return str;
    }

    public String printDirector() {
        String str;
        if (this.director != null) {
            str = " - " + this.director;
        } else {
            str = "";
        }
        return str;
    }

    public String printLength() {
        String str;
        if (this.length != 0) {
            str = " - " + String.valueOf(this.length);
        } else {
            str = "";
        }
        return str;
    }

    public String printCost() {
        String str;
        if (this.cost != 0) {
            str = " - " + String.valueOf(this.cost) + "$";
        } else {
            str = "";
        }
        return str;
    }

    public String toString() {
        String display = this.printTitle() + this.printCategory() + this.printDirector() + this.printLength() + this.printCost();
        return display;
    }

    public boolean isMatch(String searchString) {
        if (this.getTitle().equals(searchString)) {
            return true;
        }
        return false;
    }

    public boolean isMatch(int id) {
        if (this.getId() == id) {
            return true;
        }
        return false;

    }
}

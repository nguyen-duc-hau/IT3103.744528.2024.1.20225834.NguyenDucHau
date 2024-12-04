/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package media;

import java.util.Comparator;

/**
 *
 * @author ACER
 */
public abstract class Media {

    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();

    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media() {
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getCost() {
        return cost;
    }

    boolean equals(Media o2) {
        return title.equals(o2.getTitle());
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + " [id= " + id
                + ", title='" + title + '\''
                + ", category='" + category + '\''
                + ", cost= " + cost + " $]";
    }

}

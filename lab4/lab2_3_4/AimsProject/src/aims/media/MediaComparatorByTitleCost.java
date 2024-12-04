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
public class MediaComparatorByTitleCost implements Comparator<Media> {

    public int compare(Media o1, Media o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) != 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            if (o1.getCost() > o2.getCost()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

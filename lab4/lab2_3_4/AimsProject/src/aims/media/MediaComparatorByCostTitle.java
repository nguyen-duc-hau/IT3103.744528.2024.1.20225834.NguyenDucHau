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
public class MediaComparatorByCostTitle implements Comparator<Media> {
        public int compare(Media o1, Media o2) {
        if(o1.getCost() != o2.getCost()) {
            int i = (int) (o1.getCost() - o2.getCost());
            return i;
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}

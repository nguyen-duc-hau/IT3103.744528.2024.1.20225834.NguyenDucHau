/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package media;

import java.util.ArrayList;
import java.util.List;
import media.Media;

/**
 *
 * @author ACER
 */
public class TestPolymorphism {

    public static void main(String[] args) {
        List<Media> media = new ArrayList<Media>();
        DigitalVideoDisc dvd = new DigitalVideoDisc(1,
                "Orientalism",
                "history",
                4.5f,
                "Said Edward",
                90);

        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Hey Jude", 3));
        tracks.add(new Track("I Will Always Love You", 4));
        CompactDisc cd = new CompactDisc(2,
                "Nhac hoai co",
                "Nha nhac cung dinh Hue",
                3.5f,
                "various artist",
                tracks);

        List<String> authors = new ArrayList<String>();
        authors.add("Eminem");
        authors.add("The Beatles");
        Book book = new Book(3,
                "Things Fall Apart",
                "Novel",
                5.2f,
                authors);

        media.add(dvd);
        media.add(cd);
        media.add(book);

        for (Media item : media) {
            System.out.println(item);
        }
    }
}

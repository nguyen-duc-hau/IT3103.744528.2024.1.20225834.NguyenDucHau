/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import media.Media;
import java.util.LinkedList;
import models.DigitalVideoDisc;

/**
 *
 * @author ACER
 */
public class Store {

    private LinkedList<Media> itemsInStore = new LinkedList<Media>();

    private boolean checkMedia(Media disc) {
        for (Media item : itemsInStore) {
            if (item.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public Media findMedia(String title) {
        for (Media item : itemsInStore) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public LinkedList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void removeMedia(Media disc) {
        if (checkMedia(disc)) {
            itemsInStore.remove(disc);
            System.out.println(disc.getTitle() + " 've been deleted from the store !");
        } else {
            System.out.println("There is no " + disc.getTitle() + " in the store !");
        }
    }

    public void addMedia(Media disc) {
        if (!checkMedia(disc)) {
            itemsInStore.add(disc);
            System.out.println(disc.getTitle() + " 've been added to the store !");
        } else {
            System.out.println(disc.getTitle() + " 'already exists in the store !");
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\n**********STORE***************\nitems in the store: \n");
        if (itemsInStore.isEmpty()) {
            string.append("There is no dvd in the store !\n");
        } else {
            for (Media item : itemsInStore) {
                string.append(item.getTitle() + " - " + item.getCost() + " $\n");
            }
        }
        string.append("*********************************\n");
        return string.toString();
    }
}

//    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();
//
//    private boolean checkDVD(DigitalVideoDisc disc) {
//        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
//            if (digitalVideoDisc.equals(disc)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void removeDVD(DigitalVideoDisc disc) {
//        if (checkDVD(disc)) {
//            itemsInStore.remove(disc);
//            System.out.println(disc.getTitle() + " I've been deleted from the store!");
//        } else {
//            System.out.println("There is no " + disc.getTitle() + " in the store!");
//        }
//    }
//
//    public void addDVD(DigitalVideoDisc disc) {
//        if (!checkDVD(disc)) {
//            itemsInStore.add(disc);
//            System.out.println(disc.getTitle() + " I've been added to the store!");
//        } else {
//            System.out.println(disc.getTitle() + " already exists in the store!");
//        }
//    }
//
// 
//    public String toString() {
//        StringBuilder string = new StringBuilder("STORE\nitems in the store: \n");
//        if (itemsInStore.isEmpty()) {
//            string.append("There is no dvd in the store !\n");
//        } else {
//            for (DigitalVideoDisc dvd : itemsInStore) {
//                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
//            }
//        }
//        string.append("*******************************************");
//        return string.toString();
//    }

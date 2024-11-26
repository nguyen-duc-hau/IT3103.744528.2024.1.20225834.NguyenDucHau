/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.LinkedList;
import models.DigitalVideoDisc;

/**
 *
 * @author ACER
 */
public class Store {

    private LinkedList<DigitalVideoDisc> itemsInStore = new LinkedList<DigitalVideoDisc>();

    private boolean checkDVD(DigitalVideoDisc disc) {
        for (DigitalVideoDisc digitalVideoDisc : itemsInStore) {
            if (digitalVideoDisc.equals(disc)) {
                return true;
            }
        }
        return false;
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println(disc.getTitle() + " I've been deleted from the store!");
        } else {
            System.out.println("There is no " + disc.getTitle() + " in the store!");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println(disc.getTitle() + " I've been added to the store!");
        } else {
            System.out.println(disc.getTitle() + " already exists in the store!");
        }
    }

 
    public String toString() {
        StringBuilder string = new StringBuilder("STORE\nitems in the store: \n");
        if (itemsInStore.isEmpty()) {
            string.append("There is no dvd in the store !\n");
        } else {
            for (DigitalVideoDisc dvd : itemsInStore) {
                string.append(dvd.getTitle() + " - " + dvd.getCost() + " $\n");
            }
        }
        string.append("*******************************************");
        return string.toString();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.Cart;
import models.DigitalVideoDisc;

/**
 *
 * @author Admin
 */
public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 19.99f);
        anOrder.addDigitalVideoDisc(dvd4);
        
        System.out.println("NDH-Total Cost is: ");
        System.out.println(anOrder.getTotalCost());
        anOrder.removeDigitalVideoDisc(dvd1);


        System.out.println("NDH-Total Cost is: ");
        System.out.println(anOrder.getTotalCost());

    }
}

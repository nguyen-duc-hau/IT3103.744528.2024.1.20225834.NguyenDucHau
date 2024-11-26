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
        // tạo giỏ hàng trống
        Cart anOrder = new Cart();
        //Thêm DVD vào giỏ hàng theo mảng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

//        DigitalVideoDisc[] dvdArray ={dvd1,dvd2,dvd3};
//        anOrder.addDigitalVideoDisc(dvdArray);

    }
}

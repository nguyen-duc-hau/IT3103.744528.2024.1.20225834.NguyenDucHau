/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.ArrayList;
import java.util.Collections;
import media.Media;
/**
 *
 * @author Admin
 */
public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            System.out.println(item.getTitle() + "is already in the cart !");
        } else {
            itemsOrdered.add(item);
            System.out.println(item.getTitle() + " is now in your cart !");
        }
    }

    public void removeMedia(Media item) {
        if(itemsOrdered.contains(item)) {
            itemsOrdered.remove(item);
        } else {
            System.out.println(item.getClass().getSimpleName() + ' ' + item.getTitle() + " is not in the cart !");
        }
    }

    public float totalCost() {
        float sum = 0;
        for (Media item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public void print() {
        StringBuilder output = new StringBuilder("*************CART************************** \nOrdered items: \n");
        if(itemsOrdered.isEmpty()) {
            output.append("No time\n");
        } else {
            int i = 1;
            for (Media item : itemsOrdered) {
                output.append(i + ".[" + item.getTitle() + "] - [" + item.getCategory() + "] - "
                        + item.getCost() + " $\n");
                i++;
            }
        }
        output.append("total: ").append(totalCost()).append(" $\n");
        output.append("================================================\n");
        System.out.println(output);
    }

    public void searchById(int i) {
        if(i > itemsOrdered.size()) {
            System.out.println("No match found !");
        } else {
            System.out.println("Result: " +  "[" + itemsOrdered.get(i-1).getTitle() +
                    "] - [" + itemsOrdered.get(i-1).getCategory() + "] -"
                    +  + itemsOrdered.get(i-1).getCost() + " $\n");
        }
    }

    public void searchByTitle(String title) {
        for(Media item : itemsOrdered) {
            if(item.getTitle().equals(title)) {
                System.out.println("Result: " +  "[" + item.getTitle() +
                        "] - [" + item.getCategory() + "] -"
                        +item.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found");
    }

    public Media findMedia(String title) {
        for (Media item : itemsOrdered) {
            if (item.getTitle().equals(title)) {
                return item;
            }
        }
        return null;
    }

    public void emptyCart() {
        itemsOrdered.removeAll(itemsOrdered);
    }

    public void sortByTitleCost() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCostTitle() {
        Collections.sort(itemsOrdered,Media.COMPARE_BY_COST_TITLE);
    }
}
//    private int qtyOrdered = 0;
//    public static final int MAX_NUMBER_ORDERED = 20;
//    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
//
//    public Cart() {
//    }
//
//    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
//
//        if (qtyOrdered < MAX_NUMBER_ORDERED) {
//            itemsOrdered[qtyOrdered] = disc;  // Thêm đĩa vào mảng
//            qtyOrdered++;  // Tăng số lượng đĩa trong giỏ
//            System.out.println("The DVD\"" + disc.getTitle() + "\" has been added!");  // In thông báo đĩa đã được thêm
//        } else {
//            System.out.println("The cart is almost full.");  // Thông báo giỏ đã đầy
//        }
//
//    }
//    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
//        if (qtyOrdered + 1 >= MAX_NUMBER_ORDERED) {
//            System.out.println("The cart is almost full. Can't add more discs");
//        } else {
//            itemsOrdered[qtyOrdered] = dvd1;
//            qtyOrdered++;
//            System.out.println("The DVD \"" + dvd1.getTitle() + "\" has been added!");
//
//            itemsOrdered[qtyOrdered] = dvd2;
//            qtyOrdered++;
//            System.out.println("The DVD \"" + dvd2.getTitle() + "\" has been added!");
//
//        }
//    }

//    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//        boolean found = false;
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].equals(disc)) {  // Kiểm tra nếu đĩa hiện tại là đĩa cần xóa
//                found = true;
//                // Dịch chuyển các phần tử phía sau đĩa bị xóa lên một vị trí
//                for (int j = i; j < qtyOrdered - 1; j++) {
//                    itemsOrdered[j] = itemsOrdered[j + 1];
//                }
//                itemsOrdered[qtyOrdered - 1] = null;  // Đặt phần tử cuối thành null
//                qtyOrdered--;  // Giảm số lượng đĩa trong giỏ
//                System.out.println("The disc has been removed.");
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("The disc was not found in the cart.");
//        }
//    }
//    
//    public void print() {
//    for (int i = 0; i < 20; i++) {
//        System.out.print("*");
//    }
//    System.out.print("Cart");
//    for (int i = 0; i < 20; i++) {
//        System.out.print("*");
//    }
//    System.out.println("");
//    System.out.println("Ordered Items:");
//    for (int i = 0; i < qtyOrdered; i++) {
//        System.out.println(i + 1 + ". DVD" + itemsOrdered[i].toString());
//    }
//    System.out.println("Total cost: " + getTotalCost());
//    // System.out.println("");
//    for (int i = 0; i < 40; i++) {
//        System.out.print("*");
//    }
//    
//}
//
//    public void searchById(int id) {
//    int k = -1;
//    for (int i = 0; i < qtyOrdered; i++) {
//        boolean t = itemsOrdered[i].isMatched(id);
//        if (t) {
//            k = i;
//        }
//    }
//    if (k == -1) {
//        System.out.println("The item has not been found.");
//    } else {
//        System.out.println("The item has been found:");
//        System.out.println(k + 1 + ". DVD " + itemsOrdered[k].toString());
//    }
//}
    
//    public void searchByTitle(String title) {
//    for (int i = 0; i < qtyOrdered; i++) {
//        if (isMatch(itemsOrdered[i].getTitle(), title)) {
//            System.out.println("Result: " + "[" + itemsOrdered[i].getTitle() + 
//            "] - [" + itemsOrdered[i].getCategory() + "] - [" 
//            + itemsOrdered[i].getDirector() + "] - [" 
//            + itemsOrdered[i].getLength() + "]: " + itemsOrdered[i].getCost() + " $\n");
//            return;
//        }
//    }
//    System.out.println("No match found !");
//}
        

    
//    public void search_str(String str) {
//    int k = -1;
//    for (int i = 0; i < qtyOrdered; i++) {
//        boolean t = itemsOrdered[i].isMatched(str);
//        if (t) {
//            k = i;
//        }
//    }
//    if (k == -1) {
//        System.out.println("The item has not been found.");
//    } else {
//        System.out.println("The item has been found: ");
//        System.out.println((k + 1) + ". DVD " + itemsOrdered[k].toString());
//    }
//}
//
//
//
//    public float getTotalCost() {
//        float sum = 0f;
//        for (int i = 0; i < qtyOrdered; i++) {
//            sum += itemsOrdered[i].getCost();
//        }
//        return sum;
//    }



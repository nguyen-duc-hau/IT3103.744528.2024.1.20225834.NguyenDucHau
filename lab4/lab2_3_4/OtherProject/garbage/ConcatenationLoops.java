/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garbage;

import static java.lang.System.currentTimeMillis;
import java.util.Random;

/**
 *
 * @author ACER
 */
public class ConcatenationLoops {

    public static void main(String[] args) {
        Random r = new Random(123);
        long start = currentTimeMillis();

        String s = "";

        for (int i = 0; i < 65536; i++) s += r.nextInt(2);
        
        System.out.println(currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) 
            sb.append(r.nextInt(2));
        
        s += sb.toString();

        System.out.println(currentTimeMillis() - start);
    }
}

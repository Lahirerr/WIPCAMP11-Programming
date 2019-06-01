/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int x;
         int y;
         
        System.out.print("ใส่เงินที่ได้รับจากพ่อ : ");

        x = sc.nextInt();
        
        System.out.print("ใส่เงินที่ได้รับจากแม่ : ");

        y = sc.nextInt();
               
        System.out.println("เงินรวมที่ได้ : " + (x+y));
    }
}

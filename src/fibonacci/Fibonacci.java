/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author kateryna
 */

public class Fibonacci {
    

//fibonacci backwards
    public static int fibon(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1 || index == 2) {
            return 1;
        } else {
            return (fibon(index - 1) + fibon(index - 2));
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //fibonacci beckwards
        int index = 8;
        for (int i = 0; i < index; i++) {
            System.out.print(fibon(index)+ " ");
            index--;
        }
//fibonacci with loop
//        int a = 0;
//        int b = 1;
//        int c = 
//        int till = 30;
//      
//            while ((a+b) < till) {
//               
//                c = a + b;
//                a = b;
//                b = c;
//                System.out.println(c);
//            }
//        
//        System.out.println(c);
    }

}

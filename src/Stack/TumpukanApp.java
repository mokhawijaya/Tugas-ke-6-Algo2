/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author LENOVO
 */
public class TumpukanApp {
    public static void main(String[] args) {
        Tumpukan tumpukan = new Tumpukan(10);
        tumpukan.push(45);
        tumpukan.baca();
        tumpukan.push(56);
        tumpukan.baca();
        tumpukan.push(67);
        tumpukan.baca();
        long nilai1=tumpukan.pop();
        System.out.println("nilai = "+nilai1);
        System.out.println(" ");
        tumpukan.push(83);
        tumpukan.baca();
        tumpukan.push(27);
        tumpukan.baca();
        long nilai2 = tumpukan.pop();
        System.out.println("nilai2 = "+nilai2);
        System.out.println(" ");
        long nilai3=tumpukan.pop();
        System.out.println("nilai3 = "+nilai3);
        System.out.println(" ");
        tumpukan.baca();
    }
}

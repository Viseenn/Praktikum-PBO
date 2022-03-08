/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Lenovo
 */
public class Pertemuan2 {
    
    public static void main(String[] args){
        Manusia orang1 = new Manusia();
        Tumbuhan tumbuhan1 = new Tumbuhan();
        System.out.println("Orang1: " +orang1.isNafas);
        System.out.println("Tumbuhan1: " +tumbuhan1.isNafas);
        System.out.println("Tumbuhan1: " +tumbuhan1.tumbuh());
        System.out.println("Tumbuhan1: " +tumbuhan1.tumbuh(5));
        System.out.println("Tumbuhan1: " +tumbuhan1.tumbuh(3, 1));
        Cihuahua a = new Cihuahua();
        a.menggonggong();
    }
   
}

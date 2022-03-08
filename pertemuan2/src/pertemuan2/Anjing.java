/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

class Cihuahua extends Anjing{
    //Overriding
    public void menggonggong(){
        super.menggonggong();
        System.out.println("kaing kaing");
    }
}

/**
 *
 * @author Lenovo
 */
public class Anjing {
    public void menggonggong(){
        System.out.println("GUKGUK");
    }
}

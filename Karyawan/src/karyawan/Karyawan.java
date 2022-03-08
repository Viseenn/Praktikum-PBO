/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;

/**
 *
 * @author Lenovo
 */
public class Karyawan {

    double gaji;
    private double bonus;
    
    Karyawan(){
        gaji = 1000000;
        bonus = 200000;
        System.out.println("Gaji mula-mula " + gaji + " dan bonus standar " + bonus);
    }
    
    private double hitunggaji(double gaji, double bonus){
        return gaji + bonus;
    }
    
    void naikgaji(){
        System.out.println("Beda profesi beda gaji");    
    }
    
    void setbonus(double bonus){
        this.bonus = bonus;
    }
    
    double gettotalgaji(){
        return hitunggaji(gaji, bonus);
    }
    
}

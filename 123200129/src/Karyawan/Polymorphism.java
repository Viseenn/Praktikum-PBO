/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Karyawan;

/**
 *
 * @author Lenovo
 */
public class Polymorphism {
    public static void main(String[] args){
        Karyawan K[] = new Karyawan[3];
        K[0] = new Manager();
        K[1] = new Receptionist();
        K[2] = new Manager();
        for(int i=0; i<3; i++){
            System.out.println("Gaji karyawan " + i + " adalah " + K[i].gettotalgaji());
        }
        for(int i=0; i<3; i++){
            K[i].naikgaji();
        }
        for(int i=0; i<3; i++){
            System.out.println("Gaji karyawan " + i + " sekarang adalah " + K[i].gettotalgaji());
        }
    }
}

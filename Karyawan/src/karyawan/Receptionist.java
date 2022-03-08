package karyawan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Receptionist extends Karyawan{
    Receptionist(){
        gaji += 1000000;
        setbonus(300000);
    }
    
    void naikgaji(){
        gaji += 1000000;
    }
}

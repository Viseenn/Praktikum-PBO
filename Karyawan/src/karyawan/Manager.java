package karyawan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Manager extends Karyawan{
    Manager(){
        gaji += 2000000;
        setbonus(500000);
    }
    
    void naikgaji(){
        gaji += 3000000;
    }
}

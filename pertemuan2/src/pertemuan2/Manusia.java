/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Lenovo
 */
public class Manusia extends MakhlukHidup{
    private String NIK;
    
    public Manusia(){
        this.isNafas = true;
        System.out.println("Manusia telah dibuat");
    }
    
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    
    public String getNIK(){
        return NIK;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Lenovo
 */
public class MakhlukHidup {
    boolean isNafas;
    int tinggi;
    
    //Overloading
    public String tumbuh(){
        return "Telah bertumbuh";
    }
    
    public String tumbuh(int cm){
        this.tinggi = this.tinggi + cm;
        return "Telah bertumbuh " + cm + " cm";
    }
    
    public String tumbuh(int cm, int inch){
        this.tinggi = this.tinggi + cm;
        return "Telah bertumbuh " + cm + " dan " + inch + " inch";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat;

/**
 *
 * @author ASUS
 */
public class setget {
    private String soal;
    
    public setget()
    {
        
    }
    public setget (String soal)
    {
        this.soal= soal;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }
    
}

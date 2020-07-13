/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZQULLAH
 */
public class Balok extends BangunRuang{
    private int panjang,lebar,tinggi;
  
    public int volume(){
        return panjang*lebar*tinggi;
    }
    public void hitung(){
        System.out.println("Volume nya :" +volume());
    }
    
}
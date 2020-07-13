/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZQULLAH
 */
public class Tabung extends BangunRuang{
    private double rusuk,tinggi;
    
    public double volume(){
        return 3.14*rusuk*rusuk*tinggi;
    }
    public void hitung(){
        System.out.println("Volume nya :" +volume());
    }
    
}
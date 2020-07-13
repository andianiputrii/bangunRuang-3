/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZQULLAH
 */
public class Kubus extends BangunRuang{
    private int rusuk;
  
    public int volume(){
        return rusuk*rusuk*rusuk;
    }
    public void hitung(){
        System.out.println("Volume nya :" +volume());
    }
    
}
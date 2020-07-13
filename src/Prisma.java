/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZQULLAH
 */
public class Prisma extends BangunRuang{
    private double alas,tinggis,tinggip;
    
    public double volume(){
        return 0.5*alas*tinggis*tinggip;
    }
    public void hitung(){
        System.out.println("Volume nya :" +volume());
    }
    
}
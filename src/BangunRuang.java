/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIZQULLAH
 */
public abstract class BangunRuang<Br> {
    private Br vol;
    public BangunRuang(){}
    public BangunRuang(Br _vol){
       setVol(_vol);
    }
    public void setVol(Br _vol){
        vol=_vol;
    }
    public Br getVol(){
        return vol;
    }
    public abstract void hitung();
}





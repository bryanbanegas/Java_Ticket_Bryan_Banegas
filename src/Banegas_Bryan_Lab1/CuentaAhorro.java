/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Lab1;
import java.util.Calendar;
/**
 *
 * @author adalb
 */
public class CuentaAhorro extends CuentaBancaria {
    public static Calendar ultimaModif;
    public static final double TASA_AHORRO=0.03;
    
    public CuentaAhorro(int numero,String cliente) {
        super(numero,cliente,TASA_AHORRO);
        ultimaModif=Calendar.getInstance();
    }
    
    public Calendar getUltimaModif(){
        return ultimaModif;
    }
    
    public boolean status(){
        Calendar hoy=Calendar.getInstance();
        hoy.add(Calendar.MONTH,-6);
        return hoy.before(ultimaModif);
    }
    
    public String toString(){
        return super.toString()+"Status: "+status();
    }
    
    public boolean retirar(double monto){
        if(status()){
            return super.retirar(monto);
        }
        return false;
    }
    
    public void depositar(double monto){
        if(!status()){
            monto-=monto*0.1;
        }
        super.depositar(monto);
    }
}

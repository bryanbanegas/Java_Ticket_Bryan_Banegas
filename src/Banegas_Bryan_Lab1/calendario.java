/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banegas_Bryan_Lab1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/**
 *
 * @author adalb
 */
public class calendario {
    public static void main(String args[]){
        Calendar hoy=Calendar.getInstance();
        System.out.println("Hoy: "+hoy.getTime());
        
        //Fecha especifica
        Calendar Jbday=Calendar.getInstance();
        Jbday.set(2004, Calendar.MAY,3);
        System.out.println("Ale nacio en: "+Jbday.getTime());
        
        //Comparar
        if(hoy.after(Jbday)){
            System.out.println("Si hoy es despues del nacimiento de Ale");
        }
        if(Jbday.before(hoy)){
            System.out.println("Si la fecha de Ale es antes de hoy");
        }
        if(hoy.getTimeInMillis()>=Jbday.getTimeInMillis()){
            System.out.println("Si hoy paso despues Ale nacio");
        }
        
        //Valores individual
        System.out.println("Year: "+hoy.get(Calendar.YEAR));
        System.out.println("Today: "+hoy.get(Calendar.DAY_OF_YEAR));
        System.out.println("Month: "+hoy.get(Calendar.MONTH));
        
        //Agregar o quitar valores
        hoy.add(Calendar.YEAR, 2);
        hoy.add(Calendar.MONTH, -6);
        System.out.println("Hoy en 2 anos 6 meses atras: "+hoy.getTime());
        
        //Comprobar la fecha de nacimiento
        Calendar hace=Calendar.getInstance();
        hace.add(Calendar.YEAR, -19);
        if(hace.after(Jbday)){
            System.out.println("Han pasado 19 anos desde que nacio Ale");
            System.out.println("Mes de Ale: "+Jbday.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.GERMAN));            
        }
    }
}


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class HiloHora implements Runnable{
    private JLabel hora;

    public HiloHora(JLabel hora) {
        this.hora = hora;
    }
    
    
    @Override
    public void run() {
        while (true) {            
            Date h = new Date();
            DateFormat df = new SimpleDateFormat("hh:mm");
            hora.setText(df.format(h)+" AM");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}

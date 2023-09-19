
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class HiloRecordatorio implements Runnable{
    private boolean Recordar;
    private String HoradeRecordatorio;
    private JLabel recordatorioActivo;

    public HiloRecordatorio(JLabel recordatorioActivo, String HR) {
        this.recordatorioActivo = recordatorioActivo;
        this.HoradeRecordatorio = HR;
    }
    
    public void Recordar(){
        Recordar = true;
    }
    
    public void noRecordar(){
        Recordar = false;
    }
    
    
    @Override
    public void run() {
        while(Recordar = true){
            recordatorioActivo.setVisible(true);
            Date at = new Date();
            DateFormat df = new SimpleDateFormat("hh:mm:ss");
            String atS = df.format(at);
            
            if(HoradeRecordatorio.equals(atS)){
                JOptionPane.showMessageDialog(null, "ALARMA RECORDATORIO");
                Recordar = false;
                recordatorioActivo.setVisible(false);
            }
            
            //thread sleep
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        try {
            Thread.sleep(120000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloRecordatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

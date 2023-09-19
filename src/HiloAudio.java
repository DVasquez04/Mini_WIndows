/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class HiloAudio implements Runnable{
    private Clip clip;
    private boolean pausado;

    public HiloAudio(String archivoPath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(archivoPath).getAbsoluteFile());
            
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            
            pausado = false;
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
       try {
            clip.start();
            while (true) {
                
                if (pausado) {
                    //pos pararlo xd
                    clip.stop();
                } else {
                    //pos no pararlo xddd
                    clip.start();
                }
                
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pausarReproducir() {
        pausado = !pausado;
    }
    
    public void Stop(){
        clip.stop();
    }
    
    
}

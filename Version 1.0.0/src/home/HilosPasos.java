package Home;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class HilosPasos extends Thread{
    
    JProgressBar barra;
    
    private static int retraso = 100;
    
    public HilosPasos(JProgressBar barrar){
        this.barra = barrar;
    }
    
    @Override
    public void run(){
        int minimo = barra.getMinimum();
        int maximo = barra.getMaximum();
        
        Runnable ejecutor = new Runnable(){
            @Override
            public void run(){
                int valorActual = barra.getValue();
                barra.setValue(valorActual + 1);
            }
        };
        
        for(int i=minimo; i<maximo; i++){
            try {
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(retraso);
            } catch (InterruptedException ex) {} 
              catch (InvocationTargetException ex) {}   
        }
    }
}

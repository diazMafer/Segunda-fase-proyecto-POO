/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.ArrayList;

/**
 *
 * @author Maria Fernanda Lopez 17160
 * @version 28/09/2017
 */
public class GraficaH {
    //Atributos
    private DefaultCategoryDataset data;
    private MeetGUI mini;
    private Hotel [] hotel;
   
    /**
     * Inicializa los valores del objeto tipo grafica
     */
    
    public GraficaH(){
        data = new DefaultCategoryDataset();
        hotel = new Hotel[1000];
              
    }
    
    public void crearGrafica(Hotel[] hotel){
        data.addValue(hotel[0].getCalificacion(), hotel[0].getNombre(), "");
        data.addValue(hotel[1].getCalificacion(), hotel[1].getNombre(), "");
        data.addValue(hotel[2].getCalificacion(), hotel[2].getNombre(), "");
        
        JFreeChart grafica = ChartFactory.createBarChart("Hoteles con mejor calificacion", "Nombre", "Calificacion", data);
        ChartPanel contenedor = new ChartPanel(grafica);
        JFrame venta = new JFrame("Hoteles");
        venta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venta.add(contenedor);
        venta.setSize(600,400);
        venta.setVisible(true);
        venta.setLocation(700,60);
        
        
    }
    
    
    
}

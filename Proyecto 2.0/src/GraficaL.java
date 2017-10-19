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
public class GraficaL {
    //Atributos
    private DefaultCategoryDataset data;
    private MeetGUI mini;
    private LugarT[] lugar;
   
    /**
     * Inicializa los valores del objeto tipo grafica
     */
    
    public GraficaL(){
        data = new DefaultCategoryDataset();
        lugar = new LugarT[1000];
              
    }
    
    public void crearGrafica(LugarT[] lugar){
        data.addValue(lugar[0].getCalificacion(), lugar[0].getNombre(), "");
        data.addValue(lugar[1].getCalificacion(), lugar[1].getNombre(), "");
        data.addValue(lugar[2].getCalificacion(), lugar[2].getNombre(), "");
        
        JFreeChart grafica = ChartFactory.createBarChart("Lugares con mejor calificacion", "Nombre", "Calificacion", data);
        ChartPanel contenedor = new ChartPanel(grafica);
        JFrame venta = new JFrame("Lugares");
        venta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venta.add(contenedor);
        venta.setSize(600,400);
        venta.setVisible(true);
        venta.setLocation(700,60);
        
        
    }
    
    
    
}

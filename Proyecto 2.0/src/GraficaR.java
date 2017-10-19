
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.ArrayList;
 

/**
 *
 * @author Francisco Molina, Maria Fernanda Lopez
 */
public class GraficaR {


    //Atributos
    private DefaultCategoryDataset data;
    private MeetGUI mini;
    private Restaurante[] res;
   
    /**
     * Inicializa los valores del objeto tipo grafica
     */
    
    public GraficaR(){
        data = new DefaultCategoryDataset();
        res = new Restaurante[1000];
              
    }
    
    /**
     * crea una grafica con los restaurantes que tengan mejor calificacion 
     * utiliza li libreria jfreechart para realizar la grafica
     * @param res 
     */
    public void crearGrafica(Restaurante[] res){
        data.addValue(res[0].getCalificacion(), res[0].getNombre(), "");
        data.addValue(res[1].getCalificacion(), res[1].getNombre(), "");
        data.addValue(res[2].getCalificacion(), res[2].getNombre(), "");
        
        JFreeChart grafica = ChartFactory.createBarChart("Productos con menos venta", "Nombre", "Cantidad", data);
        ChartPanel contenedor = new ChartPanel(grafica);
        JFrame venta = new JFrame("Hoteles");
        venta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        venta.add(contenedor);
        venta.setSize(600,400);
        venta.setVisible(true);
        venta.setLocation(700,60);
    
    
    
}
    
}

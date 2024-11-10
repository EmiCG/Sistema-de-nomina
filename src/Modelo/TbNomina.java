 package Modelo;

import Vista.Inicio;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan.ucan
 */
public class TbNomina {
    
    public void iniciaTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Nombre");
        titulos.add("Apellido paterno");
        titulos.add("Apellido materno");
        titulos.add("Seguro social");
        titulos.add("Ingreso");
        
    for (PorPagar item : Inicio.listaPorPagar) {    
        if (item instanceof Empleado) {    
            Empleado empleado = (Empleado) item; //casteo
            Vector<Object> fila = new Vector<Object>();
            
            fila.add(empleado.getNombre());
            fila.add(empleado.getApellidoPaterno());
            fila.add(empleado.getApellidoMaterno());
            fila.add(empleado.getSeguroSocial());
            fila.add(empleado.obtenerMontoPago());
            datos.add(fila);
        }
    }
    
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
        
    }
    
      
}

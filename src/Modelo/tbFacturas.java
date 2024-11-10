package Modelo;

import Vista.Inicio;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emiliano Contreras Gamboa
 */
public class tbFacturas {
    
    public void iniciaTabla(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Descripción");
        titulos.add("Piezas");
        titulos.add("Precio P/A");
        titulos.add("Monto");

        
    for (PorPagar item : Inicio.listaPorPagar) {    
        if (item instanceof Factura) {    
            Factura factura = (Factura) item; //recasteo
            Vector<Object> fila = new Vector<Object>();
            
            fila.add(factura.getDescripcion());
            fila.add(factura.getCantidadPiezas());
            fila.add(factura.getPrecioArticulo());
            fila.add(factura.obtenerMontoPago());

            datos.add(fila);
        }
    }
    
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);   
    }
}

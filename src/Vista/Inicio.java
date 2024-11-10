
package Vista;

import Modelo.Empleado;
import Modelo.Factura;
import Modelo.PorPagar;
import java.util.ArrayList;

/**
 *
 * @author juan.ucan
 */
public class Inicio {
    //public static ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    //public static ArrayList<Factura> listaFacturas = new ArrayList<Factura>();
    public static ArrayList<PorPagar> listaPorPagar = new ArrayList<PorPagar>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        new FrmInicio().setVisible(true);
    }
    
}

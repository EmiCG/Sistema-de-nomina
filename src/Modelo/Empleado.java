package Modelo;

/**
 *
 * @author juan.ucan
 */
public abstract class Empleado implements PorPagar {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String seguroSocial;
    
    //Constructor
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String seguroSocial) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.seguroSocial = seguroSocial;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getSeguroSocial() {
        return seguroSocial;
    }
    //Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }
    
    //Método abstract
    public abstract double obtenerMontoPago();
    
    //Método toString

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", seguroSocial=" + seguroSocial;
    }
    

    
}


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Archivo {
    private String Nombre;
    private Date Fecha;
    private String Tipo;
    private String Tamaño;

    public Archivo() {
    }

    public Archivo(String Nombre, Date Fecha, String Tipo, String Tamaño) {
        this.Nombre = Nombre;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Tamaño = Tamaño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}

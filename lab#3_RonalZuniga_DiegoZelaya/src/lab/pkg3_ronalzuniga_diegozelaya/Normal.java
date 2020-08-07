
package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;


public class Normal extends Personas{
    ArrayList<Pruebas> pruebas = new ArrayList();
    String descripcion;

    public Normal() {
        super();
    }

    public Normal(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Pruebas> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Pruebas> pruebas) {
        this.pruebas = pruebas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Normal{" + "pruebas=" + pruebas + ", descripcion=" + descripcion + '}';
    }
    
}

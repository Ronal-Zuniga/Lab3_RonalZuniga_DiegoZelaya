
package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;


public class Estado {
    String permiso;
    ArrayList<Personas> personas= new ArrayList();

    public Estado() {
    }

    public Estado(String permiso) {
        this.permiso = permiso;
    }

    public String getPermiso() {
        return permiso;
    }

    public void setPermiso(String permiso) {
        this.permiso = permiso;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Estado{" + "permiso=" + permiso + ", personas=" + personas + '}';
    }

  
    
}//fin de la clase

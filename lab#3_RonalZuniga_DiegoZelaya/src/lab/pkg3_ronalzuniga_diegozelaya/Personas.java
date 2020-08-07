
package lab.pkg3_ronalzuniga_diegozelaya;


public class Personas {
    String nombre;
    Posiciones posicion;
    int id;
    Estado estado;

    public Personas() {
    }

    public Personas(String nombre, Posiciones posicion, int id, Estado estado) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.id = id;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", posicion=" + posicion + ", id=" + id + ", estado=" + estado + '}';
    }
    
    
}

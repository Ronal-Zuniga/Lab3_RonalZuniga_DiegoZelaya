package lab.pkg3_ronalzuniga_diegozelaya;

public class Inferiores extends Piso {

    int nivel;

    public Inferiores() {
        super();
    }

    public Inferiores(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 67) {
            this.nivel = nivel;
        }

    }

    @Override
    public String toString() {
        return "Inferiores{" + "nivel=" + nivel + '}';
    }
    

}

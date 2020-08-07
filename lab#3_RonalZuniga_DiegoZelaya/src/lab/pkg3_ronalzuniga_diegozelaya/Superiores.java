package lab.pkg3_ronalzuniga_diegozelaya;

public class Superiores extends Piso {

    int nivel;

    public Superiores() {
        super();
    }

    public Superiores(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;

    }

    public void setNivel(int nivel) {
        if (nivel>=67) {
            this.nivel = nivel;
        }
        
    }

    @Override
    public String toString() {
        return "Superiores{" + "nivel=" + nivel + '}';
    }
    

}

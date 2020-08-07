
package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;

public class Piso {
    Personas admin;
    ArrayList<Ranker> evaluadores = new ArrayList();
    Ranker director;
    ArrayList<Personas> habitantes = new ArrayList();

    public Piso() {
    }

    public Piso(Personas admin, Ranker director) {
        this.admin = admin;
        this.director = director;
    }

    public Personas getAdmin() {
        return admin;
    }

    public void setAdmin(Personas admin) {
        this.admin = admin;
    }

    public ArrayList<Ranker> getEvaluadores() {
        return evaluadores;
    }

    public void setEvaluadores(ArrayList<Ranker> evaluadores) {
        this.evaluadores = evaluadores;
    }

    public Ranker getDirector() {
        return director;
    }

    public void setDirector(Ranker director) {
        this.director = director;
    }

    public ArrayList<Personas> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Personas> habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Piso{" + "admin=" + admin + ", evaluadores=" + evaluadores + ", director=" + director + ", habitantes=" + habitantes + '}';
    }
    
    
    
}//fin clase

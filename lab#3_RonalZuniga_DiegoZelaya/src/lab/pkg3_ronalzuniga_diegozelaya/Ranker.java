
package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;


public class Ranker extends Personas{
    ArrayList<Pruebas> evaluador = new ArrayList();

    public Ranker() {
        super();
    }

    public ArrayList<Pruebas> getEvaluador() {
        return evaluador;
    }

    public void setEvaluador(ArrayList<Pruebas> evaluador) {
        this.evaluador = evaluador;
    }

    @Override
    public String toString() {
        return "Ranker{" + "evaluador=" + evaluador + '}';
    }
    
}

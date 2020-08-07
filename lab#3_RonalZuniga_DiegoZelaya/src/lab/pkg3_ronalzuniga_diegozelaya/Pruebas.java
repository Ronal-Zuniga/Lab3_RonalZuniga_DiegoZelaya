
package lab.pkg3_ronalzuniga_diegozelaya;
import java.util.*;

public class Pruebas {
    static Scanner scanner=new Scanner(System.in);
    
    ArrayList<String>pescador=new ArrayList();
    ArrayList<String>lanzas=new ArrayList();
    ArrayList<String>luz=new ArrayList();
    ArrayList<String>explorador=new ArrayList();
    ArrayList<String>ondas=new ArrayList();
    
    public void setPescador(ArrayList<String> pescador) {
        this.pescador = pescador;
    }

    public void setLanzas(ArrayList<String> lanzas) {
        this.lanzas = lanzas;
    }

    public void setLuz(ArrayList<String> luz) {
        this.luz = luz;
    }

    public void setExplorador(ArrayList<String> explorador) {
        this.explorador = explorador;
    }

    public void setOndas(ArrayList<String> ondas) {
        this.ondas = ondas;
    }
    
    
    
    public void Prueba(){
        System.out.print("NOMBRE: ");
        String n=scanner.next();
        int buscar=0;
        if (buscar==0){
            for (int i=0; i<pescador.size(); i++){
                n.toLowerCase();
                if (pescador.get(i).equals(n)){
                    n = n + " - pescador";
                    buscar=1;
                }
            }
        }
        if (buscar==0){
            for (int i=0; i<lanzas.size(); i++){
                n.toLowerCase();
                if (lanzas.get(i).equals(n)){
                    n = n + " - portador de lanzas";
                    buscar=1;
                }
            }
        }
        if (buscar==0){
            for (int i=0; i<pescador.size(); i++){
                n.toLowerCase();
                if (pescador.get(i).equals(n)){
                    n = n + " - Pescador";
                    buscar=1;
                }
            }
        }
        System.out.print("EVALUADOR: ");
        String e=scanner.next();
        System.out.print("EQUIPO: ");
        String q=scanner.next();
        System.out.print("ESTADO: ");
        String t=scanner.next();
    }
}

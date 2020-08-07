
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
        System.out.print("NOMBRE DE PRUEBA: ");
        String p=scanner.next();
        char con='s';
        ArrayList<String>equipo=new ArrayList();
        while (con=='s' || con=='S'){
            System.out.print("EQUIPO: ");
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
                if (luz.get(i).equals(n)){
                    n = n + " - portador de luz";
                    buscar=1;
                }
            }
        }
        if (buscar==0){
            for (int i=0; i<pescador.size(); i++){
                n.toLowerCase();
                if (explorador.get(i).equals(n)){
                    n = n + " - explorador";
                    buscar=1;
                }
            }
        }
        if (buscar==0){
            for (int i=0; i<pescador.size(); i++){
                n.toLowerCase();
                if (ondas.get(i).equals(n)){
                    n = n + " - manipulador de ondas";
                    buscar=1;
                }
            }
        }
        equipo.add(n);
        System.out.println("DESEA INGRESAR OTRO AL EQUIPO? (S/N) ");
        con=scanner.next().charAt(0);
        }
        System.out.print("EVALUADOR: ");
        String e=scanner.next();
        System.out.print("APROBADO O REPOBRADO: ");
        String t=scanner.next();
        Informe(p,e,t,equipo);
    }
    
    public void Informe(String x, String y, String z, ArrayList<String> equipo){
        System.out.println("Informe de prueba: "+x);
        System.out.println("Administrador: "+y);
        System.out.println();
        for (int i=0; i<equipo.size();i++){
            System.out.println(equipo.get(i));
        }
        System.out.println();
        System.out.println("Estado: "+z);
    }
}

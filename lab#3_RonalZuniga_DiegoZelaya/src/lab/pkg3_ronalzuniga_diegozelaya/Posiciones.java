
package lab.pkg3_ronalzuniga_diegozelaya;

import java.util.ArrayList;

public class Posiciones {
    ArrayList<String>pescador=new ArrayList();
    ArrayList<String>lanzas=new ArrayList();
    ArrayList<String>luz=new ArrayList();
    ArrayList<String>explorador=new ArrayList();
    ArrayList<String>ondas=new ArrayList();
    
    public void Pescador(String x){
        System.out.println(x+" ES PESCADOR");
        pescador.add(x);
    }

    public void Lanzas(String x){
        System.out.println(x+" ES PORTADOR DE LANZAS");
        lanzas.add(x);
    }
    
    public void Luz(String x){
        System.out.println(x+" ES PORTADOR DE LUZ");
        luz.add(x);
    }
    
    public void Explorador(String x){
        System.out.println(x+" ES EXPLORADOR");
        explorador.add(x);
    }
    
    public void Ondas(String x){
        System.out.println(x+" ES MANIPULADOR DE ONDAS");
        ondas.add(x);
    }
    
}


package lab.pkg3_ronalzuniga_diegozelaya;


public class Irregular extends Estado{
    String usuario=null;
    String contra=null;

    public Irregular() {
        super();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Irregular{" + "usuario=" + usuario + ", contra=" + contra + '}';
    }
    
}

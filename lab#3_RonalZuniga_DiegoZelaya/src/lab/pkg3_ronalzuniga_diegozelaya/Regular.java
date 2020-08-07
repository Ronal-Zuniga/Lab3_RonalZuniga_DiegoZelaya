
package lab.pkg3_ronalzuniga_diegozelaya;


public class Regular extends Estado{
    String usuario;
    String contra;

    public Regular() {
        super();
    }

    public Regular(String usuario, String contra) {
        this.usuario = usuario;
        this.contra = contra;
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
        return "Regular{" + "usuario=" + usuario + ", contra=" + contra + '}';
    }
    
    
    
}

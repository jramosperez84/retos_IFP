// ******************************* Clase Familia 
 
 
public abstract class Familia {
    
    protected String libroFamilia;
    protected String direccion;
    protected String poblacion;
    protected String provincia;
 
    public Familia(String libroFamilia, String direccion, String poblacion, String provincia) {
        this.libroFamilia = libroFamilia;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }
 
    public String getLibroFamilia() {
        return libroFamilia;
    }
 
    public void setLibroFamilia(String libroFamilia) {
        this.libroFamilia = libroFamilia;
    }
 
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getPoblacion() {
        return poblacion;
    }
 
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
 
    public String getProvincia() {
        return provincia;
    }
 
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    abstract public float imc ();
    
}
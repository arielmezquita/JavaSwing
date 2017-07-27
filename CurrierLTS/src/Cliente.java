
public class Cliente {
    private int id;
    private String nombre;
    private boolean status;
    private String direccion;
    
    
    public Cliente(){    
    }
    
    public Cliente(int id, String nombre, boolean status, String direccion){
        this.id=id;
        this.nombre=nombre;
        this.status=status;
        this.direccion=direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void mostrarDatos(){
        
    
    }
    
}

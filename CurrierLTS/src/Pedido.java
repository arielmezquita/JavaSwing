
public class Pedido {
    private int id;
    private String descripcion;
    private int peso;
    private int id_cliente;
    private String destino;
    private String status;

    
    public Pedido(){
    
    }
    
    public Pedido(int id, String descripcion, int peso, int id_cliente, String destino, String status){
        this.id=id;
        this.descripcion=descripcion;
        this.peso=peso;
        this.id_cliente=id_cliente;
        this.destino=destino;
        this.status=status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}

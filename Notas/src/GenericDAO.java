
import java.util.List;

public interface GenericDAO<T> {
    public void guardar(T t);
    public List<T> buscar(String nombre);
    public List<T> todos();
    public void eliminar(T t);
    public void actualizar(T t);
}

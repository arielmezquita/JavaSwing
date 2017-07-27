
import java.util.List;


public interface EstudianteDAO extends GenericDAO<Estudiante>{
    
    public List<Estudiante> buscarPorMatricula(String matricula);

}

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author lsoto
 * @ArielMezquita in Java SE / NetBeans IDE 8.0.2 @ITLA 
 */

public class EstudianteDAOImpl implements EstudianteDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("NotasPU");
    EntityManager em = emf.createEntityManager();

    public EstudianteDAOImpl() {

    }
    
    @Override
    public void guardar(Estudiante e) {	
        try {
            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.close();
        }
    }

    @Override
    public void eliminar(Estudiante t) {
        try {
            Estudiante yo = em.find(Estudiante.class, t.getId());
            em.getTransaction().begin();
            em.remove(yo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.close();
        }
    }

    @Override
    public void actualizar(Estudiante t) {
        try {            
            em.getTransaction().begin();
            em.merge(t);
            em.getTransaction().commit();
        }catch (Exception ex){
            em.close();
        }        
    }
    
    @Override
    public List<Estudiante> buscar(String nombre) {
        ArrayList<Estudiante> estudiantes;
        
        TypedQuery qu = em.createQuery("SELECT c FROM Estudiante c WHERE c.nombre = :nombre", Estudiante.class);
        qu.setParameter("nombre", nombre);
        estudiantes = new ArrayList(qu.getResultList());
            
        return estudiantes;
    } 

    @Override
    public List buscarPorMatricula(String matricula) {
        ArrayList<Estudiante> estudiantes;
        
        TypedQuery qu = em.createQuery("SELECT c FROM Estudiante c WHERE c.matricula = :matricula", Estudiante.class);
        qu.setParameter("matricula", matricula);
        estudiantes = new ArrayList(qu.getResultList());
            
        return estudiantes;           
    }

    @Override
    public List<Estudiante> todos() {         
        ArrayList<Estudiante> estudiantes;
        
        TypedQuery<Estudiante> query = em.createQuery("SELECT c FROM Estudiante c", Estudiante.class);
        estudiantes = new ArrayList(query.getResultList());
        
        return estudiantes;
    }
    
}

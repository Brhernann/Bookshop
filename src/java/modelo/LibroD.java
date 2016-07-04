package modelo;

import entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroD {

    @PersistenceContext
    private EntityManager em;
    //--------------------------------------------
    @Transactional
    public void crearLibro(Libro li) throws ServicioException{

        em.persist(li);
        
    }
    //-------------------------------------------------------
    @Transactional
    public void BorrarLibro(Libro li) throws ServicioException {

        em.remove(li);
    }
    //----------------------------------------------------

    @Transactional(rollbackFor = {ServicioException.class})
    public void ActualizarLibro(Libro li) throws ServicioException {

        em.merge(li);
    }
    //----------------------------------------------------------
    @Transactional
    public boolean VerificarLibro(int isbn) throws SecurityException {

        String sql = "Select l from Libro l Where l.isbn = :isbn";

        Query q = em.createQuery(sql);
        q.setParameter("isbn", isbn);

        if (q.getResultList().size() > 0) {
            return true; //existe
        } else {
            return false;
        }
    }
    //-------------------------------------------------------
     

    @Transactional
    public List<Libro> BuscarTodosJPQL() throws SecurityException {

        String sql = "Select l from Libro l";

        Query q = em.createQuery(sql);
        return q.getResultList();
    }
    //-----------------------------------------------------------
    @Transactional
    public Libro BuscarJPQL(int isbn) throws SecurityException{
        
               String sql = "Select l from Libro l Where l.isbn = :isbn";

        Query q = em.createQuery(sql);
        q.setParameter("isbn", isbn);

        try {
            return (Libro) q.getSingleResult();
        } catch (Exception e) {
            return null;
        } 
    }

}

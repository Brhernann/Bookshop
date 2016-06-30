package modelo;

import entidades.Prestamos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PrestamosD {

    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor = {ServicioException.class})

    public void Actualizar(Prestamos pr) throws ServicioException {

        em.merge(pr);
    }

    public void Borrar(Prestamos pr) throws ServicioException {

        em.remove(pr);
    }

    public boolean VerificarJPQL(int id) throws SecurityException {

        String sql = "Select p from Prestamos p Where p.id = :id";

        Query q = em.createQuery(sql);
        q.setParameter("id", id);

        if (q.getResultList().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int CrearJPQL(Prestamos pr) throws SecurityException {

        if (VerificarJPQL(pr.getId())) {
            return 0;
        } else {
            em.persist(pr);
            return 1;
        }
    }
    
   
    public List<Prestamos> BuscarTodosJPQL() throws SecurityException {

        String sql = "Select p from Prestamos p";

        Query q = em.createQuery(sql);
        return q.getResultList();
    } 
    
        public Prestamos BuscarJPQL(int id) throws SecurityException {

        String sql = "Select p from Prestamos p Where p.id = :id";

        Query q = em.createQuery(sql);
        q.setParameter("id", id);

        try {
            return (Prestamos) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }

    }
    
}

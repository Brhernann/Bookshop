package modelo;

import entidades.Socios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SocioD {

    @PersistenceContext
    private EntityManager em;

    @Transactional(rollbackFor = {ServicioException.class})

    public void Actualizar(Socios so) throws ServicioException {

        em.merge(so);
    }

    public void Borrar(Socios so) throws ServicioException {

        em.remove(so);
    }

    public boolean VerificarJPQL(String rut) throws SecurityException {

        String sql = "Select s from Socios s Where s.rut = :rut";

        Query q = em.createQuery(sql);
        q.setParameter("rut", rut);

        if (q.getResultList().size() > 0) {
            return true; //existe 
        } else {
            return false; // no existe
        }
    }

    public int CrearJPQL(Socios so) throws SecurityException {

        if (VerificarJPQL(so.getRut())) {
            return 0; //existe
        } else {
            em.persist(so);
            return 1;
        }
    }

    public List<Socios> BuscarTodosJPQL() throws SecurityException {

        String sql = "Select s from Socios s";

        Query q = em.createQuery(sql);
        return q.getResultList();
    }

    public Socios BuscarJPQL(String rut) throws SecurityException {

        String sql = "Select s from Socios s Where s.rut = :rut";

        Query q;
        q = em.createQuery(sql);
        q.setParameter("rut", rut);

        try {
            return (Socios) q.getSingleResult();
        } catch (Exception e) {
            return null;
        }

    }

}

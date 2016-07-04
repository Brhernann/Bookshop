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
    public void ActualizarSocios(Socios so) throws ServicioException {

        em.merge(so);
    }
    @Transactional
    public void BorrarSocios(Socios so) throws ServicioException {

        em.remove(so);
    }
    @Transactional
    public int CrearSocio(Socios so) throws SecurityException {

       
            em.persist(so);
            return 1;
        
    }
    @Transactional
    public boolean VerificarSocio(String rut) throws SecurityException {

        String sql = "Select s from Socios s Where s.rut = :rut";

        Query q = em.createQuery(sql);
        q.setParameter("rut", rut);

        if (q.getResultList().size() > 0) {
            return true; //existe 
        } else {
            return false; // no existe
        }
    }

    
    @Transactional
    public List<Socios> BuscarTodosSocios() throws SecurityException {

        String sql = "Select s from Socios s";

        Query q = em.createQuery(sql);
        return q.getResultList();
    }
    @Transactional
    public Socios BuscarSocios(String rut) throws SecurityException {

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

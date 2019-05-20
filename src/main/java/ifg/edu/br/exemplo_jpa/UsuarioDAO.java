package ifg.edu.br.exemplo_jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ifg.edu.br.exemplo_jpa.entidades.Usuario;

public class UsuarioDAO {
	
	private EntityManager entityManager;
	
	public UsuarioDAO() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
    	entityManager = factory.createEntityManager();
	}
	
	public void inserir(Usuario usuario) {
		entityManager.getTransaction().begin();
		entityManager.persist(usuario);
		entityManager.getTransaction().commit();
	}

	public void atualizar(Usuario usuario) {
		entityManager.getTransaction().begin();
		entityManager.merge(usuario);
		entityManager.getTransaction().commit();
	}

	public void excluir(Usuario usuario) {
		entityManager.getTransaction().begin();
		entityManager.remove(usuario);
		entityManager.getTransaction().commit();
	}

	public Usuario obter(long usuarioId) {
		return entityManager.find(Usuario.class, usuarioId);
	}
	
	public List<Usuario> listar() {
		return entityManager.createQuery("select u from Usuario u").getResultList();
	}
}

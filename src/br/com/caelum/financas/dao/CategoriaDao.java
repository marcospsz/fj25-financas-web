package br.com.caelum.financas.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;

@Stateless
public class CategoriaDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public Categoria procura(int id){
		
		return this.manager.find(Categoria.class, id) ;		
	}
	
	public List<Categoria> lista(){
		
		return this.manager.createQuery("select c from Categoria c", Categoria.class)
				.getResultList();		
	}

}

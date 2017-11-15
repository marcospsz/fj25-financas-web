package br.com.caelum.financas.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("controlefinancas");
		
		EntityManager manager = factory.createEntityManager() ;
		
		Movimentacao movimentacao = manager.find(Movimentacao.class, 1);
		
		System.out.println(movimentacao);
		
	}

}

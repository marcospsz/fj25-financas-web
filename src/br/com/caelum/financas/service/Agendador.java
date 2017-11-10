package br.com.caelum.financas.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

//@Stateless
@Singleton
public class Agendador {

	private static int totalCriado;

	public void executa() {
		System.out.printf("%d instancias criadas %n", totalCriado);

		// simulando demora de 4s na execucao
		try {
			System.out.printf("Executando %s %n", this);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
		}		
	}
	
	@PostConstruct
	void posConstrucao(){
		System.out.println("Criando agendador");
		
		totalCriado++;
		
	}
	
	@PreDestroy
	void preDestruicao(){
		System.out.println("Destruindo agendador");
		
	}

}

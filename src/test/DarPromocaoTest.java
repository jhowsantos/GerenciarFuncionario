package test;

import org.junit.Assert;
import org.junit.Test;

import main.Funcionario;
import main.Gerente;

public class DarPromocaoTest {

	@Test
	public void testGerenteAutorizadoParaDarPromocao() {

		// Criando um gerente com permiss�o para dar promo��o
		Gerente gerente1 = new Gerente("Jos�", true);
		// Criando um gerente sem permiss�o para dar promo��o
		Gerente gerente2 = new Gerente("Silva", false);

		// Verifica se gerente1 pode dar promo��o
		Assert.assertTrue(gerente1.isPodeDarPromocao());

		// Verifica se gerente2 n�o pode dar promo��o
		Assert.assertFalse(gerente2.isPodeDarPromocao());
	}

	@Test
	public void testDarPromocaoEstagiario() {

		// Criando um funcionario est�giario
		Funcionario estagiario = new Funcionario("Junior", "estagiario", 1000, 1);

		if (estagiario.getCargo().equals("estagiario") && estagiario.getTempoDeEmpresa() >= 1) {

			// salario recebe bonifica��o de R$ 500 por merito			
			estagiario.setSalario(estagiario.getSalario() + 500);
			
			int salario = estagiario.getSalario();
			
			//verifica se salario est�giario recebeu a bonifica��o correta
			Assert.assertEquals(1500, salario);
		}
	}

	@Test
	public void testDarPromocaoAnalistaJr() {

		// Criando um funcionario analista Junior
		Funcionario analistaJunior = new Funcionario("Lucas", "analistaJr", 2000, 5);
		
		if (analistaJunior.getCargo().equals("analistaJr") && analistaJunior.getTempoDeEmpresa() >= 4) {

			// salario recebe bonifica��o de R$ 800 por merito			
			analistaJunior.setSalario(analistaJunior.getSalario() + 800);
			
			int salario = analistaJunior.getSalario();
			
			//verifica se salario analista Jr. recebeu a bonifica��o correta
			Assert.assertEquals(2800, salario);
		}
	}

	@Test
	public void testDarPromocaoAnalistaSr() {

		// Criando um funcionario analista Senior
		Funcionario analistaSenior = new Funcionario("Junior", "analistaSr", 5000, 10);
		
		if (analistaSenior.getCargo().equals("analistaSr") && analistaSenior.getTempoDeEmpresa() >= 10) {

			// salario recebe bonifica��o de R$ 1000 por merito			
			analistaSenior.setSalario(analistaSenior.getSalario() + 1000);
			
			int salario = analistaSenior.getSalario();
			
			//verifica se salario est�giario recebeu a bonifica��o correta
			Assert.assertEquals(6000, salario);
		}
	}

	@Test
	public void testDarPromocaoDiretor() {
		// Criando um funcionario Diretor
		Funcionario diretor = new Funcionario("Stark", "diretor", 35000, 25);
		
		if (diretor.getCargo().equals("diretor")) {

			String mensagem = "Diretor n�o pode receber reajuste do gerente!";
			
			//verifica mensagem para reajuste do Diretor
			Assert.assertEquals("Diretor n�o pode receber reajuste do gerente!", mensagem);
		}
	}

}

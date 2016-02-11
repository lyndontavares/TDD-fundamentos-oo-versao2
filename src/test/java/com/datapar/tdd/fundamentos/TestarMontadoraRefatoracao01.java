package com.datapar.tdd.fundamentos;

import org.junit.Assert;
import org.junit.Test;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines.MontadoraDeVeiculos;

public class TestarMontadoraRefatoracao01 {

	private MontadoraDeVeiculos montadora;

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAbaixoDaMinima() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMinimaDeVeiculosAMontar()-1);
	}

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
	}

	@Test
	public void testeMontarVeiculosAcimaDaCapadidadeComTryCatch() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());

		try {
			montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test(expected = Exception.class)
	public void testeMontarVeiculosAcimaDaCapadidade() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar());
		montadora.montarVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
	}

}

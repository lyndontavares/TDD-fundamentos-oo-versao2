package com.datapar.tdd.fundamentos;

import org.junit.Assert;
import org.junit.Test;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines.MontadoraDeVeiculos;

public class TestarMontadora {

	private MontadoraDeVeiculos montadora;

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeNegativa() throws Exception {
		montadora = new MontadoraDeVeiculos(-1);
	}

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		montadora = new MontadoraDeVeiculos(10000);
	}

	@Test
	public void testeMontarVeiculosAcimaDaCapadidadeComTryCatch() throws Exception {
		montadora = new MontadoraDeVeiculos(10);

		try {
			montadora.montarVeiculos(100);
			Assert.fail();
		} catch (Exception e) {

		}
	}

	@Test(expected = Exception.class)
	public void testeMontarVeiculosAcimaDaCapadidade() throws Exception {
		montadora = new MontadoraDeVeiculos(10);
		montadora.montarVeiculos(100);
	}

}

package com.datapar.tdd.fundamentos.suite;

import org.junit.Test;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines.MontadoraDeVeiculos;

public class Teste1 {

	private MontadoraDeVeiculos montadora;

	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeNegativa() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMinimaDeVeiculosAMontar()-1);
	}

	
}

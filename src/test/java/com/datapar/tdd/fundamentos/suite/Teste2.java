package com.datapar.tdd.fundamentos.suite;

import org.junit.Test;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines.MontadoraDeVeiculos;

public class Teste2 {
	private MontadoraDeVeiculos montadora;


	@Test(expected = Exception.class)
	public void testeIniciarMontadoraComCapacidadeAcimaDoLimite() throws Exception {
		montadora = new MontadoraDeVeiculos(MontadoraDeVeiculos.getCapacidadeMaximaDeVeiculosAMontar()+1);
	}
}

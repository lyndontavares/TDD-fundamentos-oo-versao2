package com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.bussines;

import java.util.ArrayList;
import java.util.List;

import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.exceptions.ExceptionLimiteMontagem;
import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.model.Motor;
import com.datapar.tdd.fundamentos.versaoRegrasDeNegocio.model.Passeio;

public class MontadoraDeVeiculos {

	private static int CAPACIDADE_MAXIMA_DE_MONTAGEM = 1000; 
	private static int CAPACIDADE_MINIMA_DE_MONTAGEM = 1;
	
	private int quantidadeDeVeiculosMontados;
	private int capacidadeDeVeiculosAMontar;
	
	public MontadoraDeVeiculos (int capacidadeDeVeiculosAMontar) throws Exception {

		if (capacidadeDeVeiculosAMontar < CAPACIDADE_MINIMA_DE_MONTAGEM ) {
			throw new ExceptionLimiteMontagem("Capacidade de veiculos a montar deve ser maior ou igual a "+CAPACIDADE_MINIMA_DE_MONTAGEM);
		}

		if (capacidadeDeVeiculosAMontar > CAPACIDADE_MAXIMA_DE_MONTAGEM) {
			throw new ExceptionLimiteMontagem("Capacidade de veiculos a montar deve ser maior menor ou igual a "+CAPACIDADE_MAXIMA_DE_MONTAGEM);
		}

		quantidadeDeVeiculosMontados = 0;
		this.capacidadeDeVeiculosAMontar = capacidadeDeVeiculosAMontar;
		
	}

	public int getQuantidadeDeVeiculosMontados() {
		return quantidadeDeVeiculosMontados;
	}

	public static int getCapacidadeMaximaDeVeiculosAMontar() {
		return CAPACIDADE_MAXIMA_DE_MONTAGEM;
	}

	public static int getCapacidadeMinimaDeVeiculosAMontar() {
		return CAPACIDADE_MINIMA_DE_MONTAGEM;
	}
	
	
	public List<TipoDeVeiculo> montarVeiculos(int quantidade) throws Exception {
		
		if ( quantidadeDeVeiculosMontados + quantidade > capacidadeDeVeiculosAMontar ){
			throw new ExceptionLimiteMontagem("Excede capacidade de fabricacao: "+capacidadeDeVeiculosAMontar+" veiculos");
		}
		
		List<TipoDeVeiculo> ListaDeveiculos = new ArrayList<TipoDeVeiculo>();
		
		for (int n = 1; n <= 10; n++) {
			ListaDeveiculos.add(new Passeio("PLACA" + n, "FORD", "FIESTA", 200, new Motor(4, 200), 5));
		}
		
		return ListaDeveiculos;
	}

}

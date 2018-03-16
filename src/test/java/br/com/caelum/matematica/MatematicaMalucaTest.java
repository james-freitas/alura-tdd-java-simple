package br.com.caelum.matematica;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.matematica.MatematicaMaluca;

public class MatematicaMalucaTest {
/*
	Um para o caso onde o número é maior que 30; outro para o caso onde o número é maior que 10,
	 mas menor que 30; outro para o caso onde o número é menor que 10.

	Podemos ainda aumentar nossa segurança, e testar o que acontece quando passamos exatamente os 
	números 10 e 30, afinal são casos extremos e merecem ser testados.
	
*/	
    @Test
    public void deveMultiplicarNumerosMaioresQue30() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(50*4, matematica.contaMaluca(50));
    }

    @Test
    public void deveMultiplicarNumerosMaioresQue10EMenoresQue30() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(20*3, matematica.contaMaluca(20));
    }

    @Test
    public void deveMultiplicarNumerosMenoresQue10() {
        MatematicaMaluca matematica = new MatematicaMaluca();
        assertEquals(5*2, matematica.contaMaluca(5));
    }
	
}

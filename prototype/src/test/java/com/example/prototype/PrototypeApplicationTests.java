package com.example.prototype;

import com.example.prototype.domain.Motor;
import com.example.prototype.domain.Veiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class PrototypeApplicationTests {

	@Test
	void deveClonarVeiculoSemAfetarOriginal() throws CloneNotSupportedException {
		Motor motorOriginal = new Motor("V8", 500);
		Veiculo veiculoOriginal = new Veiculo("Mustang", "Vermelho", motorOriginal);

		Veiculo veiculoClonado = veiculoOriginal.clone();
		veiculoClonado.setCor("Azul");
		veiculoClonado.getMotor().setCavalos(600);

		assertEquals("Mustang", veiculoOriginal.getModelo());
		assertEquals("Vermelho", veiculoOriginal.getCor());
		assertEquals(500, veiculoOriginal.getMotor().getCavalos());

		assertEquals("Mustang", veiculoClonado.getModelo());
		assertEquals("Azul", veiculoClonado.getCor());
		assertEquals(600, veiculoClonado.getMotor().getCavalos());
	}

	@Test
	void referenciasDeMemoriaDevemSerDiferentes() throws CloneNotSupportedException {
		Motor motorOriginal = new Motor("V6", 300);
		Veiculo veiculoOriginal = new Veiculo("Camaro", "Amarelo", motorOriginal);

		Veiculo veiculoClonado = veiculoOriginal.clone();

		assertNotSame(veiculoOriginal, veiculoClonado);
		assertNotSame(veiculoOriginal.getMotor(), veiculoClonado.getMotor());
	}
}
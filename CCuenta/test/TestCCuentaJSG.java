import static org.junit.Assert.*;

import org.junit.Test;

public class TestCCuentaJSG {

	@Test
	public void testCcuentaJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		assertNotNull(cuentaTest);
	}

	@Test
	public void testTresAtributosJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		String nom = "Antonio";
		String nombre = cuentaTest.getNombre();
		String cue = "ES25-3006-6666-1115-8888";
		String cuenta = cuentaTest.getCuenta();
		Double sal = 5000.0;
		Double saldo = cuentaTest.getSaldo();
		assertEquals(nom, nombre);
		assertEquals(cue, cuenta);
		assertEquals(sal, saldo);
	}

	@Test
	public void testIngresarJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		double ingreso = 600.0;
		Double sal = 5600.0;
		cuentaTest.ingresar(ingreso);
		Double saldo = cuentaTest.getSaldo();
		assertEquals(sal, saldo);
	}

	@Test
	public void testIngresarNegativoJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		double ingreso = -400.0;
		Double sal = 4600.0;
		cuentaTest.ingresar(ingreso);
		Double saldo = cuentaTest.getSaldo();
		assertEquals(sal, saldo);
	}

	@Test
	public void testRetirarJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		double cargo = 1000.0;
		Double sal = 4000.0;
		cuentaTest.retirar(cargo);
		Double saldo = cuentaTest.getSaldo();
		assertEquals(sal, saldo);
	}

	@Test
	public void testGranRetiradaJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000.0,5);
		double cargo = 6000.0;
		Double sal = -1000.0;
		cuentaTest.retirar(cargo);
		Double saldo = cuentaTest.getSaldo();
		assertEquals(sal, saldo);
	}

}

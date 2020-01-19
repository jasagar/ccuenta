import static org.junit.Assert.*;

import org.junit.Test;

public class TestCCuentaJSG {

	@Test
	public void testCcuentaJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000,5);
		assertNotNull(cuentaTest);
	}

	@Test
	public void testNombreJSG() {
		Ccuenta cuentaTest = new Ccuenta("Antonio","ES25-3006-6666-1115-8888",5000,5);
		String nom = "Antonio";
		String nombre = cuentaTest.getNombre();
		assertSame(nom, nombre);
	}

	@Test
	public void testCuentaJSG() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaldoJSG() {
		fail("Not yet implemented");
	}


	@Test
	public void testIngresarJSG() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetirarJSG() {
		fail("Not yet implemented");
	}

}

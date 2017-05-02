/**
 * 
 */
package br.cesed.si.p3.deques;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Diego Kazadi
 *
 */
public class TestMinhaDeques {
	@Test
	public void testAdicao(){
		Deques d = new Deques();
		d.addInicio("Diego ");
		d.addInicio(23.000);
		d.addInicio("83 9989-5043");
		d.addInicio("Pedro II");
		d.addInicio(123);
		d.addInicio("Amor ");
		Assert.assertEquals(d.pegaInicio(), "Amor ");
		
	}
	
	@Test
	public void testRemove(){
		Deques d = new Deques();
		d.addInicio("Diego ");
		d.addInicio(23.000);
		d.addInicio("83 9989-5043");
		d.addInicio("Pedro II");
		d.addInicio(123);
		d.addInicio("Amor ");
		
		d.removeInicio();
		Assert.assertEquals(d.pegaInicio(), 123);
	}

	@Test
	public void testRemove2(){
		Deques d = new Deques();
		d.addInicio("Diego ");
		d.addInicio(23.000);
		d.addInicio("83 9989-5043");
		d.addInicio("Pedro II");
		d.addInicio(123);
		d.addInicio("Amor ");
		
		d.removeFinal();
		Assert.assertEquals(d.pegaFinal(), 23.000);
	}

	@Test
	public void testAdicionFinal(){
		Deques d = new Deques();
		d.addFinal("Diego ");
		d.addFinal(23.000);
		d.addFinal("83 9989-5043");
		d.addFinal("Pedro II");
		d.addFinal(123);
		d.addFinal("Amor ");
		Assert.assertEquals(d.pegaFinal(), "Amor ");
	}
	@Test
	public void testOrganize(){
		Deques d = new Deques();
		d.addFinal("Diego ");
		d.addInicio("Bryden");
		d.addFinal(23.000);
		d.removeInicio();
		d.removeFinal();
		Assert.assertEquals("Diego ", d.pegaInicio());
	}
}

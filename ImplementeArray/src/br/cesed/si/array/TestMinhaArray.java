/**
 * 
 */
package br.cesed.si.array;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Diego Kazadi
 *
 */
public class TestMinhaArray {
	@Test
	public void testAdicao(){
		MinhaArray f = new MinhaArray(5);
		f.add("Angeline");
		f.add("Marquez");
		f.add("Pietro");
		f.add("Brunel");
		Assert.assertEquals(f.getByIndex(4),"Brunel");
	}
	@Test
	public void testRemove(){
		MinhaArray f = new MinhaArray(3);
		f.add("Luck 007");
		f.add(22.05);
		f.add("Angeline");
		
		f.remove(22.05);
		Assert.assertEquals(f.getByIndex(1), "Angeline");
	}	
	@Test
	public void testDuplicaSize(){
		MinhaArray f = new MinhaArray(4);
		f.add(11111);
		f.add("xxxxxxxxx");
		f.add("Angecia 999-8");
		f.add("conta 1234-5");
		f.add("Zadio");
		f.add("Papa");
		f.add(null);
		
		Assert.assertEquals(f.size(), 6);
	}
}

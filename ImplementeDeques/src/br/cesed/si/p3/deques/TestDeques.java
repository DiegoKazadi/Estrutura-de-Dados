/**
 * 
 */
package br.cesed.si.p3.deques;

/**
 * @author diego
 *
 */
public class TestDeques {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deques dq = new Deques();
		System.out.println(dq);
		
		// Addicionar no Inicio
		
		dq.addInicio("Diego ");
		System.out.println(dq.toString());
		
		dq.addFinal("Valencia ");
		
		//Addicionar no Final
		dq.addFinal("Vinicius ");
		System.out.println(dq.toString());
		
		// Organização o Deques
		dq.orgDeques();
						
	}

}

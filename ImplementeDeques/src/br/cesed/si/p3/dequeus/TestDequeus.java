/**
 * 
 */
package br.cesed.si.p3.dequeus;

/**
 * @author aluno
 *
 */
public class TestDequeus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dequeus dq = new Dequeus();
		// Addicionar no Inicio
		dq.addInicio("Diego ");
		System.out.println(dq.toString());
		//Addicionar no Final
		dq.addFinal("Vinicius ");
		
		System.out.println(dq.toString());
		
	}
}

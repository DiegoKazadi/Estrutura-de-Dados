/**
 * 
 */
package br.cesed.si.p3.pilha;

/**
 * @author Diego Kazadi
 *
 */
public class TestePilha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NovaPilha p = new NovaPilha();
		System.out.println(p.estadoPilha());
		p.empilhar("Portuguesa ");
	    p.empilhar("Frango com catupiry ");
	    p.empilhar("Calabresa ");
	    p.empilhar("Quatro queijos ");
	    System.out.println(p.toString());
	    
	    
	    //            while (p.estadoPilha() == false) 
	    System.out.println(p.desempilhar());
	    
	    System.out.println(p.exibeUltimoElemento());
	    System.out.println(p.estadoPilha());
	    }
}

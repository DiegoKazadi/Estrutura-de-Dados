/**
 * 
 */
package br.cesed.si.p3.dequeus;

import java.util.Arrays;

/**
 * @author aluno
 *
 */
public class Dequeus {
	private int inseridos;
	
	private Object[] dequeus;

	/**
	 * 
	 */
	public Dequeus() {
		super();
		this.inseridos = 3;
		this.dequeus = new Object[inseridos];
	
	}
	/**
	 * Método que addiciona os objectos no inicio da lista e vai duplicar o seu tamanho quando este atinge o seu limite
	 * @param obj
	 */
	public void addInicio(Object obj){
		if (inseridos == dequeus.length){
			Object [] dequeusMaior = new Object[dequeus.length * 2];
			
			for (int i = 0; i < dequeus.length; i++) {
				dequeusMaior[i] = dequeus[i];
				
			}
			dequeus = dequeusMaior;
		}
		Object [] dequeusMaior = new Object[dequeus.length+1];
		for (int i = 0; i < dequeus.length; i++) {
			dequeusMaior[i+1] = dequeus[i];
		}
		dequeusMaior[0] = obj;
		dequeus = dequeusMaior;
		inseridos ++;
	}
	/**
	 * Método que addiciona os objectos no final da lista e vai duplicar o seu tamanho quando este atinge o seu limite
	 * @param obj
	 */
	public void addFinal(Object obj){
		if (inseridos == dequeus.length){
			Object [] dequeusMaior = new Object[dequeus.length * 2];
			
			for (int i = 0; i < dequeus.length; i++) {
				dequeusMaior[i] = dequeus[i];
				
			}
			dequeus = dequeusMaior;
		}
		
		dequeus[inseridos] = obj;
		inseridos ++;
	}
	@Override
	public String toString() {
		return "Dequeus contem " + inseridos + ", dequeus=" + Arrays.toString(dequeus) + "]";
	}
	
}

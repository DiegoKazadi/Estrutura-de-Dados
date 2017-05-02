/**
 * 
 */
package br.cesed.si.p3.deques;
import java.util.Arrays;
/**
 * Criação da class Deques para manipulação e entendimento do seu funcionamento
 * @author Diego
 *
 */
public class Deques {
	private int inseridos;
	private Object[] deques;
	private final static int tamanho = 5;
	/**
	 * O método construtor sem parametro, mas está definido o tamanho da deques
	 * @param
	 */
	public Deques() {
		super();
		this.inseridos = 0;
		this.deques = new Object[tamanho];
	}
	/**
	 * O método size retorna o tamanho de deques	 * 
	 * @return size
	 */
	public int size() {
		return inseridos;
	}
	/**
	 * O método duplicaSize(), esse aumenta o tamanho do Deques
	 */
	private void duplicaSize(){
		Object [] dequeMaior = new Object[deques.length*2];
		for (int i = 0; i < deques.length; i++) {
			dequeMaior[i] = deques[i];
		}
		deques = dequeMaior;
	}
	/**
	 * O método addInicio que addicionar os objectos no inicio da lista e vai duplicar o seu tamanho quando este atinge o seu limite
	 * @param obj
	 */
	public void addInicio(Object obj){
		if(obj != null){
			if (deques.length == inseridos){
				duplicaSize();
			}
			Object [] dequesFake = new Object[deques.length];
			dequesFake[0] = obj;			
			for (int i = 1; i < dequesFake.length; i++) {
				dequesFake[i] = deques[i-1];
			}
			deques = dequesFake;
			inseridos ++;
		}
	}
	/**
	 * O método addFinal, que addicionar os objectos no final da lista e vai duplicar o seu tamanho quando este atinge o seu limite
	 * @param obj
	 */
	public void addFinal(Object obj){
		if(obj != null){
			if(deques.length == inseridos){
				duplicaSize();
			}
			deques[inseridos++]=obj;
		}
	}
	/**
	 * O método printAllElemento e para imprimir todos elementos de Deque 
	 * @param 
	 */
	public void printAllElemento(){
		
		for(Object obj: deques){
			System.out.println(obj);
		}
	}
	/**
	 * O método removeInicio, esse método serve para remover o objecto na primeira posição de deque
	 * @return obj
	 */
	public void removeInicio(){
		deques[0] = null;
		orgDeques();
		inseridos--;
	}
	/**
	 * O método removeFinal, esse método serve para remover o objecto na ultima posição de deque
	 * @return obj
	 */
	public void removeFinal(){
		deques[--inseridos] = null;
		orgDeques();
	}
	/**
	 * O método orgDeques, esse método tem como funcionalidade de organizar e deixar o Deques 
	 * bem arrumado
	 * @parm 
	 */
	public void orgDeques(){
		Object [] objs = new Object[deques.length];
		int num = 0;
		for (Object object : deques) {
			if(object != null){
				objs[num] = object;
				num ++;
			}
		}
		deques = objs;
	}
	/**
	 * O método pegaInicio, esse método serve exibir o objecto na primeira posição de deque
	 * @return obj
	 */
	public Object pegaInicio(){
		return deques[0];
	}
	/**
	 * O método pegaFinal, esse método serve exibir o objecto na ultima posição de deque
	 * @return obj
	 */
	public Object pegaFinal(){
		return deques[inseridos -1];
	}
	@Override
	public String toString() {
		return "Deques contem " + inseridos + ", deques:" + Arrays.toString(deques) + "\n";
	}
}

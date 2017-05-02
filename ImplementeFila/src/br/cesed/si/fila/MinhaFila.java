/**
 * 
 */
package br.cesed.si.fila;
import java.util.Arrays;
/**
 * Criação da classe Filas para o seu uso e a manupilação das suas funcionalidades
 * @author Diego Kazadi
 *
 */
public class MinhaFila {
	private int contador;
	private Object [] fila;
	private final static int tamanho = 5;
	/**
	 * O método construtor da class Fila
	 * @param 
	 * 
	 */
	public MinhaFila(){
		this.contador = 0;
		fila = new Object[tamanho];
	}
	/**
	 * O método isEmpty, esse método verifica se a fila está vazio ou não
	 */
	public boolean isEmpty(){
		return contador>0;
	}
	/**
	 * O método front, esse método retorna o objeto do inicio da filas sem remover
	 * @return fila
	 */
	public Object Front(){
		return fila[0];
	}
	/**
	 * O método end, esse método retorna o objeto do final da filas sem remover
	 * @return obj
	 */
	public Object End(){
		return fila[contador];
	}
	/**
	 * O método duplicaSize, esse método duplica o tamanho de Fila
	 */
	private void duplicaSize(){
		Object [] filaProlongado = new Object[fila.length * 2];
		for (int i = 0; i < fila.length; i++) {
			filaProlongado[i] = fila[i];
		}
		fila = filaProlongado;
	}
	/**
	 * O método add, esse método adicione objecto na fila
	 * @deprecated elemento
	 */
	public void add(Object elemento){
		if (elemento != null){
			if (fila.length == tamanho ){
				duplicaSize();
			}
		}
	}
	/**
	 * O método remove, esse método tem como funcionalidade de remover o objecto na primeira posição
	 * depois chama a função orgFila() para organizar
	 */
	public void remove(){
		fila[0] = null;
		orgFila();
	}
	/**
	 * O método orgFila, esse método tem como funcionalidade de organizar a fila 
	 * 
	 * @parm 
	 */
	public void orgFila(){
		Object [] objs = new Object[fila.length];
		int num = 0;
		for (Object object : fila) {
			if(object != null){
				objs[num] = object;
				num ++;
			}
		}
		fila = objs;
	}

}

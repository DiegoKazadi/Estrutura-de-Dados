/**
 * 
 */
package br.cesed.si.fila;
import java.util.Arrays;
/**
 * Cria��o da classe Filas para o seu uso e a manupila��o das suas funcionalidades
 * @author Diego Kazadi
 *
 */
public class MinhaFila {
	private int contador;
	private Object [] fila;
	private final static int tamanho = 5;
	/**
	 * O m�todo construtor da class Fila
	 * @param 
	 * 
	 */
	public MinhaFila(){
		this.contador = 0;
		fila = new Object[tamanho];
	}
	/**
	 * O m�todo isEmpty, esse m�todo verifica se a fila est� vazio ou n�o
	 */
	public boolean isEmpty(){
		return contador>0;
	}
	/**
	 * O m�todo front, esse m�todo retorna o objeto do inicio da filas sem remover
	 * @return fila
	 */
	public Object Front(){
		return fila[0];
	}
	/**
	 * O m�todo end, esse m�todo retorna o objeto do final da filas sem remover
	 * @return obj
	 */
	public Object End(){
		return fila[contador];
	}
	/**
	 * O m�todo duplicaSize, esse m�todo duplica o tamanho de Fila
	 */
	private void duplicaSize(){
		Object [] filaProlongado = new Object[fila.length * 2];
		for (int i = 0; i < fila.length; i++) {
			filaProlongado[i] = fila[i];
		}
		fila = filaProlongado;
	}
	/**
	 * O m�todo add, esse m�todo adicione objecto na fila
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
	 * O m�todo remove, esse m�todo tem como funcionalidade de remover o objecto na primeira posi��o
	 * depois chama a fun��o orgFila() para organizar
	 */
	public void remove(){
		fila[0] = null;
		orgFila();
	}
	/**
	 * O m�todo orgFila, esse m�todo tem como funcionalidade de organizar a fila 
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

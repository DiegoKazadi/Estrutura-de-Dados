/**
 * 
 */
package br.cesed.si.array;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Criação da class MinhaArray para o uso do ArrayListFacisa
 * @author Diego Kazadi
 *
 */
public class MinhaArray {
	private int contador;
	private int tamanho;
	private Object [] ArrayListFacisa ;
		/**
		 * O método Constructor que vai receber como parametro o tamanho do Array 
		 * 
		 * @param tamanho, que ajuda na definição do tamanho do ArrayListFacisa
		 * the initial size of MinhaArray
		 */
		public MinhaArray(int tamanho) {
			contador = 0;
			ArrayListFacisa = new Object [tamanho];
		}
		/**
		 * O método size do tipo inteiro que vai retornar o tamanho do ArrayListFacisa
		 * cujo ele refere-se a quantidade dos elementos que estão no Array
		 * Return the size of ArrayList.
		 * 
		 * @return contador
		 */
		public int size() {
			int contador = 0;
			for (int i = 0; i < ArrayListFacisa.length ; i++) {
				
				if(ArrayListFacisa[i] != null){
					contador += 1;
				}
			}//Pense com fore
			return contador;
		}
		public int length(){
			return ArrayListFacisa.length;
		}
		/**
		 * O método add que vai adicionar  os objectos do ArrayListFacisa
		 * 
		 * @param obj
		 */
		public void add(Object obj) {
			if(obj != null){
				if(ArrayListFacisa.length == contador){
					duplicarArray();
				}
				ArrayListFacisa[contador++] = obj;
			}
		}
		/**
		 * O método duplicarArray, vai dobrar o tamanho do array quando for necessario
		 * 
		 */
		public void duplicarArray(){
			Object[] ArrayListFacisaProlongado = new Object[ArrayListFacisa.length * 2];
			for (int i = 0; i < ArrayListFacisa.length; i++) {
				ArrayListFacisaProlongado[i] = ArrayListFacisa[i];
			}
			ArrayListFacisa = ArrayListFacisaProlongado;
		}
		/**
		 * O método remove que vai receber um paramentro do tipo Object e vai verificar se 
		 * o object exite no ArrayÇistFacisa, se for igual, o método remove esse objeto do Array
		 *  
		 * @param obj
		 */
		public void remove(Object obj) {
			if (obj == null){
				System.out.println("Obejto passou eh null, passa um objeto valido ");
				
			}else if(tamanho == 0){
				System.out.println("O ArrayListFacisa está vazio");
			}else{
				for (int i = 0; i < ArrayListFacisa.length; i++){
					if(ArrayListFacisa[i] == obj){
						System.out.println("Objecto " + ArrayListFacisa[i] + " apagado");
						ArrayListFacisa[i] = null;
					}
				}
				orgArray();
			}
		}
			
		/**
		 * Método removeIndex contrario ao primeiro remove, esse remove o objecto conforme a uma posição
		 * passada 
		 * @param index
		 */
		public void removeIndex(int index){
			if (index > tamanho){
				System.out.println("A posição eh maior que o tamanho do ArrayListFacisa ");
				
			}else{ 
				if (ArrayListFacisa[index]!= null){
					ArrayListFacisa[index] =null;
					tamanho --; 
					orgArray();
				}
			}
		}
		/**
		 * O método getByIndex que vai procurar o objecto por sua posição e exibe o
		 * Check the position of the informed object.
		 * 
		 * @param index
		 * @return Object
		 */
		
		public Object getByIndex(int index) {
			Object obj = null;
			if (index > tamanho){
				System.out.println("A posição invalida ");
			}else{
				obj = ArrayListFacisa[index];
			}
			return obj;
		}
		/**
		 * O método getIndex, que vai receber o objecto como parametro e depois retorna a sua 
		 * posição que ocupa no ArrayListFacisa
		 * @param obj
		 * @return index 
		 */
		public int getByValue(Object obj){
			int index = 0;
			if (obj == null){
				System.out.println("Objecto passou eh null ");
			}else{
				for (int i = 0; i < ArrayListFacisa.length; i++) {
					if(ArrayListFacisa[i].equals(obj)){
						index = i;
					}
				}
			}
			return index;
		}
		/**
		 * O método vai retornar a lista de todos objectos do ArrayListFacisa
		 * @return Array
		 */
		public ArrayList printAllObject() {
			ArrayList lista = new ArrayList();
			for (Object obj : lista) {
				if(obj != null){
					lista.add(obj);
				}
			}
			return lista;
		}
		/**
		 * O método orgDeques, esse método tem como funcionalidade de organizar e deixar o ArrayListFacisa
		 * bem arrumado
		 * @parm 
		 */
		public void orgArray(){
			Object [] objs = new Object[ArrayListFacisa.length];
			int num = 0;
			for (Object object : ArrayListFacisa) {
				if(object!=null){
					objs[num]=object;
					num ++;
				}
			}
			ArrayListFacisa = objs;
		}
		/* 
		 * (non-Javadoc)
		 * O método toString vai retornar o ArrayListFacisa e o seu tamanho
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MinhaArray (ArrayListFacisa)tem tamanho :" + tamanho + ", e seus Objectos :" + Arrays.toString(ArrayListFacisa) + "]";
		}
	}


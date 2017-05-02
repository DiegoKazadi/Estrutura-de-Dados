/**
 * 
 */
package br.cesed.si.array;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Cria��o da class MinhaArray para o uso do ArrayListFacisa
 * @author Diego Kazadi
 *
 */
public class MinhaArray {
	private int contador;
	private int tamanho;
	private Object [] ArrayListFacisa ;
		/**
		 * O m�todo Constructor que vai receber como parametro o tamanho do Array 
		 * 
		 * @param tamanho, que ajuda na defini��o do tamanho do ArrayListFacisa
		 * the initial size of MinhaArray
		 */
		public MinhaArray(int tamanho) {
			contador = 0;
			ArrayListFacisa = new Object [tamanho];
		}
		/**
		 * O m�todo size do tipo inteiro que vai retornar o tamanho do ArrayListFacisa
		 * cujo ele refere-se a quantidade dos elementos que est�o no Array
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
		 * O m�todo add que vai adicionar  os objectos do ArrayListFacisa
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
		 * O m�todo duplicarArray, vai dobrar o tamanho do array quando for necessario
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
		 * O m�todo remove que vai receber um paramentro do tipo Object e vai verificar se 
		 * o object exite no Array�istFacisa, se for igual, o m�todo remove esse objeto do Array
		 *  
		 * @param obj
		 */
		public void remove(Object obj) {
			if (obj == null){
				System.out.println("Obejto passou eh null, passa um objeto valido ");
				
			}else if(tamanho == 0){
				System.out.println("O ArrayListFacisa est� vazio");
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
		 * M�todo removeIndex contrario ao primeiro remove, esse remove o objecto conforme a uma posi��o
		 * passada 
		 * @param index
		 */
		public void removeIndex(int index){
			if (index > tamanho){
				System.out.println("A posi��o eh maior que o tamanho do ArrayListFacisa ");
				
			}else{ 
				if (ArrayListFacisa[index]!= null){
					ArrayListFacisa[index] =null;
					tamanho --; 
					orgArray();
				}
			}
		}
		/**
		 * O m�todo getByIndex que vai procurar o objecto por sua posi��o e exibe o
		 * Check the position of the informed object.
		 * 
		 * @param index
		 * @return Object
		 */
		
		public Object getByIndex(int index) {
			Object obj = null;
			if (index > tamanho){
				System.out.println("A posi��o invalida ");
			}else{
				obj = ArrayListFacisa[index];
			}
			return obj;
		}
		/**
		 * O m�todo getIndex, que vai receber o objecto como parametro e depois retorna a sua 
		 * posi��o que ocupa no ArrayListFacisa
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
		 * O m�todo vai retornar a lista de todos objectos do ArrayListFacisa
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
		 * O m�todo orgDeques, esse m�todo tem como funcionalidade de organizar e deixar o ArrayListFacisa
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
		 * O m�todo toString vai retornar o ArrayListFacisa e o seu tamanho
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "MinhaArray (ArrayListFacisa)tem tamanho :" + tamanho + ", e seus Objectos :" + Arrays.toString(ArrayListFacisa) + "]";
		}
	}


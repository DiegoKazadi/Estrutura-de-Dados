/**
 * 
 */
package br.cesed.si.p3.pilha;

import java.util.Arrays;

/**
 * Cria��o da class NovaPilha para o uso e manipula��o da pilha
 * @author Diego Kazadi
 *
 */
public class NovaPilha {
	public Object[] pilha;
    public int posicaoPilha;
    private int tamanho;
	/**
     * O m�todo constructor definindo  os valores de 2 variaveis e enstanciando o array interno
     * 
	 *@param posicaoPilha
	 *@param tamanho
	 *@param pilha 
	 */
	public NovaPilha() {
		super();
		this.posicaoPilha = 0;
		this.tamanho = 5;
		this.pilha = new Object[tamanho];
	}
	/**
	 * O m�todo boolean para verificar o estado da pilha se est� vazio ou n�o 
	 * isEmpty
	 * @return true ou false 
	 */
    public boolean estadoPilha(){
    	return posicaoPilha>0;
    }
    /**
     * O m�todo tamanhoPilha, que vai retornar o tamanho da pilha
     * @return size      
     */
    public int tamanhoPilha() {
    	return this.posicaoPilha;
    }
    /**
     * O m�todo exibeUltimoElemento para aoqual retorna o ultimo objecto da pilha 
     * top
     * @return obj
     */
    public Object exibeUltimoElemento() {
        return this.pilha[this.posicaoPilha -1];
    }
    /**
     * O m�todo desempilhar retira o objeto no topo da pilha e 
     * o retorna, ocorre erro se a pilha estiver vazia.
     * pop
     */
    public Object desempilhar() {
    	Object o = null;
    	if(estadoPilha()){
    		o = pilha[posicaoPilha--];
    	}
        return o;
    }
    /**
     * O m�todo empilhar, seu objetivo � de adicionar elemento na pilha
     * push caso o tamanho seja menor, esse m�todo vai chamar o m�todo duplicaTamanho
     * para que haja mais espa�o de armazenamento
     * @param elemento
     */
    public void empilhar(Object elemento) {
    	if(elemento != null){
        	if (posicaoPilha >= pilha.length ){
        		 duplicaTamanho();       		
        	}
        }
    	pilha[posicaoPilha++] = elemento;   	
    }
    /**
     * O m�todo duplicarTamanho, que vai doubrar o tamanho da pilha para facilitar 
     * a adicionar os elementos caso a pilha seja cheia
     * @param int tamanho
     * 
     */
    public void duplicaTamanho(){
    	Object[] pilhaMaior = new Object[pilha.length * 2];
		
		for (int i = 0; i < pilha.length; i++) {
			pilhaMaior[i] = pilha[i];
		}
		pilha = pilhaMaior;
    }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NovaPilha tem " + Arrays.toString(pilha) + "e seu tamanho eh " + tamanho + "]";
	}
}

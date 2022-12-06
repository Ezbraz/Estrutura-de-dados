package app.listas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaSeq {
    private String dados[]; // Vetor que contém os dados da lista
    private int nElementos;

    public ListaSeq(int tamMax) {
        nElementos = 0;
        dados = new String[tamMax];
    }

    /** Verifica se a Lista está vazia */
    public boolean vazia() {
        if (nElementos == 0) {
            return true;
        } else {
            return false;
        }
    }

    /** Verifica se a Lista está cheia */
    public boolean cheia() {
        return nElementos == dados.length;
    }

    /** Obtém o tamanho da Lista */
    public int tamanho() {
        return nElementos;
    }

    /**
     * Obtém o i-ésimo elemento de uma lista.
     * Retorna -1 se a posição for inválida.
     */
    public String elemento(int pos) {
        /*
         * Se posição estiver fora dos limites <= 0
         * ou > tamanho da lista
         */
        if (pos > nElementos || pos <= 0) {
            return "";
        }

        return dados[pos - 1];
    }

    /**
     * Retorna a posição de um elemento pesquisado.
     * Retorna -1 caso não seja encontrado
     */
    public int posicao(String valor) {
        valor = valor.trim();
        /*
         * Procura elemento a elemento, se o dado está na
         * lista. Se estiver, retorna a sua posição no array+1
         */
        for (int i = 0; i < nElementos; i++) {
            if (dados[i].equals(valor)) {
                return i + 1;
            }
        }

        return -1;
    }

    /**
     * Retorna a posição de um elemento pesquisado.
     * Retorna -1 caso não seja encontrado
     */
    public int posicao(String valor, int desloc) {
        /*
         * Procura elemento a elemento, se o dado está na
         * lista. Se estiver, retorna a sua posição no array+1
         */
        for (int i = desloc; i < nElementos; i++) {
            if (dados[i].equals(valor)) {
                return i + 1;
            }
        }
        return -1;
    }

    /**
     * Insere um elemento em uma determinada posição
     * Retorna false se a lista estiver cheia ou
     * a posição for inválida. Caso contrário retorna true
     */
    public boolean insere(int pos, String valor) {
        /*
         * Verifica se a lista está cheia ou se a posicao a ser
         * inserida eh invalida (i.e., > tamanho da lista+1
         */
        if (cheia() || pos > (nElementos + 1) || pos <= 0) {
            return false;
        }

        /*
         * Desloca os elementos após pos, uma posicao a
         * direita. Isso serve para abrir espaço para insercao
         * do novo elemento
         */
        for (int i = nElementos; i >= pos; i--) {
            dados[i] = dados[i - 1];
        }

        /* Insere o dado na posicao correta */
        dados[pos - 1] = valor;

        /* Incrementa o numero de elementos na lista */
        nElementos++;
        return true;
    }

    /**
     * Remove um elemento de uma determinada posição
     * Retorna o valor do elemento removido. -1 caso a remoção falhe
     */
    public String remove(int pos) {
        /* Verifica se a posicao eh valida */
        if (pos > nElementos || pos < 1) {
            return "";
        }

        /* Armazena o dado a ser removido na var "dado" */
        String aux = dados[pos - 1];

        /*
         * Desloca todos os elementos após 'pos', uma
         * posicao a esquerda
         */
        for (int i = pos - 1; i < nElementos - 1; i++) {
            dados[i] = dados[i + 1];
        }

        /* Decrementa o numero de elementos na lista */
        nElementos--;
        return aux;
    }

    public String printArr() {
        return Arrays.toString(dados);
    }
}
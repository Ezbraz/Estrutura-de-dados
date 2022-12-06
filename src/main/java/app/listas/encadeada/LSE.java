package app.listas.encadeada;

public class LSE {
    private No cabeca;
    private int nElementos;

    public LSE() {
        cabeca = null;
        nElementos = 0;
    }

    /** Verifica se a Lista está vazia */
    public boolean vazia() {
        if (nElementos == 0)
            return true;
        else
            return false;
    }

    /** Obtém o tamanho da Lista */
    public int tamanho() {
        // return nElementos;

        No aux = cabeca;
        int cont = 0;
        while (aux != null) {
            aux = aux.getProx();
            cont++;
        }
        return cont;
    }

    /**
     * Obtém o i-ésimo elemento de uma lista
     * Retorna o valor encontrado.
     */
    public String elemento(int pos) {
        if (vazia()) {
            return ""; // Consulta falhou
        }

        if ((pos < 1) || (pos > tamanho())) {
            return ""; // Posicao invalida
        }

        No aux = cabeca;
        // Percorre a lista do 1o elemento até pos
        for (int i = 1; i < pos; i++) {
            // modifica "aux" para apontar para o proximo elemento da lista
            aux = aux.getProx();
        }

        return aux.getConteudo();
    }

    /**
     * Retorna a posição de um elemento pesquisado.
     * Retorna caso não seja encontrado
     */
    public int posicao(String dado) {
        /* Lista vazia */
        if (vazia()) {
            return -1;
        }

        /* Percorre a lista do inicio ao fim até encontrar o elemento */
        No aux = cabeca;
        int cont = 1;
        while (aux != null) {
            // Se encontrar o elemento, retorna sua posicao n;
            if (aux.getConteudo().equals(dado)) {
                return cont;
            }

            // modifica "aux" para apontar para o proximo elemento da lista
            aux = aux.getProx();
            cont++;
        }

        return -1;
    }

    /** Insere nó em lista vazia */
    private boolean insereInicioLista(String valor) {
        // Aloca memoria para novo no
        No novoNo = new No();

        // Insere novo elemento na cabeca da lista
        novoNo.setConteudo(valor);

        novoNo.setProx(cabeca);
        cabeca = novoNo;
        nElementos++;
        return true;
    }

    /** Insere nó no meio da lista */
    private boolean insereMeioLista(int pos, String valor) {

        // Aloca memoria para novo no
        No novoNo = new No();
        novoNo.setConteudo(valor);

        // Localiza a pos. ANTERIOR onde será inserido o novo nó
        No aux = cabeca;
        for (int i = 1; i < pos - 1; i++) {
            // modifica "aux" para apontar para o proximo elemento da lista
            aux = aux.getProx();
        }

        // Insere novo elemento apos aux
        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);

        nElementos++;
        return true;
    }

    public boolean insere(int pos, String valor) {
        if ((vazia()) && (pos != 1)) {
            return false; /* lista vazia mas posicao inv */
        }

        if ((pos <= 0) || pos > (nElementos + 1)) {
            return false; // posicao invalida
        }

        /* inserção no início da lista (ou lista vazia) */
        if (pos == 1) {
            return insereInicioLista(valor);
        } else {
            return insereMeioLista(pos, valor);
        }
    }

    /** Remove elemento do início da lista */
    private String removeInicioLista() {
        No p = cabeca;

        // Dado recebe o dado removido
        String valorRemovido = p.getConteudo();

        // Retira o 1o elemento da lista (p)
        cabeca = p.getProx();
        nElementos--;

        // Sugere ao garbage collector que libere a memoria
        // da regiao apontada por p
        p = null;

        return valorRemovido;
    }

    /** Remove elemento no meio da lista */
    private String removeNaLista(int pos) {
        // Localiza os nó a ser removido (atual) e o seu
        // antecessor (antecessor)
        No antecessor = cabeca;
        for (int i = 1; i < pos - 1; i++) {
            antecessor = antecessor.getProx();
        }
        No atual = antecessor.getProx();

        // Guarda o valor a ser removido
        String valorRemovido = atual.getConteudo();

        // Faz o campo prox de antecessor apontar pro
        // prox de atual
        // No aux = atual.getProx();
        // antecessor.setProx(aux);
        antecessor.setProx(atual.getProx());

        // Decrementa o numero de elementos
        nElementos--;

        // Sugere ao GC que libere a memoria do no atual
        atual = null;

        return valorRemovido;
    }

    public String remove(int pos) {
        if (vazia()) {
            return ""; // Lista vazia
        }

        if ((pos <= 0) || (pos > nElementos)) {
            return ""; // Posicao invalida
        }

        // Remoção do elemento da cabeça da lista
        if (pos == 1) {
            return removeInicioLista();
        }
        // Remoção em outro lugar da lista
        else {
            return removeNaLista(pos);
        }
    }
}

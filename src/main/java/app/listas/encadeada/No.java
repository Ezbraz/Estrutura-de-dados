package app.listas.encadeada;

class No {
    private String conteudo;
    private No prox;

    public No() {
        setConteudo("0");
        setProx(null);
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

}

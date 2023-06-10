package br.com.salomaotech.lista;

public class No<T> {

    private final T conteudo;
    private No proximo;

    public No(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public T getConteudo() {
        return conteudo;
    }

}

package br.com.salomaotech.arvore;

public class NoArvore {

    private final int valor;
    private NoArvore noEsquerdo = null;
    private NoArvore noDireito = null;

    public NoArvore(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public NoArvore getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(NoArvore noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public NoArvore getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(NoArvore noDireito) {
        this.noDireito = noDireito;
    }

}

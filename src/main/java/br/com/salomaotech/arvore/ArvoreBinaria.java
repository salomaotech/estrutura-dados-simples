package br.com.salomaotech.arvore;

public class ArvoreBinaria {

    private NoArvore raiz = null;

    public void inserir(int valor) {

        raiz = inserirNo(raiz, valor);

    }

    private NoArvore inserirNo(NoArvore atual, int valor) {

        if (atual == null) {

            return new NoArvore(valor);

        }

        if (valor < atual.getValor()) {

            atual.setNoEsquerdo(inserirNo(atual.getNoEsquerdo(), valor));

        }

        if (valor > atual.getValor()) {

            atual.setNoDireito(inserirNo(atual.getNoDireito(), valor));

        }

        return atual;

    }

    public void percorrerOrdem() {

        percorrerEmOrdem(raiz);

    }

    private void percorrerEmOrdem(NoArvore atual) {

        if (atual != null) {

            percorrerEmOrdem(atual.getNoEsquerdo());
            System.out.println(atual.getValor() + " ");
            percorrerEmOrdem(atual.getNoDireito());

        }

    }

}

package br.com.salomaotech.lista;

public class ListaLigada<T> {

    private No[] noArray;
    private No ultimoNoCriado;

    private void expandirNos() {

        No[] noArrayBackup = new No[noArray.length + 1];

        /* copia para backup */
        for (int i = 0; i <= noArray.length - 1; i++) {

            noArrayBackup[i] = noArray[i];

        }

        noArray = noArrayBackup;

    }

    private void recalcularNos() {

        No[] noArrayBackup = new No[noArray.length];

        /* copia para backup */
        int i = 0;
        for (No no : noArray) {

            if (no != null) {

                noArrayBackup[i] = no;
                i++;

            }

        }

        /* reseta */
        noArray = null;
        ultimoNoCriado = null;

        /* adiciona novos itens a partir do backup */
        for (No no : noArrayBackup) {

            if (no != null) {

                this.add((T) no.getConteudo());

            }

        }

    }

    public void add(T conteudo) {

        if (noArray == null) {

            /* cria um array com apenas um indice */
            noArray = new No[1];

            /* cria um nó e adiciona na posição inicial */
            ultimoNoCriado = new No(conteudo);
            noArray[0] = ultimoNoCriado;

        } else {

            /* cria-se o novo nó */
            No novoNo = new No(conteudo);

            /* atualiza-se o no anterior apontando para o novo nó */
            ultimoNoCriado.setProximo(novoNo);
            ultimoNoCriado = novoNo;

            expandirNos();
            noArray[noArray.length - 1] = novoNo;

        }

    }

    public void remove(int index) {
        noArray[index] = null;
        recalcularNos();
    }

    public No get(int index) {
        return noArray[index];
    }

    public No[] getList() {
        return noArray;
    }

}

package br.com.salomaotech.fila;

public class Impressora {

    private final Fila<String> fila = new Fila();

    public void addDocumento(String documento) {

        fila.inserir(documento);

    }

    public void imprimir() {

        int quantidadeDeItens = fila.getSize();

        for (int i = 0; i <= quantidadeDeItens; i++) {

            String documento = fila.getPrimeiroDaFila();

            if (documento != null) {

                System.out.println("Imprimindo documento número: " + (i + 1));
                System.out.println(documento);
                System.out.println("\n");
                fila.remover();

            }

        }

    }

}

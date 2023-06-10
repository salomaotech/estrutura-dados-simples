package br.com.salomaotech.grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {

    private final List<List> arestasEntrada;
    private final List<List> arestasSaida;

    public Grafo(int numeroVertices) {

        arestasEntrada = new ArrayList(numeroVertices);
        arestasSaida = new ArrayList(numeroVertices);

        for (int i = 0; i <= numeroVertices; i++) {

            arestasEntrada.add(new ArrayList());
            arestasSaida.add(new ArrayList());

        }

    }

    public void adicionarAresta(int origem, int destino) {

        arestasEntrada.get(destino).add(origem);
        arestasSaida.get(origem).add(destino);

    }

    public void imprimirGrafo() {

        for (int i = 0; i <= arestasEntrada.size() - 1; i++) {

            List visinhosEntrada = arestasEntrada.get(i);
            List visinhosSaida = arestasSaida.get(i);

            System.out.println("Vértice " + i + " está conectado aos vertices abaixo:");
            for (int s = 0; s <= visinhosEntrada.size() - 1; s++) {

                System.out.println(visinhosEntrada.get(s));

            }

            System.out.println();

            System.out.println("Vértice " + i + " está conectado aos vertices abaixo:");
            for (int s = 0; s <= visinhosSaida.size() - 1; s++) {

                System.out.println(visinhosSaida.get(s));

            }

            System.out.println();

        }

    }

}

package br.com.salomaotech.mapa;

import java.util.ArrayList;
import java.util.List;

public class Mapa<T> {

    private final List<T> chaves = new ArrayList();
    private final List<T> valores = new ArrayList();

    public void put(T chave, T valor) {

        if (!chaves.contains(chave)) {

            chaves.add(chave);
            valores.add(valor);

        }

    }

    public T get(T chave) {

        int index = 0;

        for (T chaveComparativa : chaves) {

            if (chaveComparativa.equals(chave)) {

                return valores.get(index);

            }

            index++;

        }

        return null;

    }

    public int size() {

        return chaves.size();

    }

}

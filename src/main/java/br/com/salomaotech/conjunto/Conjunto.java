package br.com.salomaotech.conjunto;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {

    private final List<String> elementos = new ArrayList();

    public void add(String conteudo) {

        if (!elementos.contains(conteudo)) {

            elementos.add(conteudo);

        }

    }

    public void remove(String conteudo) {

        elementos.remove(conteudo);

    }

    public boolean contains(String conteudo) {

        return elementos.contains(conteudo);

    }

    public int size() {

        return elementos.size();

    }

    public List<String> getElementos() {
        return elementos;
    }

}

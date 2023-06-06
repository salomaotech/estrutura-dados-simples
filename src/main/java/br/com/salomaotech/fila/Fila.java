package br.com.salomaotech.fila;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {

    private final List<T> fila = new ArrayList();

    public void inserir(T elemento) {

        fila.add(elemento);

    }

    public void remover() {

        try {

            fila.remove(0);

        } catch (Exception ex) {

        }

    }

    public T getPrimeiroDaFila() {

        try {

            return fila.get(0);

        } catch (Exception ex) {

            return null;

        }

    }

    public T getUltimoDaFila() {

        try {

            return fila.get(fila.size() - 1);

        } catch (Exception ex) {

            return null;

        }

    }

    public boolean isVazia() {

        return fila.isEmpty();

    }

    public int getSize() {

        return fila.size();

    }

}

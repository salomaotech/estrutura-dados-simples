package br.com.salomaotech.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {

    private int posicao = -1;
    private final List<T> pilha = new ArrayList();

    public void push(T elemento) {

        pilha.add(elemento);
        posicao++;

    }

    public T pop() {

        try {

            T elemento = pilha.remove(posicao);
            posicao--;
            return elemento;

        } catch (Exception ex) {

            return null;

        }

    }

    public T peek() {

        try {

            return pilha.get(posicao);

        } catch (Exception ex) {

            return null;

        }

    }

    public boolean isEmpty() {

        return pilha.isEmpty();

    }

}

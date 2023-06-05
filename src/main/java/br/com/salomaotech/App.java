package br.com.salomaotech;

import br.com.salomaotech.arrays.ArrayExemplo;
import br.com.salomaotech.pilha.HistoricoDeNavegacao;

public class App {

    private static void array() {

        ArrayExemplo.exibir();
    }

    private static void pilha() {

        HistoricoDeNavegacao historicoDeNavegacao = new HistoricoDeNavegacao();
        historicoDeNavegacao.abrirSite("www.microsoft.com");
        historicoDeNavegacao.abrirSite("www.linkedin.com");
        historicoDeNavegacao.abrirSite("www.netflix.com");
        historicoDeNavegacao.abrirSite("www.instagram.com");

        historicoDeNavegacao.voltar();
        historicoDeNavegacao.voltar();
        historicoDeNavegacao.voltar();
        historicoDeNavegacao.voltar();

        historicoDeNavegacao.avancar();
        historicoDeNavegacao.avancar();
        historicoDeNavegacao.avancar();
        historicoDeNavegacao.avancar();

        System.out.println(historicoDeNavegacao.getUrlAtual());

    }

    public static void main(String[] args) {

    }

}

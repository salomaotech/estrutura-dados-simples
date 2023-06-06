package br.com.salomaotech;

import br.com.salomaotech.arrays.ArrayExemplo;
import br.com.salomaotech.fila.Impressora;
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

    private static void fila() {

        Impressora impressora = new Impressora();
        impressora.addDocumento("Documento A");
        impressora.addDocumento("Documento B");
        impressora.addDocumento("Documento C");
        impressora.addDocumento("Com este livro, você irá partir do nível zero e alcançará um conhecimento intermediário em Java! Com explicações claras e exemplos práticos, você será guiado de forma gradual pelos conceitos básicos dessa linguagem de programação. ");
        impressora.imprimir();

    }

    public static void main(String[] args) {

    }

}

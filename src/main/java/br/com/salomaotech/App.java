package br.com.salomaotech;

import br.com.salomaotech.arrays.ArrayExemplo;
import br.com.salomaotech.conjunto.Conjunto;
import br.com.salomaotech.fila.Impressora;
import br.com.salomaotech.lista.ListaLigada;
import br.com.salomaotech.lista.No;
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

    private static void listaLigada() {

        ListaLigada<String> lista = new ListaLigada();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        lista.remove(2);

        No[] nos = lista.getList();

        for (No no : nos) {

            if (no.getProximo() != null) {

                System.out.println("Atual (" + no.getConteudo() + ") próximo (" + no.getProximo().getConteudo() + ")");

            }

        }

    }

    private static void conjunto() {

        Conjunto segundaFeira = new Conjunto();
        Conjunto terfaFeira = new Conjunto();

        segundaFeira.add("Estudar Matemática: Revisar anotações e resolver exercícios.");
        segundaFeira.add("Ler capítulo de História para a próxima aula.");
        segundaFeira.add("Fazer resumo dos conceitos principais de Biologia.");
        segundaFeira.add("Resolver exercícios de Química.");
        segundaFeira.add("Revisar tópicos difíceis e fazer anotações adicionais.");
        segundaFeira.add("Elaborar cronograma de estudos para a semana.");
        segundaFeira.add("Fazer revisão rápida antes de dormir.");
        segundaFeira.remove("Resolver exercícios de Química.");

        terfaFeira.add("Revisar resumos de Matemática e resolver mais exercícios.");
        terfaFeira.add("Estudar Geografia usando materiais complementares.");
        terfaFeira.add("Realizar sessão de estudo em grupo, se possível.");
        terfaFeira.add("Fazer pausa para atividade física ou relaxamento.");
        terfaFeira.add("Criar flashcards de Química para revisão.");
        terfaFeira.add("Fazer teste de autoavaliação.");
        terfaFeira.add("Preparar material para a aula seguinte.");

        for (String elemento : segundaFeira.getElementos()) {

            System.out.println(elemento);

        }

        System.out.print("\n");

        for (String elemento : terfaFeira.getElementos()) {

            System.out.println(elemento);

        }

    }

    public static void main(String[] args) {

    }

}

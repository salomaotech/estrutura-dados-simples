package br.com.salomaotech;

import br.com.salomaotech.arrays.ArrayExemplo;
import br.com.salomaotech.arvore.ArvoreBinaria;
import br.com.salomaotech.conjunto.Conjunto;
import br.com.salomaotech.fila.Impressora;
import br.com.salomaotech.grafo.Grafo;
import br.com.salomaotech.lista.ListaLigada;
import br.com.salomaotech.lista.No;
import br.com.salomaotech.mapa.Mapa;
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

    private static void mapa() {

        Mapa<String> mapa = new Mapa();
        mapa.put("www.salomaotech.com", "2a02:4780:13:918:0:1d22:12ad:3");
        mapa.put("www.google.com", "2800:3f0:4001:822::2004");
        mapa.put("www.taimber.com", "2a02:4780:13:918:0:1d22:12ad:2");

        System.out.println(mapa.size());

    }

    private static void arvoreBinaria() {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(33);
        arvoreBinaria.inserir(20);
        arvoreBinaria.inserir(2);
        arvoreBinaria.inserir(45);
        arvoreBinaria.inserir(8);
        arvoreBinaria.inserir(28);
        arvoreBinaria.inserir(39);
        arvoreBinaria.inserir(22);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(48);
        arvoreBinaria.inserir(35);
        arvoreBinaria.inserir(18);
        arvoreBinaria.inserir(44);
        arvoreBinaria.inserir(38);
        arvoreBinaria.inserir(42);
        arvoreBinaria.inserir(26);
        arvoreBinaria.inserir(31);
        arvoreBinaria.inserir(25);
        arvoreBinaria.inserir(14);
        arvoreBinaria.inserir(43);
        arvoreBinaria.inserir(40);
        arvoreBinaria.inserir(13);
        arvoreBinaria.inserir(29);
        arvoreBinaria.inserir(12);
        arvoreBinaria.inserir(11);
        arvoreBinaria.inserir(49);
        arvoreBinaria.inserir(23);
        arvoreBinaria.inserir(41);
        arvoreBinaria.inserir(1);
        arvoreBinaria.inserir(19);
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(15);
        arvoreBinaria.inserir(6);
        arvoreBinaria.inserir(24);
        arvoreBinaria.inserir(46);
        arvoreBinaria.inserir(30);
        arvoreBinaria.inserir(47);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(9);
        arvoreBinaria.inserir(16);
        arvoreBinaria.inserir(36);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(21);
        arvoreBinaria.inserir(0);
        arvoreBinaria.inserir(34);
        arvoreBinaria.inserir(27);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(32);
        arvoreBinaria.inserir(50);
        arvoreBinaria.inserir(17);
        arvoreBinaria.inserir(37);
        arvoreBinaria.percorrerOrdem();

    }

    private static void grafo() {

        Grafo grafo = new Grafo(5);
        grafo.adicionarAresta(0, 4);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 2);
        grafo.adicionarAresta(3, 1);
        grafo.adicionarAresta(4, 0);
        grafo.adicionarAresta(5, 3);
        grafo.adicionarAresta(5, 2);
        grafo.imprimirGrafo();

    }

    public static void main(String[] args) {

    }

}

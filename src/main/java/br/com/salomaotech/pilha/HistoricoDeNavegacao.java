package br.com.salomaotech.pilha;

public class HistoricoDeNavegacao {

    private final Pilha<String> historicoVolta = new Pilha();
    private final Pilha<String> historicoAvanca = new Pilha();
    private String urlAtual;

    public void abrirSite(String url) {

        historicoVolta.push(url);
        urlAtual = url;

    }

    public void voltar() {

        historicoVolta.pop();
        historicoAvanca.push(urlAtual);
        urlAtual = historicoVolta.peek();

    }

    public void avancar() {

        urlAtual = historicoAvanca.pop();
        historicoVolta.push(urlAtual);

    }

    public String getUrlAtual() {
        return urlAtual;
    }

}

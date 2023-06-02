package br.com.salomaotech.arrays;

public class ArrayExemplo {

    public static void exibir() {

        String[] nomes = new String[10];
        int[] idades = new int[10];
        Object[][] dados = new Object[10][2];

        /* dimensional */
        nomes[0] = "Salomão Silva";
        idades[0] = 33;
        System.out.println(nomes[0]);
        System.out.println(idades[0]);

        /* multidimensional */
        dados[0][0] = "Salomão Silva";
        dados[0][1] = 33;
        System.out.println(dados[0][0]);
        System.out.println(dados[0][1]);

    }

}

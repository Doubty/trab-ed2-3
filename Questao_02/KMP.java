package Questao_02;

class KMP {

    void buscaKMP(String padrao, String texto) {
        int M = padrao.length();
        int N = texto.length();
        int quantidadeOcorrencias = 0;
        // tabela de préfixo com o tamanho do texto
        int tabelaPrefixo[] = new int[M];
        int j = 0;

        criarTabelaPrefixo(padrao, M, tabelaPrefixo);

        int i = 0; // index para o texto
        while (i < N) {
            if (padrao.charAt(j) == texto.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Padrão encontrado no indice: " + (i - j));
                j = tabelaPrefixo[j - 1];
                quantidadeOcorrencias++;
            } else if (i < N && padrao.charAt(j) != texto.charAt(i)) {

                if (j != 0) {
                    j = tabelaPrefixo[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }

        System.out.println("Total de ocorrências: " + quantidadeOcorrencias);
    }

    void criarTabelaPrefixo(String padrao, int M, int tabelaPrefixo[]) {

        int tamanhoPrefixo = 0;
        int i = 1;
        tabelaPrefixo[0] = 0; // o índice zero da tabela de prefixo é sempre 0

        while (i < M) {
            if (padrao.charAt(i) == padrao.charAt(tamanhoPrefixo)) {
                tamanhoPrefixo++;
                tabelaPrefixo[i] = tamanhoPrefixo;
                i++;
            } else {

                if (tamanhoPrefixo != 0) {
                    tamanhoPrefixo = tabelaPrefixo[tamanhoPrefixo - 1];

                } else {
                    tabelaPrefixo[i] = tamanhoPrefixo;
                    i++;
                }
            }
        }
    }

    // Testando a classe KMP com a leitura de arquivo
    public static void main(String args[]) {

        Arquivo file = new Arquivo();
        // Tentei ler o arquivo do projeto, mas estava dando erro, coloquei o caminho direto do computador
        String texto = file.Read("C:/Users/galva/Desktop/teste-trabalho3.txt");
        String padrao = "TATATAAGAAAAAAG";

        System.out.println("Texto: \n" + texto);
        System.out.println("Padrão 01: " + padrao);
        new KMP().buscaKMP(padrao, texto);

        System.out.println("");
        padrao = "AGACTCTG";
        System.out.println("Padrão 02: " + padrao);
        new KMP().buscaKMP(padrao, texto);

        System.out.println("");
        padrao = "GAGAGCGG";
        System.out.println("Padrão 03: " + padrao);
        new KMP().buscaKMP(padrao, texto);

        System.out.println("");
        padrao = "TCCTCCCAC";
        System.out.println("Padrão 04: " + padrao);
        new KMP().buscaKMP(padrao, texto);
    }
}

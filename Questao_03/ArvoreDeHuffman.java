package Questao_03;

import java.util.*;

// usando o comparable para simplificar nas comparações e estou adaptando de acordo com o que entendi do vídeo e outras referências
abstract class Huffman implements Comparable<Huffman> {

    public final int frequencia; // a frequência da árvore

    public Huffman(int freq) {
        frequencia = freq;
    }

    // comparar a frequência
    public int compareTo(Huffman arv) {
        return frequencia - arv.frequencia;
    }
}

class NoFolha extends Huffman {

    public final char valor; // Classe para representar o Nó folha da árvore

    public NoFolha(int freq, char val) {
        super(freq);
        valor = val;
    }
}

class No extends Huffman {

    public final Huffman esq, dir; // as sub-árvores da árvore de huffman que são os Nós, visto que cada nó é uma árvore

    public No(Huffman l, Huffman r) {
        super(l.frequencia + r.frequencia);
        esq = l;
        dir = r;
    }
}

public class ArvoreDeHuffman {

    // A entrada é uma vetor  de frequências, indexada por código dos caracteres
    public static Huffman construirArvore(int[] charFreqs) {
        // Usar a lista de prioriodade para a árvore e lembrar depois de implementar ela
        // usando lista da coleção apenas para teste
        PriorityQueue<Huffman> arvs = new PriorityQueue<Huffman>();
        // inicialmente, temos uma floresta de folhas
        // um para cada caractere não vazio
        for (int i = 0; i < charFreqs.length; i++) {
            if (charFreqs[i] > 0) {
                arvs.offer(new NoFolha(charFreqs[i], (char) i));
            }
        }

        // loop até que exista apenas uma árvore restante
        while (arvs.size() > 1) {

            Huffman a = arvs.poll();
            Huffman b = arvs.poll();

            // colocar em um novo nó e inserir novamente na fila
            arvs.offer(new No(a, b));
        }
        return arvs.poll();
    }

    public static void mostrarTabela(Huffman arv, StringBuffer prefixo) {

        if (arv instanceof NoFolha) {
            NoFolha folha = (NoFolha) arv;

            //exibindo a tabela 
            System.out.println(folha.valor + "\t" + folha.frequencia + "\t" + prefixo);

        } else if (arv instanceof No) {
            No no = (No) arv;

            // transversal a esquerda
            prefixo.append('0');
            mostrarTabela(no.esq, prefixo);
            prefixo.deleteCharAt(prefixo.length() - 1);

            // transversal a direita
            prefixo.append('1');
            mostrarTabela(no.dir, prefixo);
            prefixo.deleteCharAt(prefixo.length() - 1);
        }
    }

    public static void main(String[] args) {

        // De acordo com uma dica que recebi, para simplificar o código irei considerar que
        // os  caracteres tem código menor que 256 
        int[] charFreqs = new int[256];
        Arquivo arq = new Arquivo();
        // Tentei ler o arquivo do projeto, mas estava dando erro, coloquei o caminho direto do computador
        String texto = arq.Read("C:/Users/galva/Desktop/teste-trabalho3.txt");
        // está apresetando um pequeno bug na apresentaçao da tabela, quebrando ela, visto que é quando é mostrando a contagem de quebra de linha
        System.out.print("Texto usado: \n\n" + texto);
        // texto do arquivo de texto ou string
        String test = texto;

        // Aqui irei ler cada caractere e registrar as frequências
        for (char c : test.toCharArray()) {
            charFreqs[c]++;
        }

        // construindo a árvore de huffman de acordo com os caracteres e fraquências dos caracteres
        Huffman arv = construirArvore(charFreqs);

        // Resultado e tabela de codificação
        System.out.println("\n\nSimbolo\tQTD\tCodigo");
        mostrarTabela(arv, new StringBuffer());
    }
}

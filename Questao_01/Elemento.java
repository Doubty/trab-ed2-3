package Questao_01;

public class Elemento<C, V> {

    C chave;
    V valor;
    int freq;

    Elemento() {

    }

    Elemento(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
        this.freq = 0;
    }

}

package Questao_01;

public class ListaAutoAjuste {

    int tamanho = 31;
    int quantidadeElementos;
    Elemento<?, ?> vetor[];

    public ListaAutoAjuste(int tamanho) {
        this.tamanho = tamanho;

        vetor = new Elemento[tamanho];

        quantidadeElementos = 0;
    }

    public ListaAutoAjuste() {
        vetor = new Elemento[tamanho];

        quantidadeElementos = 0;

    }

    public Elemento<?, ?> procurar(Elemento<?, ?> e) {

        Elemento<?, ?> novo = null;
        for (int i = 0; i < quantidadeElementos; i++) {

            if (e.chave.equals(vetor[i].chave)) {
                return vetor[i];
            }

        }

        return novo;
    }

    public boolean adicionar(Elemento<?, ?> e) {

        if (quantidadeElementos >= 31) {
            return false;
        } else {

            vetor[quantidadeElementos] = e;
            quantidadeElementos++;
            return true;

        }

    }

    public boolean remover(Elemento<?, ?> e) {

        Elemento<?, ?> buscado = procurar(e);

        if (buscado == null) {
            return false;
        } else {
            boolean achado = false;

            for (int i = 0; i < quantidadeElementos; i++) {

                if (buscado.chave.equals(vetor[i].chave)) {
                    vetor[i] = null;
                    achado = true;
                }

                if (achado) {
                    if (i < tamanho - 1) {
                        vetor[i] = vetor[i + 1];
                    } else {
                        vetor[i] = null;
                    }
                }

            }
            quantidadeElementos--;
            return true;
        }
    }

    public void mostrar() {

        if (quantidadeElementos == 0) {
            System.out.println("Lista vazia!!!");
        } else {

            for (int i = 0; i < quantidadeElementos; i++) {
                System.out.println("[" + i + "] Chave = " + vetor[i].chave + ", Valor = " + vetor[i].valor + ", Frequencia = " + vetor[i].freq);
            }

        }

    }

    public Elemento<?, ?> procuraMoverParaFrente(Elemento<?, ?> e) {

        for (int i = 0; i < quantidadeElementos; i++) {

            if (e.chave.equals(vetor[i].chave)) {
                vetor[i].freq++;
                for (int j = i; j > 0; j--) {
                    Elemento<?, ?> auxiliar;
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = auxiliar;
                }
                return vetor[i];
            }

        }

        return null;
    }

    public Elemento<?, ?> procuraContadorDeFrequencia(Elemento<?, ?> e) {

        for (int i = 0; i < quantidadeElementos; i++) {

            if (e.chave.equals(vetor[i].chave)) {
                vetor[i].freq++;
                for (int j = i; j > 0; j--) {
                    if (vetor[j].freq >= vetor[j - 1].freq) {
                        Elemento<?, ?> auxiliar;
                        auxiliar = vetor[j];
                        vetor[j] = vetor[j - 1];
                        vetor[j - 1] = auxiliar;
                    } else {

                        j = -1;

                    }

                }
                return vetor[i];
            }

        }

        return null;
    }

}

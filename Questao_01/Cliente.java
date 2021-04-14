package Questao_01;

public class Cliente {

    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }

    public Object acessarSiteContadorDeFrequencia(Object chave, ManipulaDNS mdns) {
        Elemento<?, ?> retorno = (Elemento<?, ?>) mdns.acessarSiteContadorDeFrequencia(chave);

        if (retorno != null) {
            return ("Cliente " + this.nome + ", URL = " + chave + ", IP = " + retorno.valor);
        } else {
            return null;
        }

    }

    public Object acessarSiteMoverParaFrente(Object chave, ManipulaDNS mdns) {

        Elemento<?, ?> retorno = (Elemento<?, ?>) mdns.acessarSiteMoverParaFrente(chave);

        if (retorno != null) {
            return ("Cliente " + this.nome + ", URL = " + chave + ", IP = " + retorno.chave);
        } else {
            return null;
        }

    }

}

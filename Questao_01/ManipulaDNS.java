package Questao_01;

public class ManipulaDNS {

    ListaAutoAjuste ls;

    public ManipulaDNS(ListaAutoAjuste ls) {
        this.ls = ls;
    }

    public ManipulaDNS() {
        ls = new ListaAutoAjuste();
    }

    public boolean adicionaSite(Object chave, Object valor) {
        Elemento<Object, Object> novo = new Elemento<Object, Object>(chave, valor);
        return ls.adicionar(novo);
    }

    public boolean removerSite(Object chave) {
        Elemento<Object, Object> novo = new Elemento<Object, Object>(chave, null);

        if (ls.procurar(novo) == null) {
            return false;
        } else {
            return ls.remover(novo);
        }

    }

    public Object acessarSiteContadorDeFrequencia(Object chave) {
        Elemento<Object, Object> novo = new Elemento<Object, Object>(chave, null);
        return ls.procuraContadorDeFrequencia(novo);
    }

    public Object acessarSiteMoverParaFrente(Object chave) {
        Elemento<Object, Object> novo = new Elemento<Object, Object>(chave, null);
        return ls.procuraMoverParaFrente(novo);
    }

    public void mostrar() {
        ls.mostrar();
    }

}

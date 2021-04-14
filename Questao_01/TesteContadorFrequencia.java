package Questao_01;

public class TesteContadorFrequencia {

    public static void main(String[] args) {

        ManipulaDNS mdns = new ManipulaDNS();

        mdns.adicionaSite("www.globo.com", "168.0.0.0");
        mdns.adicionaSite("www.globoesporte.com", "168.0.0.1");
        mdns.adicionaSite("www.techtudo.com", "168.0.0.2");
        mdns.adicionaSite("www.animessite.com", "168.0.0.3");
        mdns.adicionaSite("www.americanas.com", "168.0.0.4");
        mdns.adicionaSite("www.magazineluiza.com", "168.0.0.5");
        mdns.adicionaSite("www.casasbahia.com", "168.0.0.6");
        mdns.adicionaSite("www.espn.com", "168.0.0.7");
        mdns.adicionaSite("www.uol.com", "168.0.0.8");
        mdns.adicionaSite("www.foxsports.com", "168.0.0.9");
        mdns.adicionaSite("www.youtube.com", "168.0.0.10");
        mdns.adicionaSite("www.drive.com", "168.0.0.11");
        mdns.adicionaSite("www.gmail.com", "168.0.0.12");
        mdns.adicionaSite("www.meet.com", "168.0.0.13");
        mdns.adicionaSite("www.noticias.com", "168.0.0.14");
        mdns.adicionaSite("www.github.com", "168.0.0.15");
        mdns.adicionaSite("www.java.com", "168.0.0.16");
        mdns.adicionaSite("www.c.com", "168.0.0.17");
        mdns.adicionaSite("www.python.com", "168.0.0.18");
        mdns.adicionaSite("www.javascript.com", "168.0.0.19");
        mdns.adicionaSite("www.adonis.com", "168.0.0.20");

        Cliente c1 = new Cliente("Mikeias");
        Cliente c2 = new Cliente("Dylan");
        Cliente c3 = new Cliente("Artur");

        System.out.println(c1.acessarSiteContadorDeFrequencia("www.drive.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.casasbahia.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.meet.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.techtudo.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.espn.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.c.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.magazineluiza.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.noticias.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.python.com", mdns));
        System.out.println(c1.acessarSiteContadorDeFrequencia("www.drive.com", mdns));

        System.out.println("\n\n");

        System.out.println(c2.acessarSiteContadorDeFrequencia("www.gmail.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.globoesporte.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.uol.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.c.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.espn.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.noticias.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.python.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.casasbahia.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.java.com", mdns));
        System.out.println(c2.acessarSiteContadorDeFrequencia("www.adonis.com", mdns));

        System.out.println("\n\n");

        System.out.println(c3.acessarSiteContadorDeFrequencia("www.magazineluiza.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.casasbahia.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.espn.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.animessite.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.techtudo.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.meet.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.python.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.americanas.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.noticias.com", mdns));
        System.out.println(c3.acessarSiteContadorDeFrequencia("www.foxsports.com", mdns));

        System.out.println("\n\n");

        System.out.println("\nMostrando lista\n");
        mdns.mostrar();

    }

}

package Recuperacao2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Carrega as cidades e suas coordenadas
        List<Cidade> cidades = Cidade.carregarCidades(); 

        // Versão de referência (sem threads)
        Experimento experimento1 = new Experimento(cidades, 1);
        experimento1.executar();

        // Versão com 3 threads
        Experimento experimento2 = new Experimento(cidades, 3);
        experimento2.executar();

        // Versão com 9 threads
        Experimento experimento3 = new Experimento(cidades, 9);
        experimento3.executar();

        // Versão com 27 threads
        Experimento experimento4 = new Experimento(cidades, 27);
        experimento4.executar();
    }
}

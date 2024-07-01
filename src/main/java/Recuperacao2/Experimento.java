package Recuperacao2;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;

public class Experimento {
    private List<Cidade> cidades;
    private int quantidadeThreads;

    public Experimento(List<Cidade> cidades, int quantidadeThreads) {
        this.cidades = cidades;
        this.quantidadeThreads = quantidadeThreads;
    }

    public void executar() {
        ExecutorService executor = Executors.newFixedThreadPool(quantidadeThreads);
        List<Future<DadosClimaticos>> futuros = new ArrayList<>();

        long tempoInicio = System.currentTimeMillis();
        for (Cidade cidade : cidades) {
            ColetorDeDados coletor = new ColetorDeDados(cidade);
            futuros.add(executor.submit(coletor));
        }

        futuros.forEach(futuro -> {
            try {
                DadosClimaticos dados = futuro.get();
                System.out.println("Cidade: " + dados.getNomeCidade() + 
                    " Média: " + dados.getTemperaturaMedia() +
                    " Min: " + dados.getTemperaturaMinima() +
                    " Máx: " + dados.getTemperaturaMaxima());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        long tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de execução com " + quantidadeThreads + " threads: " + (tempoFim - tempoInicio) + "ms");

        executor.shutdown();
    }
}



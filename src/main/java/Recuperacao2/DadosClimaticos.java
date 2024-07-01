package Recuperacao2;

import java.util.ArrayList;
import java.util.List;

public class DadosClimaticos {
    private String nomeCidade;
    private List<Double> temperaturas;

    public DadosClimaticos(String nomeCidade) {
        this.nomeCidade = nomeCidade;
        this.temperaturas = new ArrayList<>();
    }

    public void adicionarTemperatura(double temp) {
        temperaturas.add(temp);
    }

    public double getTemperaturaMedia() {
        return temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public double getTemperaturaMinima() {
        return temperaturas.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
    }

    public double getTemperaturaMaxima() {
        return temperaturas.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
    }

    public String getNomeCidade() {
        return nomeCidade;
    }
}

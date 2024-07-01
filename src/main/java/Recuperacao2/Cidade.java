package Recuperacao2;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private String nome;
    private double latitude;
    private double longitude;

    public Cidade(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static List<Cidade> carregarCidades() {
        List<Cidade> cidades = new ArrayList<>();
        cidades.add(new Cidade("Aracaju", -10.9167, -37.05));
        cidades.add(new Cidade("Belém", -1.4558, -48.5039));
        cidades.add(new Cidade("Belo Horizonte", -19.9167, -43.9333));
        cidades.add(new Cidade("Boa Vista", 2.81972, -60.67333));
        cidades.add(new Cidade("Brasília", -15.7939, -47.8828));
        cidades.add(new Cidade("Campo Grande", -20.44278, -54.64639));
        cidades.add(new Cidade("Cuiabá", -15.5989, -56.0949));
        cidades.add(new Cidade("Curitiba", -25.4297, -49.2711));
        cidades.add(new Cidade("Florianópolis", -27.5935, -48.55854));
        cidades.add(new Cidade("Fortaleza", -3.7275, -38.5275));
        cidades.add(new Cidade("Goiânia", -16.6667, -49.25));
        cidades.add(new Cidade("João Pessoa", -7.12, -34.88));
        cidades.add(new Cidade("Macapá", 0.033, -51.05));
        cidades.add(new Cidade("Maceió", -9.66583, -35.73528));
        cidades.add(new Cidade("Manaus", -3.1189, -60.0217));
        cidades.add(new Cidade("Natal", -5.7833, -35.2));
        cidades.add(new Cidade("Palmas", -10.16745, -48.32766));
        cidades.add(new Cidade("Porto Alegre", -30.0331, -51.23));
        cidades.add(new Cidade("Porto Velho", -8.76194, -63.90389));
        cidades.add(new Cidade("Recife", -8.05, -34.9));
        cidades.add(new Cidade("Rio Branco", -9.97472, -67.81));
        cidades.add(new Cidade("Rio de Janeiro", -22.9111, -43.2056));
        cidades.add(new Cidade("Salvador", -12.9747, -38.4767));
        cidades.add(new Cidade("São Luís", -2.5283, -44.3044));
        cidades.add(new Cidade("São Paulo", -23.55, -46.6333));
        cidades.add(new Cidade("Teresina", -5.08917, -42.80194));
        cidades.add(new Cidade("Vitória", -20.2889, -40.3083));
        return cidades;
    }
}


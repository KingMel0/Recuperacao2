package Recuperacao2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public class ColetorDeDados implements Callable<DadosClimaticos> {
    private Cidade cidade;

    public ColetorDeDados(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public DadosClimaticos call() throws Exception {
        String apiUrl = String.format("https://api.open-meteo.com/v1/forecast?latitude=%f&longitude=%f&hourly=temperature_2m", 
                                        cidade.getLatitude(), cidade.getLongitude());
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(apiUrl))
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        JSONObject json = new JSONObject(responseBody);
        DadosClimaticos dadosClimaticos = new DadosClimaticos(cidade.getNome());

        JSONArray temperaturas = json.getJSONObject("hourly").getJSONArray("temperature_2m");
        for (int i = 0; i < temperaturas.length(); i++) {
            dadosClimaticos.adicionarTemperatura(temperaturas.getDouble(i));
        }

        return dadosClimaticos;
    }
}

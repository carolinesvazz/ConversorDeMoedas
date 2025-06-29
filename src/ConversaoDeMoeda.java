import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversaoDeMoeda {
    //private double valor;
    private static final String API_KEY = "b351e38d3994105c3c12fa13";

    public String converter(String moedaOrigem, String moedaDestino, double valor) {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + moedaOrigem;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            //System.out.println(json);

            //Faz o parsing de JSON para objeto moeda
            MoedaResponse moeda = new Gson().fromJson(json, MoedaResponse.class);
            double taxa = moeda.conversion_rates().get(moedaDestino);
            //System.out.println(usd);
            double valorConvertido = valor * taxa;

            //String resultado = "O valor R$ " + valor + " convertido para dolar é $ " + valorConvertido;
            return String.format("O valor %.2f %s convertido para %s é de $ %.2f", valor, moedaOrigem, moedaDestino, valorConvertido);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro na requisição: " + e.getMessage());
        }catch (NullPointerException e){
            return "Erro: código de moeda invalido";
        }
    }
}

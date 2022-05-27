import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args)
    {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf"))
                    .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                    .header("X-RapidAPI-Key", "3bebf60db8msh26d92a9027d125cp1b2c5cjsn4a09c51a53d0")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

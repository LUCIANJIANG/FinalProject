import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class WordsNetworking {
    private String url;
    private String APIkey;

    public WordsNetworking()
    {
        APIkey = "3bebf60db8msh26d92a9027d125cp1b2c5cjsn4a09c51a53d0";
        url = "https://wordsapiv1.p.rapidapi.com/words/";
    }

    private String makeApiCallForWord(String word)
    {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://wordsapiv1.p.rapidapi.com/words/" + word))
                    .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
                    .header("X-RapidAPI-Key", "3bebf60db8msh26d92a9027d125cp1b2c5cjsn4a09c51a53d0")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

    public String parseInfo(String json)
    {
        JSONObject jsonObj = new JSONObject(json);
        JSONArray results =  jsonObj.getJSONArray("results");
        JSONObject array0 = (JSONObject) results.get(0);
        String definition = array0.getString("definition");
        String partOfSpeech = array0.getString("partOfSpeech");
        return definition + " " + partOfSpeech;
    }
}

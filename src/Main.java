import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//         WordsAPI tester = new WordsAPI();
//        tester.test("example");

        WordGUI gui = new WordGUI();

// TESTING CODE
//        try
//        {
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://wordsapiv1.p.rapidapi.com/words/apple/typeOf"))
//                    .header("X-RapidAPI-Host", "wordsapiv1.p.rapidapi.com")
//                    .header("X-RapidAPI-Key", "3bebf60db8msh26d92a9027d125cp1b2c5cjsn4a09c51a53d0")
//                    .method("GET", HttpRequest.BodyPublishers.noBody())
//                    .build();
//            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//        } catch (Exception e)
//        {
//            System.out.println(e);
//        }
//
//        WordsNetworking test = new WordsNetworking();
//        Scanner scan = new Scanner(System.in);
//        System.out.print("What is your word?");
//        String word = scan.next();
//        String json = test.makeApiCallForWord(word);
//        test.parseInfo(json);
//        Current current = test.getCurrent();
//        System.out.println(current.getWord());
//        System.out.println(current.getDefinition());
//        System.out.println(current.getPartOfSpeech());
//        System.out.println(current.getExample());
    }
}

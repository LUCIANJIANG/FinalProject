import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args)
    {
        //WordGUI gui = new WordGUI();
        WordsAPI tester = new WordsAPI();
        tester.test("example");
    }
}

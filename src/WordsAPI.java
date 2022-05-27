public class WordsAPI {
    private WordsNetworking networker;

    public WordsAPI()
    {
        networker = new WordsNetworking();
    }

    public void test(String word)
    {
        String reponse = networker.makeApiCallForWord(word);
        System.out.println(networker.parseInfo(reponse));
    }
}

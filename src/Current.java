public class Current {
    private String word;
    private String definition;
    private String partOfSpeech;
    private String example;
    private String synonyms;

    public Current(String word, String definition,String partOfSpeech, String example, String synonyms)
    {
        this.word = word;
        this.definition = definition;
        this.partOfSpeech = partOfSpeech;
        this.example = example;
        this.synonyms = synonyms;
    }

    public String getWord()
    {
        return word;
    }

    public String getDefinition()
    {
        return definition;
    }

    public String getPartOfSpeech()
    {
        return partOfSpeech;
    }

    public String getExample()
    {
        return example;
    }

    public String getSynonyms()
    {
        return synonyms;
    }

    public void setExample(String example)
    {
        this.example = example;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
    }

    public void setPartOfSpeech(String partOfSpeech)
    {
        this.partOfSpeech = partOfSpeech;
    }
}

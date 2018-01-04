package stay1;
//This is the Search model and class

public class Search {

    private final long id;
    private final String content;

    public Search(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
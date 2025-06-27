
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String content;
    private String timestamp;

    public Note(String content){
        this.content = content;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public Note(String content, String timestamp){
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent(){
        return content;
    }

    public String getTimestamp(){
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + content;
    }
}
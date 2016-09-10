package ws.demo.jms.message;

import java.io.Serializable;

public class Email implements Serializable {
    private String to;
    private String title;
    private String body;

    public Email() {
    }

    public Email(String to, String title, String body) {
        this.to = to;
        this.title = title;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

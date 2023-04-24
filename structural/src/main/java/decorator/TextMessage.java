package decorator;

import lombok.Getter;

@Getter
public class TextMessage implements Message {

    private final String content;

    public TextMessage(String content) {
        this.content = content;
    }
}

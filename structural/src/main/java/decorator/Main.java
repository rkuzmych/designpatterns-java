package decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Message message = new TextMessage("<body> text");

        Message base64EncodedMessage = new Base64EncodedMessage(message);
        Message htmlMessage = new HtmlEncodedMessage(message);

        log.info(base64EncodedMessage.getContent());
        log.info(htmlMessage.getContent());
    }
}

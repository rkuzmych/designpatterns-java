package dev.rkuzmych.memento.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.write("Hello");
        editor.write("Hello world");

        log.info("Text area before rollback: {}", editor.getTextArea());
        editor.undo();
        log.info("Text area after rollback: {}", editor.getTextArea());
    }
}

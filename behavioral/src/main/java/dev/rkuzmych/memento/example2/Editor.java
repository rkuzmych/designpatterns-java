package dev.rkuzmych.memento.example2;

import lombok.Getter;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final Deque<TextArea.Memento> stateHistory;

    @Getter
    private final TextArea textArea;

    public Editor() {
        this.stateHistory = new LinkedList<>();
        this.textArea = new TextArea();
    }

    public void write(String text) {
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapshot());
    }

    public void undo() {
        textArea.restore(stateHistory.pop());
    }
}

package dev.rkuzmych.memento.example2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class TextArea {

    private String text;

    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getText();
    }

    @Getter
    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }
    }
}

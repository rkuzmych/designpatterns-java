package dev.rkuzmych.memento.example1.command;

public interface WorkflowCommand {

    void execute();

    void undo();
}

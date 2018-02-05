package pattern_Command.impl;

import pattern_Command.abs.AbstractCommand;

import java.util.List;

public class StartCommand<T> extends AbstractCommand<T> {

    public StartCommand(List<T> arr) {
        super("Start command", arr);
    }

    public void execute() {
        System.out.println("Executing " + commandsName);
        arr.add((T)"hello");
    }
}

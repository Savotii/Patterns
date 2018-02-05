package pattern_Command.impl;

import pattern_Command.abs.AbstractCommand;

import java.util.List;

public class DeleteCommand<T> extends AbstractCommand<T> {

    public DeleteCommand(List<T> arr) {
        super("Delete command", arr);
    }

    public void execute() {
        System.out.println("Executing " + commandsName);
        if (arr.size() != 0) {
            arr.remove(arr.size() - 1);
        }
        else {
            System.out.println("Not enough data");
        }
    }
}

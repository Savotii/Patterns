package pattern_Command.abs;

import java.util.List;

public abstract class AbstractCommand<T> {

    protected String commandsName;
    protected List<T> arr;

    protected AbstractCommand() {

    }

    public AbstractCommand(List<T> arr) {
        this.arr = arr;
    }

    public AbstractCommand(String commandsName, List<T> arr) {
        this.arr = arr;
        this.commandsName = commandsName;
    }

    public abstract void execute();

}

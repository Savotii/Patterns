package pattern_Command;

import pattern_Command.abs.AbstractCommand;
import pattern_Command.impl.DeleteCommand;
import pattern_Command.impl.StartCommand;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> arr = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            arr.add("New _ " + i);
        }
        System.out.println("before size: " + arr.size());
        AbstractCommand command = new StartCommand(arr);
        command.execute();
        System.out.println(" start: " + arr.size());
        AbstractCommand command2 = new DeleteCommand(arr);
        command2.execute();
        System.out.println(" after delete: " + arr.size());

    }
}

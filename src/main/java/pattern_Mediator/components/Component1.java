package pattern_Mediator.components;

import pattern_Mediator.interfaces.Mediator;

public class Component1 {

    private Mediator dialog;

    public Component1(Mediator dialog) {
        this.dialog = dialog;
    }

    public void execute() {
        dialog.notify(this, "component1");
    }

}

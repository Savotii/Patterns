package pattern_Mediator.components;

import pattern_Mediator.interfaces.Mediator;

public class Component2 {

    private Mediator dialog;

    public Component2(Mediator dialog) {
        this.dialog = dialog;
    }

    public void execute() {
        dialog.notify(this, "component2");
    }

}

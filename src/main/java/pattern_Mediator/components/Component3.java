package pattern_Mediator.components;

import pattern_Mediator.interfaces.Mediator;

public class Component3 {

    private Mediator dialog;

    public Component3(Mediator dialog) {
        this.dialog = dialog;
    }

    public void execute() {
        dialog.notify(this, "component3");
    }

}

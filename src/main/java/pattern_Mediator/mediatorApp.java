package pattern_Mediator;

import pattern_Mediator.components.Component1;
import pattern_Mediator.components.Component2;
import pattern_Mediator.components.Component3;
import pattern_Mediator.impl.MediatorUtil;
import pattern_Mediator.interfaces.Mediator;

public class mediatorApp {

    public static void main(String[] args) {

        Mediator mediator = new MediatorUtil().getMediator();

        Component1 component1 = new Component1(mediator);
        Component2 component2 = new Component2(mediator);
        Component3 component3 = new Component3(mediator);

        component1.execute();
        component2.execute();
        component3.execute();

    }
}

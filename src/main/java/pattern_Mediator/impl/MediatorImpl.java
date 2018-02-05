package pattern_Mediator.impl;

import pattern_Mediator.components.Component1;
import pattern_Mediator.components.Component2;
import pattern_Mediator.components.Component3;
import pattern_Mediator.interfaces.Mediator;

public class MediatorImpl implements Mediator {

    public void notify(Object object, String event) {

        if (object instanceof Component1) {
            switch (event) {
                case "component1":
                    System.out.println("component1");
                    break;
                default:
                    System.out.println("default component 1");
                    break;
            }
        }
        if (object instanceof Component2) {
            switch (event) {
                case "component2":
                    System.out.println("somponent2");
                    break;
                default:
                    System.out.println("default component 2");
                    break;
            }
        }
        if (object instanceof Component3) {
            switch (event) {
                case "component3":
                    System.out.println("component3");
                    break;
                default:
                    System.out.println("default component 3");
                    break;
            }
        }

    }

}

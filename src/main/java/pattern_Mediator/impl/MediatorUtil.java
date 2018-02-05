package pattern_Mediator.impl;

import pattern_Mediator.interfaces.Mediator;

public class MediatorUtil {

    public MediatorUtil() {

    }

    public Mediator getMediator() {
        return new MediatorImpl();
    }
}

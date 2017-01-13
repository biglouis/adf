package poc1.view.controller;

import javax.faces.event.ValueChangeEvent;

public class Controller1Request extends ControllerRequest {
    public Controller1Request() {
        super();
        System.out.println("Controller1Request");
    }

    public void onChangeFirstName(ValueChangeEvent valueChangeEvent) {
        System.out.println("onChangeFirstName");
        System.out.println(valueChangeEvent.getOldValue()+" -> "+valueChangeEvent.getNewValue());
    }

    public void onChangeLastName(ValueChangeEvent valueChangeEvent) {
        System.out.println("onChangeLastName");
        System.out.println(valueChangeEvent.getOldValue()+" -> "+valueChangeEvent.getNewValue());
    }
}

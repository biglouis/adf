package poc1.view.controller;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import org.apache.myfaces.trinidad.util.ComponentReference;

public class Controller1Request extends ControllerRequest {

    // Instead of RichInputText best practice is this...
    private ComponentReference firstName;
    private ComponentReference lastName;

    public Controller1Request() {
        super();
        System.out.println("Controller1Request");
    }

    /**
     * Listener for "firstname" component
     * @param vce
     */
    public void onChangeFirstName(ValueChangeEvent vce) {
        System.out.println("onChangeFirstName");
        System.out.println(vce.getOldValue() + " -> " + vce.getNewValue());

        String newValue = (String) vce.getNewValue();

        // Clear "lastname" if "firstname" is empty
        if (newValue.isEmpty()) {
            getLastName().setValue("");
            addPartialTarget(getLastName());
        }
    }

    /**
     * Listener for "lastname" component
     * @param vce
     */
    public void onChangeLastName(ValueChangeEvent vce) {
        
        // This does not work when clearing lastname because it is required? TODO
        System.out.println("onChangeLastName");
        System.out.println(vce.getOldValue() + " -> " + vce.getNewValue());

        String newValue = (String) vce.getNewValue();

        // Clear "firstname" if "lastname" is empty
        if (newValue.isEmpty()) {
            getFirstName().setValue("");
            addPartialTarget(getFirstName());
        }
    }

    /**
     * Component setter for "firstname"
     * @param fn
     */
    public void setFirstName(RichInputText fn) {
        this.firstName = ComponentReference.newUIComponentReference(fn);
    }

    /**
     * Component getter for "firstname"
     * @return component
     */
    public RichInputText getFirstName() {
        if (this.firstName == null) {
            return null;
        } else {
            return (RichInputText) this.firstName.getComponent();
        }
    }

    /**
     * Component sette for "lastname"
     * @param ln
     */
    public void setLastName(RichInputText ln) {
        this.lastName = ComponentReference.newUIComponentReference(ln);
    }

    /**
     * Component getter for "lastname"
     * @return component
     */
    public RichInputText getLastName() {
        if (this.lastName == null) {
            return null;
        } else {
            return (RichInputText) this.lastName.getComponent();
        }
    }
}

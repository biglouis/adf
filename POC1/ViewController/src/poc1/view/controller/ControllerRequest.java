package poc1.view.controller;

import javax.faces.component.UIComponent;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.context.AdfFacesContext;

public class ControllerRequest {
    public ControllerRequest() {
        super();
        System.out.println(this.getClass().getName());
    }

    /**
     * Force the UIComponent to refresh
     * @param uc
     */
    public void addPartialTarget(UIComponent uc) {
        AdfFacesContext.getCurrentInstance().addPartialTarget(uc);
    }
}

package poc1.view.controller;

public class ControllerPageflow {
    
    private String parameter;
    
    public ControllerPageflow() {
        super();
        System.out.println("ControllerPageflow");
    }

    public final void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public final String getParameter() {
        return parameter;
    }
}

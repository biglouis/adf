package poc1.view.controller;

import java.io.Serializable;

public class TaskflowController implements Serializable {
    @SuppressWarnings("compatibility:-4416689803438192947")
    private static final long serialVersionUID = 4269527405860744230L;

    private String parameter;

    public TaskflowController() {
        super();
        System.out.println(this.getClass().getName());
    }

    public final void initializer() {
        System.out.println("initializer");
    }

    public final void finalizer() {
        System.out.println("finalizer");
    }

    public final void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public final String getParameter() {
        return parameter;
    }
}

package com.jpenzes.smawing;

/**
 * Author: Jirka Penzes
 * Date: 25/03/14 11:01
 */
public abstract class SController<TView extends SView<? extends SModel>, TModel extends SModel> {

    private final SFrame frame;
    private final TModel model;
    private final TView view;

    public SController(SFrame frame, Class<TView> view, Class<TModel> model) {
        this.frame = frame;
        this.model = getMainFrame().getModel(model);
        this.view = getMainFrame().getView(view);
    }

    protected abstract void initialize();

    protected SFrame getMainFrame() {
        return frame;
    }

    public TModel getModel() {
        return model;
    }

    public TView getView() {
        return view;
    }
}

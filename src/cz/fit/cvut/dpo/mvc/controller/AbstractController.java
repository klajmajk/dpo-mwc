/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.cvut.dpo.mvc.controller;

import cz.fit.cvut.dpo.mvc.model.IModel;
import cz.fit.cvut.dpo.mvc.objects.AbstractShape;
import cz.fit.cvut.dpo.mvc.view.IView;
import java.util.List;

/**
 *
 * @author honza
 */
public class AbstractController {
    private List<IView> views;
    private IModel model;
    
    public AbstractController(List<IView> views, IModel model) {
        this.views = views;
        this.model = model;
    }
    
    public void notifyAllViews() {
        for (IView view : views) {
            view.notifyView();
        }
    }
    
    public AbstractShape getAbstractShapeById(int id) {
      return model.getShapeById(id);
    }
    
}

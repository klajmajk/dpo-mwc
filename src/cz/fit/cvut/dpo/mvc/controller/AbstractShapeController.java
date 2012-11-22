/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.cvut.dpo.mvc.controller;

import cz.fit.cvut.dpo.mvc.objects.AbstractShape;
import cz.fit.cvut.dpo.mvc.objects.Position;

/**
 *
 * @author honza
 */
public abstract class AbstractShapeController implements IShapeController {

    @Override
    public void changePosition(AbstractShape shape, Position position) {
        shape.setPosition(position);
    }
    
}

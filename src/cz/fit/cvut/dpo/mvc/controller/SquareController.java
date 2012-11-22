/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.fit.cvut.dpo.mvc.controller;

import cz.fit.cvut.dpo.mvc.model.IModel;
import cz.fit.cvut.dpo.mvc.objects.AbstractShape;
import cz.fit.cvut.dpo.mvc.objects.Square;
import cz.fit.cvut.dpo.mvc.view.IView;
import java.util.List;

/**
 *
 * @author honza
 */
public class SquareController extends AbstractShapeController {

    @Override
    public void changeSize(AbstractShape shape, int size) throws ClassCastException {
        Square square = (Square) shape;
        square.setSide(size);
    }


    
}

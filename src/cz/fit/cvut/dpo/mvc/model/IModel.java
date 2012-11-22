package cz.fit.cvut.dpo.mvc.model;

import java.util.ArrayList;

import cz.fit.cvut.dpo.mvc.objects.AbstractShape;
import java.util.List;

public interface IModel {
    //get all elements

    public void addShape(AbstractShape shape, int id);

    public void removeShape(AbstractShape shape);

    public List<AbstractShape> getAllShapes();

    public void clearAllShapes();

    public AbstractShape getShapeById(int id);
}

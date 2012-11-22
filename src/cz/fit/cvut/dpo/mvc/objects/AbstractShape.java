package cz.fit.cvut.dpo.mvc.objects;

public abstract class AbstractShape {

    private int id;
    private Position position;

    public AbstractShape(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    //change position
    public void setPosition(Position position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

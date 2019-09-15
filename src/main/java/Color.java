

public class Color extends Properties {

    @Override
    public String getDetail() {
        return super.getDetail();
    }

    Shape shape;
   protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}


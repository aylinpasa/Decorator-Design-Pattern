
public class Rectangle extends Shape {

    protected double height;
    protected double width;


    public Rectangle(double height,double width) {
        super();
        this.width= width;
        this.height= height;
    }


    @Override
    public String getDetail() {

        return "Rectangle: height = " +height + " width = " + width + "" + super.getDetail();
    }

    public Rectangle setHeight(double height) {
        this.height = height;
        onAreaChange();
        return this;
    }

    public Rectangle setWidth(double width) {
        this.width = width;
         onAreaChange();
        return this;
    }


    @Override

    public double onAreaChange() {

        return height*width;
    }


   public double massGold(){
        return onAreaChange()*goldDensity;
    }

    public  double massIron(){
        return onAreaChange()*ironDensity;
    }

    public double massCopper(){
        return  onAreaChange()*copperDensity;
    }


}


public class Circle extends Shape {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public String getDetail() {

        return "Circle radius : "+ radius+""+ super.getDetail();
    }


    public Circle setRadius(double radius) {
        this.radius = radius;
        onAreaChange();
        return this;
    }


    @Override

public double onAreaChange() { return radius*radius*PI; }

public double massGold(){ return onAreaChange()*goldDensity; }

public  double massIron(){
    return onAreaChange()*ironDensity;
}

public double massCopper(){ return  onAreaChange()*copperDensity; }



}

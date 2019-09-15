
public class Square extends Shape {

    protected double length ;

    public Square(double length){
        this.length= length;

    }

    public Square setLength(double length){
        this.length = length;
        onAreaChange();
        return this;
    }


    @Override
    public String getDetail() {

        return "Square: length = " + length + "" + super.getDetail();
    }



    @Override

    public double onAreaChange() {

        return length*length;
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


public abstract class Shape {

    protected final double PI = 3.14159265;
    protected double area;

    protected final double ironDensity = 7.874;
    protected final double copperDensity = 8.96;
    protected final double goldDensity = 19.32;


    protected abstract double onAreaChange();

    protected String color;
    protected Integer light;
    protected Integer contrast;

    public void setColor(String color) {
        this.color = color;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public void setContrast(Integer contrast) {
        this.contrast = contrast;
    }

    public String getDetail() {

        String detail ="";
        if(color != null) detail += "  color = "+ color +"";
        if (light!= null) detail += "  Light = " + light +"";
        if (contrast != null) detail += "  Contrast = " + contrast +"";

        return detail;
    }




    public abstract double massGold();
    public abstract double massIron();
    public abstract double massCopper();
}
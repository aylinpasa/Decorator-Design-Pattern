import java.util.Scanner;

public class Test {


    public static Circle circle;
    public static Square square;
    public static Rectangle rectangle;
    protected static String shape;

    public static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {


        while(true){
            System.out.println("Please select a shape");
            System.out.println("[c:Circle | s:Square | r:Rectangle]");
            switch (scan.next()){
                case "c":
                    System.out.print("Radius: ");
                    circle = new Circle(scan.nextDouble());
                    Menu("c");
                    MaterialMenu("c");
                    break;
                case "s":
                    System.out.print("Length: ");
                    square = new Square(scan.nextDouble());
                    Menu("s");
                    MaterialMenu("s");
                    break;
                case "r":
                    System.out.print("Length: ");
                    double height = scan.nextDouble();
                    System.out.print("Width: ");
                    double width = scan.nextDouble();
                    rectangle = new Rectangle(height,width);
                    Menu("r");
                    MaterialMenu("r");
                    break;
                default:
                    System.out.println("Please enter valid input.");
            } break;
        }


    }

        public static void Menu(String shape){
            boolean flag = true;
            while (flag){
                System.out.println("Please select for");
                System.out.println("[i: Shape Info | clr: Add Color(String) | l: Add Light(int) | cnt: Add Contrast(int) | q: Quit]");
                switch (scan.next()){
                    case "i":
                        if (shape.equalsIgnoreCase("c")) System.out.println(circle.getDetail());
                        else if (shape.equalsIgnoreCase("s")) System.out.println(square.getDetail());
                        else if(shape.equalsIgnoreCase("r")) System.out.println(rectangle.getDetail());
                        break;
                    case "clr":
                        System.out.print("Enter Color: ");
                        if (shape.equalsIgnoreCase("c")) circle.setColor(scan.next());
                        else if (shape.equalsIgnoreCase("s")) square.setColor(scan.next());
                        else if (shape.equalsIgnoreCase("r"))rectangle.setColor(scan.next());
                        break;
                    case "l":
                        System.out.print("Enter Light: ");
                        if (shape.equalsIgnoreCase("c")) circle.setLight(scan.nextInt());
                        else if (shape.equalsIgnoreCase("s")) square.setLight(scan.nextInt());
                        else if (shape.equalsIgnoreCase("r")) rectangle.setLight(scan.nextInt());
                        break;
                    case "cnt":
                        System.out.print("Enter Contrast: ");
                        if (shape.equalsIgnoreCase("c")) circle.setContrast(scan.nextInt());
                        else if (shape.equalsIgnoreCase("s")) square.setContrast(scan.nextInt());
                        else if (shape.equalsIgnoreCase("r")) rectangle.setContrast(scan.nextInt());
                        break;
                    case "q" :
                       flag=false;
                }
            }}

            public static void MaterialMenu(String shape){
                boolean flag1 = true;
                while (flag1){
                    System.out.println("Please select the Material of Shape");
                    System.out.println("[i: Shape Info | cu: Copper | fe: Iron | au: Gold | q: Quit]");
                    switch (scan.next()){
                        case "i":
                            if (shape.equalsIgnoreCase("c")) System.out.println(circle.getDetail());
                            else if (shape.equalsIgnoreCase("s")) System.out.println(square.getDetail());
                            else if (shape.equalsIgnoreCase("r"))System.out.println(rectangle.getDetail());
                            break;
                        case "cu":
                            if (shape.equalsIgnoreCase("c")) System.out.println("Mass for Copper Circle: " + circle.massCopper());
                            else if (shape.equalsIgnoreCase("s")) System.out.println("Mass for Copper Square: " + square.massCopper());
                            else if (shape.equalsIgnoreCase("r"))System.out.println("Mass for Copper Rectangle: " + rectangle.massCopper());
                            break;
                        case "fe":
                            if (shape.equalsIgnoreCase("c")) System.out.println("Mass for Iron Circle: " + circle.massIron());
                            else if (shape.equalsIgnoreCase("s")) System.out.println("Mass for Iron Square: " +square.massIron());
                            else if (shape.equalsIgnoreCase("r"))System.out.println("Mass for Iron Rectangle: " + rectangle.massIron());
                            break;
                        case "au":
                            if (shape.equalsIgnoreCase("c")) System.out.println("Mass for Gold Circle: " + circle.massGold());
                            else if (shape.equalsIgnoreCase("s")) System.out.println("Mass for Gold Square: " + square.massGold());
                            else if (shape.equalsIgnoreCase("r"))System.out.println("Mass for Gold Rectangle: " + rectangle.massGold());
                            break;
                        case "q" :
                            flag1=false;
                    }

                }
            }










}
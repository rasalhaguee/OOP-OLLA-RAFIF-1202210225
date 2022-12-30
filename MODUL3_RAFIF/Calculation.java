package MODUL3_RAFIF;

public class Calculation implements Runnable {
    double radius, side, area;
    double phi = 3.14;

    public void setSquare(double side) {
        this.side = side;
        try{
            area = side*side;
        }
        catch{
            if(side < 1){
                
            }
        }
    }

    public static getSquare(double area) {
        return area;
    }

    public void setCircle(double radius) {
        this.radius = radius;
        try{
            area = phi*radius*radius;
        }
        catch{
            if(side < 1){

            }
        }
    }

    public static getCircle(double area) {
        return area;
    }

    public void setTrapezoid(double a, b, t) {
        this.a = a;
        this.b = b;
        this.t = t;
        try{
            area = 0.5*(a+b)*t;
        }
        catch{
            if(a or b < 1) {

            }
        }
    }

    public static getTrapezoid(double area) {
        return area;
    }

    @Override
    public void run() {
        System.out.println("Program will start in");
        for (i = 3;i == 0;i--){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

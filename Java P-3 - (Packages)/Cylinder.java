package Calculater.shape;
public class Cylinder extends Shape {
    Cylinder(int div1, int div2)
    {
        super(div1, div2);
    }
    public double area()
    {
        return  2 * Math.PI * this.div1 * (this.div2 + this.div1);
    }
}

package Calculater.shape;
public class Sphere extends Shape {
    Sphere(int div1, int div2)
    {
        super(div1, div2);
    }
    public double area()
    {
        return 4 * Math.PI * this.div1 * this.div1;
    }
}

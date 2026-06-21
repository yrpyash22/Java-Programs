package Calculater.shape;
public class Circle extends Shape {
    Circle(int div1)
    {
        super(div1, -1);
    }
    public double area()
    {
        return Math.PI * this.div1 * this.div1;
    }
}

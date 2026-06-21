
package Calculater.shape;
public class Rectangle extends Shape{
    
    Rectangle(int div1, int div2)
    {
        super(div1, div2);
    }
    public int area()
    {
        return this.div1 * this.div2;
    }
}

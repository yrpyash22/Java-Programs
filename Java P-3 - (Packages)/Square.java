
package Calculater.shape;
public class Square extends Shape {
    Square(int div1)
    {
        super(div1, -1);
    }
    public int area()
    {
        return this.div1 * this.div1;
    }
}

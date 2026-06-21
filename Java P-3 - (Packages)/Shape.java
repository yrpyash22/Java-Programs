

package Calculater.shape;
public class Shape{
    int div1, div2;

    Shape(int div1, int div2)
    {
        this.div1 = div1;
        this.div2 = div2;
    }

    public int getDiv1()
    {
        return this.div1;
    }
    public int getDiv2()
    {
        return this.div2;
    }

    public void setDiv1( int div1)
    {
        this.div1 = div1;
    }

    public void setDiv2( int div2)
    {
        this.div2 = div2;
    }
}
//                              Chapter 5 

//                          Patterns - ||


public class Assignment_5_ {

    // Q1
    public static void hollow_rectangle(int r , int c )
    {
        // out loop 
        for(int i = 1; i<= r; i++)
        {   // inner loop 
            for(int j = 1; j<=c; j++)
            {
                if(i==1 || i==r || j == 1 || j==c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



// Q - 2
    public static void oppose_Rotate_half_pyramid(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            // space
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            // star
            for(int j = 1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }



// Q - 3 
    public static void inverse_half_pyramid_num(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<= (n-i+1); j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }



// Q = 4 
    public static void floyd_triangle(int n)
    {
        int count = 1;
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }



// Q = 5
    public static void zero_one_triangle(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }



// Q = 6 
    public static void butterfly_pattern(int n)
    {
        for(int i = 1; i<= n; i++)
        {
            // star
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            // space
            for(int j = 1; j<= 2*(n-i) ;j++)  // evem  2*(n-i)
            {
                System.out.print(" ");
            }
            // star
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //  Mirroe part
        for(int i = n; i>= 1; i--)
        {
            // star
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            // space
            for(int j = 1; j<= 2*(n-i) ;j++)
            {
                System.out.print(" ");
            }
            // star
            for(int j = 1 ; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




//  Q = 7
    public static void solid_rhombus(int r, int c)
    {
        for(int i = 1; i<=r; i++)
        {
            for(int j = 1; j <= (r-i); j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }




// Q = 8 
    public static void hollow_rhmbus(int r, int c)
    {
        for(int i = 1; i<=r; i++)
        {
            for(int j = 1; j <= (r-i); j++)
            {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= c; j++)
            {
                if(i==1 || i==r || j == 1 || j==c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



// Q = 9 
public static void dimand_pattern(int n)
{
    for(int i = 1; i <= n; i++ )
    {
        // space
        for(int j = 1; j<= (n-i); j++)
        {
            System.out.print(" ");
        }
        // star
        for(int j = 1; j<= (2*i-1); j++)   // odd ( 2*i-1 ) 
        {
            System.out.print("*");
        }
        System.out.println();
    }

    // mirror 
    for(int i = n; i >= 1; i-- )
    {
        // space
        for(int j = 1; j<= (n-i); j++)
        {
            System.out.print(" ");
        }
        // star
        for(int j = 1; j<= (2*i-1); j++)   // odd ( 2*i-1 ) 
        {
            System.out.print("*");
        }
        System.out.println();
    }
}






    public static void main (String args[])
    {
        // hollow_rectangle(5, 8);

        // oppose_Rotate_half_pyramid(5);

        // inverse_half_pyramid_num(5);

        // floyd_triangle(5);

        // zero_one_triangle(10);

        // butterfly_pattern(10);
        
        // solid_rhombus(10, 8);

        // hollow_rhmbus(5, 8);

        dimand_pattern(10);

    }

    
}

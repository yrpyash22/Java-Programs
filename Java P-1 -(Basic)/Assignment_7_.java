///                               
///                                 ARRAY PART 2 
///                                 ***       ****     ****
///      
//import java.util.*;

public class Assignment_7_ {


    /*public static void represent(int array[][])
    {
        int n = array.length;    // length of row 
        int m = array[0].length;   // length of column
        Scanner sc = new Scanner(System.in);
        // input
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0; j<m; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i = 0; i<n ; i++)
        {
            for(int j = 0; j<m; j++)
            {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }*/





//  Q = 1 Searching Element in 2D array 
    public static boolean search_linear(int array[][], int key)
    {
        for(int i = 0; i<array.length ; i++)
        {
            for(int j = 0; j<array[0].length ; j++)
            {
                if(array[i][j] == key)
                {
                    System.out.println("Key is found at :- ("+i+" , "+j+")" );
                    return true;
                }
            }
        }
        System.out.println("Key is not found" );
        return false;
    }




// Q - 2 Spiral Matric 
    public static void print_Spiral(int matrix[][])
    {
        int startrow = 0, startcol = 0;
        int endrow = matrix.length-1, endcol = matrix[0].length-1;
        while(startrow <= endrow && startcol <= endcol )
        {
            // top
            for(int j = startcol; j<=endcol; j++)
            {
                System.out.print(matrix[startrow][j]+" ");
            }
            // right
            for(int i = startrow+1; i<=endrow; i++)
            {
                System.out.print(matrix[i][endcol]+" ");
            }
            // Bottom
            for(int j = endcol-1; j>=startcol; j--)
            {
                if(startrow == endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            // left
            for(int i = endrow-1; i>=startrow+1; i--)
            {
                if(startcol == endcol)
                {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }





// [Q = 3]  Diagonal sum in 2D matrix
    public static void diagonal_Sum(int matrix[][])
    {
        int sum = 0;
        // upper loop for row searching element in matrix
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                // primary Sum
                if(i==j)
                {
                    sum += matrix[i][j];
                }
                // Secondary Sum
                else if(i+j == matrix.length-1)
                {
                    sum = sum + matrix[i][j];  
                }
            }
        }
        System.out.println("Diagonal Sum is :"+ sum);
    }// O(n^2)




    // [Q - 4] Searching in sorted method in 2D arry (Binary)
    public static boolean stair_Case_Search(int matrix[][], int key)
    {
        int row = 0, column = matrix.length-1;
        while (row < matrix.length && column > 0) 
        {
            if(matrix[row][column] == key)
            {
                System.out.println("("+ row +","+ column +")");
                return true;
            }
            else if(key < matrix[row][column])
            {
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not Found in matrix");
        return false;
    }





    // [A - 2] Add the second row of the array
    public static void add_Second_row(int matrix[][])
    {
        int sum = 0;
        for(int j = 0; j<matrix[0].length; j++)
        {
            sum = sum + matrix[1][j];
        }
        System.out.println("Sum is :"+ sum);
    }




    // Transpose the matrix A => A^T
    public static void transpose_matrix(int matrix[][])
    {
        // original matrix
        for(int i =0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int row = matrix.length, column = matrix[0].length;
        int transpose[][] = new int[column][row];
        for(int i =0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        // transpose matrix
        for(int i =0; i<column; i++)
        {
            for(int j=0; j<row; j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }





    public static void main(String args[])
    {
        // create
        //int matrix[][] = new int[3][3];
        // represent(matrix);
        

        //int matrix_2[][] = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        //search_linear(matrix_2, 5 );

        //int matrix_3[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        //print_Spiral(matrix_3);

        //diagonal_Sum(matrix_3);

        //int matrix_4[][] = { {10,20,30,40}, {15, 25, 35, 45},{27, 29, 37, 48}, {32, 33, 39, 50}};
        //stair_Case_Search(matrix_4, 40);



        int matrix_5[][] = { {2,3,7}, {5,6,8} };
        transpose_matrix(matrix_5);


    
    }
    
}

///                              Chapter 6
/// 
///                                Array

//import java.util.*;

public class Assignment_6_ {


//  Q = 1 Passing array as argument 
    public static void update(int markas[])
    {
        for(int i = 0; i<markas.length; i++)
        {
            markas[i] = markas[i]+1;
        }
        // print
        for(int i = 0; i<markas.length; i++)
        {
            System.out.print(markas[i]+ " ");
        }
    }




//  Q = 2 Largest number in an array
    public static void get_Largest(int number[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++)
        {
            if(largest < number[i])
            {
                largest = number[i];
            }
        }
        System.out.println("Largest value is : "+ largest);
    }
    



//  Q = 3 Linear Searching of array elements.
    public static int linear_search(int array[], int key)
    {
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == key)
            {
                return i;
            }
        }
        return -1;
    }




//  Q = 4 Binary Seaech 
    public static int binary_Search(int array[], int key)
    {
        int start = 0;
        int end = array.length - 1;

        while(start <= end)
        {
            int mid = (start + end)/ 2;
            if(array[mid] == key)
            {
                return mid;
            }
            if(array[mid] > key )
            {
                end = mid - 1;
            }
            if(array[mid] < key)
            {
                start = mid + 1;
            }
        }
        return -1;
    }




//  Q = 5 Reverse of am array 
    public static void reverse_Array(int array[])
    {
        int first = 0;
        int last = array.length - 1;
        while(first < last)
        {
            // Swap
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            // update
            first++;
            last--;
        }
        // print reverse array value
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }





// Q = 6 Pairs of arrays element {1,2,3} = (1,2), (1,3), (2,3) 
    public static void pairs_of_array(int array[])
    {
        int tp = 0;
        for(int i = 0; i< array.length; i++)
        {
            int current = array[i];
            for(int j = i+1; j<array.length; j++)
            {
                System.out.print("("+ current + ","+ array[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+ tp);
    }



//  Q = 7 print SubArrays
    public static void print_SubArray(int array[])
    {
        int tp = 0;
        for(int i = 0; i< array.length; i++)
        {
            int start = i;
            for(int j = i; j<array.length; j++)
            {
                int end = j;
                for(int k = start; k<=end; k++)
                {
                    System.out.print(array[k]);
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ tp);
    }





//  Q = 8 Max Sum of Subarray
    public static void max_Sum_SubArray(int array[])
    {
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum = 0;
        for(int i = 0; i< array.length; i++)
        {
            int start = i;
            for(int j = i; j<array.length; j++)
            {
                int end = j;
                curr_Sum = 0;
                for(int k = start; k<=end; k++)
                {
                    curr_Sum = curr_Sum + array[k];
                    System.out.print("|"+array[k] +"| ");
                }
                System.out.println(" This Subarray Sum :" + curr_Sum);
                // find max sum
                if(max_Sum < curr_Sum)
                {
                    max_Sum = curr_Sum;
                }
            }
            System.out.println();
        }
        System.out.println(" Maximum sum of Subarray : "  + max_Sum);
    }





//  Q - 9 Print Max Subarray sum by { Prefix Array }
    public static void max_Sum_SubArray_Prefix(int array[])
    {
        int curr_Sum = 0;
        int max_Sum = Integer.MIN_VALUE;
        int prefix_ary[] = new int[array.length];
        
        prefix_ary[0] = array[0];
        for(int i = 1; i<array.length; i++)
        {
            prefix_ary[i] = prefix_ary[i-1] + array[i];
        }

        for(int i = 0; i<array.length; i++)
        {
            int start = i;
            for(int j = 0; j<array.length; j++)
            {
                int end = j;

                // imp condation 
                /*if(start == 0)
                {
                    curr_Sum = prefix_ary[end];
                }
                else
                {
                    curr_Sum = prefix_ary[end] - prefix_ary[start-1];
                }*/

                curr_Sum = start == 0 ? prefix_ary[end] : prefix_ary[end] - prefix_ary[start-1];

                if(max_Sum < curr_Sum)
                {
                    max_Sum = curr_Sum;
                }
            }
        }
        System.out.println(" Maximum sum of Subarray : "  + max_Sum);
    }





// Q - 10 Max Subarry Sum by Kadanes Algorithm
    public static void max_sum_by_kadanes(int array[])
    {
        int max_Sum = Integer.MIN_VALUE;
        int curr_Sum = 0;

        for(int i = 0; i<array.length; i++)
        {
            curr_Sum = curr_Sum + array[i];

            if(curr_Sum < 0)
            {
                curr_Sum = 0;     // Kandanels Algorithm rule
            }
        }
        max_Sum = Math.max(curr_Sum, max_Sum);
        System.out.println(" Maximum sum of Subarray : "  + max_Sum);
    }






// Q - 11  Traping Rainwater
    public static void trapping_Rainwater(int height[])
    {
        int n = height.length;
        // Calculate Left Max boundry -> array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n ; i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Calculate Right Max boundry -> array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0 ; i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trap_Water = 0;
        for(int i = 0; i<n; i++)
        {
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            trap_Water = trap_Water + waterlevel - height[i];
        }
        System.out.println("Traped water is : "+ trap_Water);
    }




// Q - 12 Buy and sell stocks
    public static void buyandsell_stock(int price[])
    {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++)
        {
            if(buyprice < price[i])
            {
                int profit = price[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyprice = price[i];
            }
        }
        System.out.println("Max profit : "+ maxProfit);
    }




    /*public static void main(String args[])
    {
        int marks[] = {56,89,90};
        //update(marks);

        int number[] = {1,8,2,3,6,4};
        //get_Largest(number);

        int array_Linear[] = {2, 4, 6, 8, 10, 12, 14};
        //System.out.println("Key found at index : " + linear_search(array_Linear, 8) );

        int array_Binary[] = {10, 50, 65, 100, 485, 500};
        //.out.println("Key found at index : " + linear_search(array_Binary, 65));

        int array_Reverse[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //reverse_Array(array_Reverse);

        int array_Pair[] = {2, 4, 6, 8, 10};
        //pairs_of_array(array_Pair);

        //print_SubArray(array_Pair);

        int arry_sum[] = {1 , -2, 6, -1, 3};

                //  [A]  
        //max_Sum_SubArray(arry_sum);

                //  [B]
        //max_Sum_SubArray_Prefix(arry_sum);

        //          [C]
        //max_sum_by_kadanes(arry_sum);

        int height[] = {4, 2, 0, 6, 3, 2, 5};
        //trapping_Rainwater(height);

        int price[] = {7,10,5,30,60,40};
        buyandsell_stock(price);
    }*/
}

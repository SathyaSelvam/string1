package logic;

import java.util.Scanner;

class MinimumDistance 
{
    int minDist(int arr[], int n, int x, int y) 
    {
        int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if ((x == arr[i] && y == arr[j] || y == arr[i] && x == arr[j])&& min_dist > Math.abs(i - j)) 
                    min_dist = Math.abs(i - j);
            }
        }
        return min_dist;
    }
 
    public static void main(String[] args) 
    {
        MinimumDistance min = new MinimumDistance();
        //int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int arr[]=new int[10];
        System.out.println("enter the array elements...");
        Scanner s=new Scanner(System.in);
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("enter the first element...");
        int x=s.nextInt();
        System.out.println("enter the second element...");
        int y=s.nextInt();
        //int x = 4;
        //int y = 8;
 
        System.out.println("Minimum distance between " + x + " and " + y 
                + " is " + min.minDist(arr, n, x, y));
    }
}

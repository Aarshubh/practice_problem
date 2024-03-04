/*concentric square is the typical problem let us to think very carefully like 
 * number of loops are too much  important in this type of problems.
 Now, coming to que here i will explain it with help of  a simple example: lets say n=3
 so the sqaure will look like
 3 3 3 3 3
 3 2 2 2 3
 3 2 1 2 3
 3 2 2 2 3 
 3 3 3 3 3

So we can see that each row and column has one less element than previous one except for first row and last row which have same no of 
 So as you can see there is no need for any loop or recursion we just print the numbers one by one and that's all. So, we can see that there is no need
 So from above we can see that there are three types of numbers present in the matrix :
   - The first row and last row contains only one '3' (number) each.
   - The second row contains two '2's and one '3'.
   - The third row contains one '1', two '2's and one '3'.

 From these observations we can conclude that for any given value of n ,  
 
 */


import java.util.*;
public class concentricSquare {
    public static void main(String[] args) throws Exception {
        int i,j,min;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                min=i<j?i:j;
                System.out.print(n-min+1+" ");
            }
            for(j=n-1;j>=1;j--)
            {
                min=i<j?i:j;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
        
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=n;j++)
            {
                min=i<j?i:j;
                System.out.print(n-min+1+" ");
            }
            for(j=n-1;j>=1;j--)
            {
                min=i<j?i:j;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
    }
}

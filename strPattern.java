import java.util.*;
class strPattern {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("enter a word--");
        String str=sc.nextLine();
        int n=0;
if((str.length()%2)!=0)
{
        for(int K=0;K<str.length()/2;K++)
        {
for(int j=0;j<str.length()/2;j++)
{
System.out.print(" ");
}
            System.out.println(str.charAt(n));
            n++;
        }
        System.out.println(str);
n++;
        for(int i=0;i<str.length()/2;i++)
        {
            for(int j=0;j<str.length()/2;j++)
{
System.out.print(" ");
}
            System.out.println(str.charAt(n));
            n++;
        }

}
else
{
System.out.println("enter a word whose count is odd--");
}
    }
}
import java.util.*;
class characterFrequency
 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("Please enter a string");
       String str=sc.nextLine();
        
       Map<Character,Integer> m=new HashMap<>();
       for(int i=0;i<str.length();i++)
       {
       m.put(str.charAt(i),m.getOrDefault(str.charAt(i),0)+1);
       }
       System.out.println(m);
    }
}
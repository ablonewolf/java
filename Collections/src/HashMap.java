import java.util.*;
import java.io.*;

public class HashMap{
    public static void main(String []argh)
    {
        java.util.HashMap<String, Integer> phonebook = new java.util.HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            phonebook.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phonebook.containsKey(s))
            {
                System.out.println(s+"="+phonebook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
    }
}

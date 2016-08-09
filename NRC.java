import java.util.*;
import java.util.LinkedHashMap;
class NRC
{
  public static void main(String args[])
  {
    String str;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the String=");
    str=s.nextLine();
    LinkedHashMap<Character,Integer> list=new LinkedHashMap<Character,Integer>();  
    
    for(int i=0;i<str.length();i++)
    {
      char c=str.charAt(i);  
      if(list.containsKey(c))
      {
        int temp=list.get(c);
        temp++;
        list.put(c,temp);
      }
      else
      {
        list.put(c,1);
      }
    }
    Set set = list.entrySet();
    Iterator i = set.iterator();
    while(i.hasNext()) 
    {
      Map.Entry me = (Map.Entry)i.next();
      int t=(int) me.getValue();
      if(t==1)
      {
        System.out.println(me.getKey());
        break;
      }
    }
  }
}  
    
    
    
    
    
    
  
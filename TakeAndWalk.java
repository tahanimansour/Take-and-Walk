
package takeandwalk;
import java.util.*;

public class TakeAndWalk
{
    
   static int k;
    
  
    public static void print (Menu[] menu,int n)
    {
      
         System.out.println("");
        
   
            for ( int j=0;j<menu[n].getElement().size();j++)
            {
               
                System.out.println(menu[n].getElement().get(j)+"\t"+menu[n].getPrice().get(j));
              
            }
            
           
            System.out.println("----------------------------------------------------------------");
        
        
    }
   
 
  
   
    
 ///////////////////////////////////////////////////////////
    
    
    public static int count (Object o1,Object o2)
    {
       String s1=(String) o1;
       for (int i=0;i<s1.length();i++)
       {
           char ch=s1.charAt(i);
           if (o2.equals("s")&&ch=='s')
           {
                 String s="";
                
               for (int j=i+2;j<s1.length();j++)
               {
                   if (Character.isDigit(s1.charAt(j)))
                       s+=s1.charAt(j);
                   if (s1.charAt(j)==')')
                       break;
               }
            
            
               if (s.length()==1)
               {
                 
                  char c=s.charAt(0);
                    int x=(int)c-48;
                    k+=x;
                    
               }
             
               else if (s.length()!=1)
               {
                   int no=0,f=1;
                   for (int k=0;k<s.length();k++)
                   {
                       char ch2=s.charAt(k);
                       no=no*10+(ch2-48);
                      
                   }
                int x=no;
                k+=x;
               }

           }
           else if (o2.equals("l")&&ch=='l')
           {
                String s="";
                
               for (int j=i+2;j<s1.length();j++)
               {
                   if (Character.isDigit(s1.charAt(j)))
                       s+=s1.charAt(j);
               }
            
               
               if (s.length()==1)
               {
                 
                  char c=s.charAt(0);
                    int x=(int)c-48;
                    k+=x;
                    
               }
             
               else 
               {
                   int no=0,f=1;
                   for (int k=0;k<s.length();k++)
                   {
                       char ch2=s.charAt(k);
                       no=no*10+(ch2-48);
                      
                   }
                int x=no;
                k+=x;
               }
           }
       }
       return k;
    }
    ////////////////////////////////////////////////////////////////
    
    public static int check (Menu[] menu,ArrayList order,ArrayList size )
    {
        int c=0;int t=0;
       for (int i=0;i<menu.length;i++)
       {
           ArrayList s=menu[i].getElement();
           for (int j=0;j<order.size();j++)
           {
               if (s.contains(order.get(j)))
               {
                   int x=s.indexOf(order.get(j));
                   System.out.println(order.get(j)+" ("+size.get(t)+")");
                   Object o= size.get(t++);
                   c=count (menu[i].getPrice().get(x),o);
 
           }
                 
        }
          
    }

       return c;

    }
    //////////////////////////////////////////////////////////////
    
    public static void updateMenu (Menu[]menu,String s1,String s2)
    {
        Scanner p=new Scanner(System.in);
        if (s1.equalsIgnoreCase("add"))
        {
            
            
             System.out.println("-----------------------------------------");
            if (s2.equalsIgnoreCase("colddrinks"))
            {
                System.out.println("enter number of elements u want to add your menu :");
                int x=p.nextInt();
                System.out.println("what elements do u want to add and then enter its price");
                for (int i=0;i<x;i++)
                {
                menu[0].getElement().add(p.next());
             
                menu[0].getPrice().add(p.next());
                }
                 System.out.println("Cold Drinks:");
                 print (menu,0);
            }
           else if (s2.equalsIgnoreCase("hotdrinks"))
            {
                System.out.println("enter number of elements u want to add your menu and then enter its price :");
                int x=p.nextInt();
                System.out.println("what elements do u want to add:");
                for (int i=0;i<x;i++)
                {
                menu[1].getElement().add(p.next());
             
                menu[1].getPrice().add(p.next());
                }
                 
                  System.out.println("------------------------------------------------");
                  System.out.println("Hot Drinkes:");
                  print (menu,1);
            }
           else if (s2.equalsIgnoreCase("sweets"))
            {
                System.out.println("enter number of elements u want to add to your menu :");
                int x=p.nextInt();
                System.out.println("what element/elements do u want to add and then enter its price:");
                for (int i=0;i<x;i++)
                {
                menu[2].getElement().add(p.next());
             
                menu[2].getPrice().add(p.next());
                }
                 System.out.println("----------------------------------------------");
                 System.out.println("Sweets:");
                  print(menu,2);
            }
         
      
        }
        else if (s1.equalsIgnoreCase("remove"))
        {
            if (s2.equalsIgnoreCase("colddrinks"))
            {
                System.out.println("enter number of elements u want to remove from menu :");
                int x=p.nextInt();
                System.out.println("what element/elements do u want to remove:");
                for (int i=0;i<x;i++)
                {
                 menu[0].getPrice().remove(menu[0].getElement().remove(p.next()));    
                }
                 System.out.println("---------------------------------");
                 System.out.println("Cold Drinks:");
                 print (menu,0);
 
            }
           else if (s2.equalsIgnoreCase("hotdrinks"))
            {
                System.out.println("enter number of elements u want to remove from menu :");
                int x=p.nextInt();
                System.out.println("what element/elements do u want to remove");
                for (int i=0;i<x;i++)
                {
                 menu[1].getPrice().remove(menu[1].getElement().remove(p.next()));    
                }
                 System.out.println("---------------------------------");
                 System.out.println("Hot Drinkes:");
                  print (menu,1);
            }
           else if (s2.equalsIgnoreCase("sweets"))
            {
                System.out.println("enter number of elements u want to remove from menu :");
                int x=p.nextInt();
                System.out.println("what element/elements do u want to remove");
                for (int i=0;i<x;i++)
                {
                 menu[2].getPrice().remove(menu[2].getElement().remove(p.next()));    
                }
                 System.out.println("---------------------------------");
                 System.out.println("Sweets:");
                 print(menu,2);
            }
        }
        
 
        
    }
 
    ////////////////////////////////////////////////////////////////////////////
    
    public static void updatOrder(Menu[]menu,ArrayList order,ArrayList size,String strr1)
    {
         int b;
         Scanner s1=new Scanner(System.in);
         if (strr1.equalsIgnoreCase("add"))
               {
                   System.out.println("enter mumber of element you want to add:");
                   int n=s1.nextInt();
                   System.out.println("enter the element/elements then enter the size:");
                   for (int i=0;i<n;i++)
                   {
                      order.add(s1.next());
                      System.out.println("size:");
                      size.add(s1.next());
                   }
                  
                  System.out.println("-----------------------");
                  System.out.println("Your order:");
                  b=check (menu,order,size);
                  System.out.println("total cost");
                  System.out.println(b); 
                   
               }
               else if (strr1.equalsIgnoreCase("remove"))
               {
                   System.out.println("enter number of elements u want to remove:");
                   int x=s1.nextInt();
                    
                   System.out.println("what element/elements do u want to remove :");
                   for (int i=0;i<x;i++)
                   {
                       size.remove((order.remove(s1.next())));
                       
                   }
                    System.out.println("-----------------------");
                   System.out.println("Your order:");
                   b=check (menu,order,size);
                  System.out.println("total cost");
                  System.out.println(b); 
                   
               }
               else if (strr1.equalsIgnoreCase("replace"))
               {
                   System.out.println("enter number of element u want to replace:");
                   int y=s1.nextInt();
                   for (int i=0;i<y;i++)
                 {
                   System.out.println("enter the names of the  elements u want to replace?");
                   String s=s1.next();
                   System.out.println("what elements you want to add insted?");
                   String s2=s1.next();
                   System.out.println("enter the size of new element:");
                   String ss=s1.next();
                   
                   int x=order.indexOf(s);
                   order.set(x, s2);
                   size.set(x, ss);
                 }
                  System.out.println("-----------------------");
                  System.out.println("Your order:");
                   b=check (menu,order,size);
                  System.out.println("total cost");
                  System.out.println(b); 
                   
               }
              
    }
    //////////////////////////////////////////////////////////////////
    

    public static void main(String[] args)
    {
         
           Employee[] employee=new Employee[3];
           employee[0]=new Employee("Tahani",19);
           employee[1]=new Employee("Nour",20);
           employee[2]=new Employee ("Toleen",21);
           
  
           Menu[] menu=new Menu[3];
           ArrayList Cold=new ArrayList<>();
           Cold.addAll(Arrays.asList("IcedCoffee", "IcedChocolate", "IcedKinder","Frappuccino","IcedMintLemonade","IcedAmericano", "IcedVanilla","Icedlatee","Icedmocha","Icedtea","IcedCaramelMacchiato","Water"));
           ArrayList pricecold=new ArrayList<>();
           pricecold.addAll(Arrays.asList("s(8)\\l(10)","s(8)\\l(10)","s(9)\\l(11)","s(10)\\l(13)","s(7)\\l(10)","s(8)\\l(10)","s(8)\\l(10)","s(9)\\l(11)","s(5)\\l(7)","s(8)\\l(10)","s(10)\\l(15)","s(2)\\l(5)"));
           menu[0] =new Menu (Cold,pricecold);
 
          
           
          ArrayList Hot=new ArrayList<>();
          Hot.addAll(Arrays.asList("Coffee", "HotChocolate", "DripCoffee","Espresso","Latte","Cappuccino", "CaramelCappuccino","Nescafe","Mocha","Americano","RedTea","GreenTea"));
          ArrayList pricehot=new ArrayList<>();
          pricehot.addAll(Arrays.asList("s(5)\\l(7)","s(5)\\l(7)","s(10)\\l(13)","s(8)\\l(10)","s(5)\\l(7)","s(6)\\l(8)","s(5)\\l(7)","s(8)\\l(10)","s(8)\\l(10)","s(5)\\l(7)","s(5)\\l(7)","s(5)\\l(7)"));
          menu[1]=new Menu(Hot,pricehot);
          
          
          ArrayList Sweet=new ArrayList<>();
          Sweet.addAll(Arrays.asList("ClassicCookes", "ChocolateCookes", "ChocolateCroissate","ChocolateDoughnut","SugerDoughnut","ChocolateFilled"));
          ArrayList pricesweet=new ArrayList<>();
          pricesweet.addAll(Arrays.asList("s(5)\\l(7)","s(7)\\l(10)","s(7)\\l(10)","s(7)\\l(10)","s(5)\\l(7)","s(8)\\l(11)"));
          menu[2]=new Menu(Sweet,pricesweet);
          
            
           System.out.println("#Menu");
           System.out.println("");
           System.out.println("Cold Drinks:");
           print (menu,0);
           System.out.println("Hot Drinkes:");
           print (menu,1);
           System.out.println("Sweets:");
           print(menu,2);
           
        
           
        
           
           
           
           
           Scanner s=new Scanner (System.in);
           System.out.println("please choose the operation u want :");
           System.out.println("update (add/remove)");
           System.out.println("order");
           String str=s.nextLine();
           if (str.equalsIgnoreCase("update"))
               
           {
                System.out.println("enter the id :");
                String s7=s.nextLine();
                if (s7.equals(employee[0].getId()))
                {
                System.out.println("what update do u want to do?");
                String s1=s.nextLine();
                System.out.println("choose a section to update:");
                String s2=s.nextLine();
               
             
               updateMenu(menu,s1,s2);
                    
                }
                else
                {
                    System.out.println("--------------------------------");
                    System.out.println("u can not access the system");
                }
           }
           else if (str.equalsIgnoreCase("order"))
           {
                 
          
           
          ArrayList order=new ArrayList<>();
          System.out.println("choose what u want from the menu and when u finish your order inter (finish) ");
          int v=0;
          while (true)
          {
              order.add(s.next());
              v++;
              if (order.contains("finish"))
              {
                  break;
              }
          }
          
       
          
          order.remove("finish");
          v=v-1;
          System.out.println("choose the size for each order");
      
          ArrayList size=new ArrayList<>();
          for (int i=0;i<v;i++)
          {
             
              System.out.println(order.get(i)+":");
               size.add(s.next());
          }
          
            System.out.println("do you want to change the order(yes/no)?");
             String s5=s.next();
           
                if (s5.equalsIgnoreCase("no")) 
           {
              System.out.println("--------------------------------------------------------");
              System.out.println("Your order:");
              int x=check (menu,order,size);
              System.out.println("total cost:");
              System.out.println(x); 
            }
           
           else if (s5.equalsIgnoreCase("yes"))
           {
               System.out.println("do you want to add ,remove or replace element/elements from your order?");
               String stt1=s.next();
               
              updatOrder(menu,order,size,stt1) ;  
           }
  
       }  
         
        
    }

}

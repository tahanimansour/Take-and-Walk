
package takeandwalk;
import java.util.*;

public class Menu 
{
   private ArrayList element=new ArrayList<>();
   private ArrayList price=new ArrayList<>();
   

    public Menu() 
    {
        
    }

    public Menu(ArrayList element,ArrayList price)
    {
        this.element=element;
        this.price=price;
    }

    public ArrayList getElement()
    {
        return element;
    }

    public void setElement(ArrayList element)
    {
        this.element = element;
    }


    public ArrayList getPrice()
    {
        return price;
    }

    public void setPrice(ArrayList price)
    {
        this.price = price;
    }
     
   
}

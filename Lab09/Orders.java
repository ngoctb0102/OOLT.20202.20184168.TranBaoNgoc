package Lab09;
import java.util.*;

public class Orders {
    public static final int MAX_NUMBER_ORDERED = 10;
    public static final int MAX_LIMITED_ORDER = 5;
    private static int nbOrders = 0; 
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); 
    public void addMedia(Media m){
        if(checkNbOrders() != null){
            itemsOrdered.add(m);
            System.out.println(m.getTitle() + " have been added");
        }
    }
    public void removeMedia(Media m){
        if(itemsOrdered.size() < 1){
            System.out.println("Media list is empty");
        }else{
            if(itemsOrdered.contains(m)){
                itemsOrdered.remove(m);
                System.out.println(m.getTitle() + " have been remove");
            }
        }
    }
    public float total(){
        float total = 0.0f;
        for(int i = 0;i < itemsOrdered.size();i++){
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }
    public static Orders checkNbOrders(){
        if(nbOrders < MAX_LIMITED_ORDER){
            Orders s = new Orders();
            nbOrders+=1;
            return s;
        }else{
            System.out.println("The number of order is over limit !");
            return null;
        }
    }
    public static int getNbOrders() {
        return nbOrders;
    }
    public static void setNbOrders(int nbOrders) {
        Orders.nbOrders = nbOrders;
    }
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }
    public String PrintOrders(){
        String s = new String();
        s += "*************************************Orders**************************************";
        s+= "\n";
        if(itemsOrdered.size() > 0){
            for(int i = 0;i < itemsOrdered.size();i++){
                if(itemsOrdered.get(i) != null){
                    if(itemsOrdered.get(i).getId() != 0){
                        s += " - " + itemsOrdered.get(i).getId();
                    }
                    if(itemsOrdered.get(i).getTitle() != null){
                        s+= " - " + itemsOrdered.get(i).getTitle();
                    }
                    if(itemsOrdered.get(i).getCategory() != null){
                        s+= " - " + itemsOrdered.get(i).getCategory();
                    }
                    if(itemsOrdered.get(i).getCost() != 0f){
                        s+= " : "+ itemsOrdered.get(i).getCost() + "$\n";
                    }
                }
            }
            s+="\n" + "TotalCost : " + total();
        }else{
            s += "Order is empty";
        }
        s+= "\n***********************************************************************************";
        return s;
    }
}

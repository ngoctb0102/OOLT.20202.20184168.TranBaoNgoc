public class Orders {
    public static final int MAX_NUMBER_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0; 
    public static final int MAX_LIMITED_ORDER = 5;
    private Mydate dateOrdered = new Mydate();
    private static int nbOrders = 0; 
    public void addDigitalVideoDisc(DigitalVideoDisc dics){
        //checkNbOrders();
        if(qtyOrdered < MAX_NUMBER_ORDERED && checkNbOrders() != null){
            itemsOrdered[qtyOrdered] = dics;
            System.out.println("Dics has been added");
            qtyOrdered += 1;
        }else{
            System.out.println("The dvd " + dics.getTitle() + " could not be added");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        //checkNbOrders();
        if(dvdList != null && checkNbOrders() != null){
            if(dvdList.length > 0){
                for(int i = 0;i<dvdList.length;i++){
                    addDigitalVideoDisc(dvdList[i]);
                }
            }else{
                System.out.println("No dics to be added");
            }
        }else{
            System.out.println("Dics list is null");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        //checkNbOrders();
        if(qtyOrdered >= MAX_NUMBER_ORDERED || checkNbOrders() != null){
            System.out.println("The item quantity has reached the limit");
        }else{
            addDigitalVideoDisc(dvd1);
            addDigitalVideoDisc(dvd2);
        }
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
    public void removeDigitalVideoDisc(DigitalVideoDisc dics){
        int state = 0;
        if(qtyOrdered == 0){
            System.out.println("Remove dics is not found");
        }else{
            for(int i = 0;i<qtyOrdered;i++){
                if(itemsOrdered[i] == dics){
                    itemsOrdered[i] = null;
                    qtyOrdered -= 1;
                    System.out.println("Dics has been remove");
                    state += 1;
                }
            }
        }
        if(state != 0){
            System.out.println("Remove disc is not in order");
        }
    }
    public void PrintOrders(){
        System.out.println("*************************************Orders**************************************");
        System.out.print("Date : " );
        dateOrdered.print();
        System.out.print("\n");
        if(itemsOrdered != null){
            for(int i = 0;i < itemsOrdered.length;i++){
                if(itemsOrdered[i] != null){
                    if(itemsOrdered[i].getTitle() != null){
                        System.out.print("DVD" + itemsOrdered[i].getTitle());
                    }
                    if(itemsOrdered[i].getCategory() != null){
                        System.out.print(" - "+itemsOrdered[i].getCategory());
                    }
                    if(itemsOrdered[i].getDirectory() != null){
                        System.out.print(" - "+itemsOrdered[i].getDirectory());
                    }
                    if(itemsOrdered[i].getLength() != 0){
                        System.out.print(" - "+itemsOrdered[i].getLength());
                    }
                    if(itemsOrdered[i].getCost() != 0f){
                        System.out.print(" :"+itemsOrdered[i].getCost() + "$\n");
                    }
                }
            }
        }else{
            System.out.println("Order is empty");
        }
        System.out.println("TotalCost : " + totalCost());
        System.out.println("*********************************************************************************");
    }
    public float totalCost(){
        float total = 0.0f;
        if(qtyOrdered == 0){
            return total;
        }else{
            for(int i =0;i<qtyOrdered;i++){
                total += itemsOrdered[i].getCost();
            }
        }
        return total;
    }
    public int getQtyOrdered() {
        return qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public static int getNbOrders() {
        return nbOrders;
    }
    public static void setNbOrders(int nbOrders) {
        Orders.nbOrders = nbOrders;
    }
}

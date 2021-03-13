public class Orders {
    public static final int MAX_NUMBER_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0; 
    public void addDigitalVideoDisc(DigitalVideoDisc dics){
        if(qtyOrdered < 10){
            itemsOrdered[qtyOrdered] = dics;
            System.out.println("Dics has been added");
            qtyOrdered += 1;
        }else{
            System.out.println("Danh sach da day");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc dics){
        if(qtyOrdered == 0){
            System.out.println("Khong co phan tu nao trong danh sach");
        }else{
            for(int i = 0;i<qtyOrdered;i++){
                if(itemsOrdered[i] == dics){
                    itemsOrdered[i] = null;
                    qtyOrdered -= 1;
                    System.out.println("Dics has been remove");
                }
            }
        }
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
}

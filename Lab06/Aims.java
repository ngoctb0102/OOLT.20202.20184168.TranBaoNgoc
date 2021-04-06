package Lab06;

import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        int choose;
        Orders o = new Orders();
        Scanner c = new Scanner(System.in);
        do{
            ShowMenu();
            choose = c.nextInt();
            if(choose == 1){
                o = new Orders();
                System.out.println("Orders has been create");
            }
            if(choose == 2){
                System.out.println("Input Title of media");
                String title = c.next();
                System.out.println("Input Category of media");
                String category = c.next();
                System.out.println("Input cost of media");
                String Strcost = c.next();
                float cost = Float.parseFloat(Strcost);
                System.out.println("Input id of media");
                String Strid = c.next();
                int id = Integer.parseInt(Strid);
                Media m = new Media(title,category,cost,id);
                o.addMedia(m);
            }
            if(choose == 3){
                System.out.println("Input id to delete");
                int id = c.nextInt();
                for(int i = 0;i < o.getItemsOrdered().size();i++){
                    if(o.getItemsOrdered().get(i).getId() == id){
                        o.removeMedia(o.getItemsOrdered().get(i));
                        System.out.println(id + " has been deleted");
                    }
                }
            }
            if(choose == 4){
                o.PrintOrders();
            }
        }while(choose != 0);
        c.close();
    }
    public static void ShowMenu(){
        System.out.println("Order Management Application");
        System.out.println("----------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display item in the order");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose the number");
    }
}

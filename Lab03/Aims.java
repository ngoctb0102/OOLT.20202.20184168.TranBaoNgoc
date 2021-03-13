public class Aims{
    public static void main(String[] args) {
        Orders anOrder = new Orders();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirectory("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirectory("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirectory("John Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.print("Total cost is : ");
        System.out.println(anOrder.totalCost());

        //remove dvd3
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.print("Total cost is : ");
        System.out.println(anOrder.totalCost());
    }
}
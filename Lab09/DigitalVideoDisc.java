package Lab09;
public class DigitalVideoDisc extends Dics implements Comparable{

    public DigitalVideoDisc(String title, String category, float cost, int id, int length, String director) {
        super(title, category, cost, id, length, director);
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    public int compareTo(Object obj){
        DigitalVideoDisc t = (DigitalVideoDisc)obj;
        if(t == null){
            return 0;
        }else{
            if(t.getCost() > this.getCost()){
                return -1;
            }else if(t.getCost() == this.getCost()){
                if(t.getLength() > this.getLength()){
                    return -1;
                }else if(t.getLength() == this.getLength()){
                    if(t.getTitle().compareTo(this.getTitle()) > 0){
                        return -1;
                    }else if(t.getTitle().compareTo(this.getTitle()) == 0){
                        return 0;
                    }else{
                        return 1;
                    }
                }else{
                    return 1;
                }
            }else{
                return 1;
            }
        }
    }
}

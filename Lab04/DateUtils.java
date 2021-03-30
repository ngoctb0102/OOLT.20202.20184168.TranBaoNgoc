public class DateUtils {
    public int compare(Mydate d1, Mydate d2){
        int s1,s2,s3;
        int i = 0;
        s1 = d1.getYear() - d2.getYear();
        s2 = d1.getMonth() - d2.getMonth();
        s3 = d1.getDay() - d2.getDay();
        if(s1 > 0){i = 1;}
        if(s1 < 0){i = -1;}
        if(s1 == 0){
            if(s2 > 0){i=  1;}
            if(s2 < 0){i = -1;}
            if(s2 == 0){
                if(s3 > 0){i = 1;}
                if(s3 < 0){i = -1;}
                if(s3 == 0){i =  0;}
            }
        }
        return i;
    }

    public void SortDay(Mydate [] date, int type){
        if(type == 0){
            for(int i = 0;i < date.length;i++){
                for(int j =1;j < (date.length - i);j++){
                    if(compare(date[j-1],date[j]) > 0){
                        Mydate temp = date[j-1];
                        date[j-1] = date[j];
                        date[j] = temp;
                    }
                }
            }
        }
        if(type == 1){
            for(int i = 0;i < date.length;i++){
                for(int j =1;j < (date.length - i);j++){
                    if(compare(date[j-1],date[j]) < 0){
                        Mydate temp = date[j-1];
                        date[j-1] = date[j];
                        date[j] = temp;
                    }
                }
            }
        }
        for(int i = 0;i < date.length;i++){
            date[i].print();
        }
    }
}

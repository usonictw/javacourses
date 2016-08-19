/**
 * Created by PC on ${DATA}.
 */
public class WhileDemoLoop {

    public static void main(String[] args) {

        String[] myFriends=new String[20];
        myFriends[0]="Slava";
        myFriends[1]="Kolya";
        myFriends[2]="Lesha";
        myFriends[18]="Ksuha";
        myFriends[19]="Inna B";

        int i=0;
        while(i<myFriends.length){

            if (myFriends[i]==null){
                i++;
                continue;
            }

            System.out.println("Hello my friend "+myFriends[i]);
            i++;
        }

        System.out.println("this list finished");
    }


}

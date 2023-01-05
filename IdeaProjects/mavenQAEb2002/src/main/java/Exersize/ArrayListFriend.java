package Exersize;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFriend {
    public ArrayList<String> friendName(){
        ArrayList<String> myFriend = new ArrayList <>(Arrays.asList("Phodmo", "Rabu", "Keya","Mishu"));
        return myFriend;
    }

    public static void main(String[] args) {
        ArrayListFriend arrayListFriend = new ArrayListFriend();
        for (int i = 0; i < arrayListFriend.friendName().size() ; i++) {
            System.out.println(arrayListFriend.friendName().get(i));
        }
        System.out.println("............................................"+ "\n");
        for (String tmp : arrayListFriend.friendName()){
            System.out.println(tmp);
        }
    }
}

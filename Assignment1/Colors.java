import java.io.*;
import java.util.*;

public class Colors {
    public static void main(String[] args){
        ArrayList<String> colorsList = new ArrayList(Arrays.asList("red", "green", "blue", "yellow"));
        System.out.println(colorsList);
        Contains(colorsList);
    }

    public static void Contains(ArrayList<String> colorsList){
        System.out.println(colorsList.contains("red"));
    }
}


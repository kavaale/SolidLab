package src.edu.wctc.independentcopy.reader;

import java.util.ArrayList;

public class ListReader implements Reader {
    @Override
    public String readln() {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Hello");
        myList.add("my");
        myList.add("name");
        myList.add("is");
        myList.add("Alexander");
        String outputString = "";
        for(String text : myList){
            if(outputString==""){
                outputString = text;
            }
            else {
                outputString = outputString + " " + text;
            }
        }
        return outputString;
    }
}

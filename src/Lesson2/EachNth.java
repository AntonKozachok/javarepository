package Lesson2;

import org.jetbrains.annotations.NotNull;

public class EachNth {
    public String eachNth(int n, String str) {
        char[] medium = str.toCharArray();
        String result="";
        for (int i = 0; i<str.length(); i += n) result = result.concat(String.valueOf(medium[i]));
        return result;
    }

    public static void main(String[] args) {
        EachNth otpt = new EachNth();
        System.out.println("String with each Nth element is");
        System.out.printf("%s",otpt.eachNth(3, "sdfkjhsdfjkhsdjkfhjkh"));
    }
}

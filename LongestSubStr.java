package DSA;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStr {

    public static int getLongestString(String s){
        List<Character> temp = new ArrayList<>();
        int out = 0;

        for (int i=0; i<s.length(); i++){
            if (temp.contains(s.charAt(i))){

                if (temp.get(0) == s.charAt(i)){
                    temp.remove(0);
                    temp.add(s.charAt(i));
                    continue;
                }
                else {
                    if (out < temp.size()){
                        out = temp.size();
                    }
                    while (temp.contains(s.charAt(i))){
                        temp.remove(0);
                    }
                    temp.add(s.charAt(i));
                }

            }else {
                temp.add(s.charAt(i));
            }
        }
        return Math.max(out, temp.size());
    }

    public static void main(String[] args) {
        System.out.println(getLongestString("ohvhjdml"));
    }
}

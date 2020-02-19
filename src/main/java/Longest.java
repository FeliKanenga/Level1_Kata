import java.util.Arrays;
public class Longest {
    public static void main(String[] args)
    {
        String [] longest = {"the","quick","brown", "fox", "ate", "my", "chickens"};
        search(longest);
        String [] repeats = {"once", "upon", "a" ,"time"} ;
        search(repeats);
    }
    public static String[]search(String[] longest)
    {
        int size = longest.length;
        String another = "";
        int i = 0;
        int[] margin= new int[size];
        for(; i<size; i++) {
            margin[i] = longest[i].length();
        }
        Arrays.sort(margin);
        for (int j = 0; j<margin.length; j++)
        {
            if(margin[margin.length-1]==longest[j].length())
            {
                another +=longest[j]+"\n";
            }
        }
        System.out.println(another);
        return longest;
    }
}
import java.util.Arrays;
public class combine {
    public static void main(String[] args) {
        int[] num1 = {11,22,33};
        int[] num2 = {1,2,3};
        int[] num3 = new int[num1.length + num2.length];
        int k = 0;
        for (int i = 0; i < num3.length; i++) {
            if (i % 2 != 0) {
                try {
                    num3[i] = num2[k];
                } catch (Exception e) {
                    System.out.println(e);
                }
                k++;
            } else num3[i] = num1[k];
        }
        System.out.println(Arrays.toString(num3));

    }


}

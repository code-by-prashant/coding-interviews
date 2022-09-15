package Company.String;

// import java.util.Arrays;
// import java.util.Collections;

public class ExcelSheetNCR {

    public static int[] convert(String str){
        int [] res = new int[3];
    
        for(char ch : str.toCharArray()){
            int temp = ch - 'A' + 1;
            // res = res * 26 + temp;
            for(int i=0; i<res.length; i++){
                res[i] = res[i] * 26 + temp;
            }
        }
        //int max = Collections.max(Arrays.asList(res));
        return res;
    }
    
    
    public static void main(String[] args) {
        // convert("AA");
        // convert("AZ");
        // convert("BC");
    
        System.out.println(convert("AA"));
        System.out.println(convert("AZ"));
        System.out.println(convert("BC"));
    }
}

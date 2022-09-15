package Company.String;

public class StringProblems {
    
    public static void copy(char[] s1, char[] s2){

        for (int j = 0; j < s1.length; j++) {
            s2[j] = s1[j];
        }
    }

    public static void main(String[] args) {
        
        char[] s1 = "PRASHANT_MISHRA".toCharArray();
        char[] s2 = "NULL".toCharArray();

        copy(s1, s2);

        System.out.println(s2);
    }
}

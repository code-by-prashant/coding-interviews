package Company.String;

public class StringSeq {

    // function to skip character 'a'
    public static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if (ch == 'S') {
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }

    // driver code
    public static void main(String[] args) {
        System.out.println(skip("SaaraSiddiqui"));
    }
}

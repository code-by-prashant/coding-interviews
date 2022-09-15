package Company.String;
/* 
    Input: AaGHiP
    Output: BbHIjQ
 */
public class SwitchNextChar{

    static String switchNextCharacter (String str){
        String res = "";

        for(int i=0; i<str.length(); i++){  
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch++;
            }
            if (ch >= 'A' && ch <= 'Z') {
                ch++;
            }
            res = res + ch;
        }
        return res;
    }
    
    public static void main(String[] args) {
        String str = "AaGHiP";
        System.out.println(switchNextCharacter(str));
    }
}

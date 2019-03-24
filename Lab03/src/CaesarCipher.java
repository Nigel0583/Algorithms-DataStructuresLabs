public class CaesarCipher {
    public static String encryptCeaserCipher(String plainText, int offset) {
        if (offset >= 26)
            offset = offset - 26;
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i = 0; i < plainText.length(); i++) {
            ch = plainText.charAt(i);

            if (ch != ' ') {
                ch += offset;

                if (ch > 'Z') {
                    ch -= 26;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       System.out.println(encryptCeaserCipher("A",2));//C

        System.out.println(encryptCeaserCipher("MANY WORDS",5));//RFSD BTWIX

        System.out.println(encryptCeaserCipher("MORE",30));//QSVI

        System.out.println(encryptCeaserCipher("B",0));//B
    }
}

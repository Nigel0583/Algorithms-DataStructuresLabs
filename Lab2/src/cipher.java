public class cipher {
    public static void main(String[] args) {
        String message = "This is a secret message";
        message = (encrypt(message, 5));
        System.out.println(message);
        String message1 = decrypt(message);
        System.out.println(message1);
    }

    private static String encrypt(String plainText, int numColumns) {
        StringBuilder cipherText = new StringBuilder();
        int numRows;

        StringBuilder sb = new StringBuilder();
        int start = 0;
        //remove spaces
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) == ' ') {
                sb.append(plainText, start, i);
                start = i + 1;
            }
        }
        sb.append(plainText.substring(start));

        numRows = sb.length() / numColumns;

        if (sb.length() % numColumns != 0) {
            numRows++;
            for (int i = sb.length(); i < numColumns * numRows; i++) {
                sb.append(new StringBuilder("x"));
            }
        }
        System.out.println(sb);
        System.out.println(+sb.length());

        for (int i = 0; i < numColumns; i++) {
            int index = i;
            for (int x = 0; x < numRows; x++) {
                cipherText.append(sb.charAt(index));
                index += numColumns;

            }
            cipherText.append(" ");
        }
        return cipherText.toString();
    }

    private static String decrypt(String plainText){
        StringBuilder sb = new StringBuilder();
        char ch;

        for (int i=0; i< plainText.length(); i++){
            ch = plainText.charAt(i);
            if (ch != ' '){
                sb.append(ch);
            }
        }
        return sb.toString();
    }


}

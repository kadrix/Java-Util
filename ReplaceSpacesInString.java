class ReplaceSpacesInString {
    public static void URLify(String inputStr, int trueLength) {
        if (inputStr == null)
            throw new IllegalArgumentException();
        int count = 0;
        int finalLen = 0;
        char[] charStr = inputStr.toCharArray();
        for (int i = 0; i < trueLength; i++) {
            if (charStr[i] == ' ') {
                count++;
            }
        }

        finalLen = trueLength + 2 * count - 1;
        System.out.println(finalLen);
        System.out.println(count);
        // start from end and fill it in

        for (int i = trueLength - 1; i >= 0; i--) {
            if (charStr[i] == ' ') {
                charStr[finalLen] = '0';
                charStr[finalLen - 1] = '2';
                charStr[finalLen - 2] = '%';
                finalLen -= 3;
            } else {
                System.out.println(charStr[finalLen]);
                System.out.println(charStr[i]);

                charStr[finalLen] = charStr[i];
                finalLen--;
            }
        }
        System.out.println(new String(charStr).trim());
    }

    public static void main(String[] args) {
        String str = "Mr John Smith      ";
        int trueLen = 13;

        URLify(str, trueLen);
    }
}
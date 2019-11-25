class ReplaceSpacesInString {
    public static void URLify(String inputStr, int trueLength) {
        int count = 0;
        int strLen = inputStr.length();
        char[] charStr = inputStr.toCharArray();
        for (char c : charStr){
            if (c == ' '){
                count ++;
            }
        }
        while (charStr[strLen-1] == ' '){
            count--;
            strLen--;
        }
        
        int finalLen = trueLength+(3*count);

        //start from end and fill it in

        char[] modifiedStr = new char[finalLen];

        modifiedStr[trueLength+3*count-1] = '\0';


        
        System.out.println(inputStr);
        inputStr = inputStr.trim();
        System.out.println(inputStr);
        inputStr = inputStr.replaceAll("\\s", "%20");
        System.out.println(inputStr);

    }

    public static void main(String[] args) {
        String str = "Mr John Smith      ";
        int trueLen = 13;

        URLify(str, trueLen);
    }
}
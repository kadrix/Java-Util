class ZakoProb{

    public static int checkSum (int start, int end){
        int sum = 0;
        for (int i = 0; i>= start && i <=end; i ++){
            if (i%2 == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void chekRet(int sum) {
        if (sum > 10) return;
        
    }

    public static void main (String[] args){
        int start = 3;
        int end = 8;
        int result = checkSum(start, end);
        System.out.println(result);
    }
    
}
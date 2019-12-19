class CheckStringsAreOneEditAway {

  public static boolean isOneEditAway(String first, String second) {

    int abs = Math.abs(first.length() - second.length());
    if(abs > 1 ){
      System.out.println(abs);
      return false;
    }
    
    int count = 0;

    

    return true;
  }

  public static void main(String[] args) {

    String firstString = "Paldsde";
    String secondString = "Pade";

    boolean result = isOneEditAway(firstString, secondString);
    System.out.println(result);
  }

}
public class CheckZerosAndOnes {
    private static boolean checkNums(String s){
        int count1=0, count0=0, i=0;

        while(i < s.length()){
            int temp = 0;
            while(i < s.length() && s.charAt(i) == '1'){ //counting 1s
                temp++;
                i++;
            }
            count1 = Math.max(temp,count1);
            temp = 0;
            while(i < s.length() && s.charAt(i) == '0'){ // counting 0s
                temp++;
                i++;
            }
            count0 = Math.max(temp,count0);
        }
        return count1 > count0;
    }

    public static void main(String[] args) {
        String s = "10011000111";
        boolean res = checkNums(s);
        System.out.println(res);
    }
}

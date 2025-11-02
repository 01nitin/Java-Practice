package LeetCode;

//Longest Substring Without Repeating Characters
public class LongestPalindrome {
    public static void main(String[] a){
        String s = "geeksforgeeks";
        int n = s.length();
        if(n ==1 || n== 0){
            System.out.println("maxWindow :: "+ n);
        }
        int left =0, right =0;
        int maxWindow = 0;
        boolean[] window = new boolean[128];
        while(right <n){
            // if not present F
            if (window[s.charAt(right)] == true){
                System.out.println("condition is :: " + (window[s.charAt(right)] == true)+ " ind :: "+ left);
                window[s.charAt(left)] = false;
                System.out.println(" F  :: " + maxWindow);
                left ++;
            }
            else{
                window[s.charAt(right)] = true;
                maxWindow = Math.max(maxWindow,right - left +1);
                System.out.println(" else  :: " + maxWindow);
                right++;
            }
        }
        System.out.println("maxWindow :: "+ maxWindow);


    }
}

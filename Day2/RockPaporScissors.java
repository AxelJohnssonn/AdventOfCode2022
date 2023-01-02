package Day2;

import java.util.Map;

public class RockPaporScissors {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(275));
        Map<String, Integer> map = new HashMap<String,Integer>();

    }
    

    public static int sumOfDigits(int nbr){    
        if(nbr == 0){
            return 0;
        }
        if(nbr%10 == nbr){
            return 0;
        }
        
        return 1 + sumOfDigits(nbr/10);
    }
}

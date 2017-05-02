package tdd_practice;

public class FizzBuzz {
    
    public String stringCon = "";
    public String number ;
    
    
    public String fizzbuzz(){
        for(int i = 1 ; i<=20 ; i++){            
            if((i%3)==0){
                stringCon = stringCon.concat("Fizz");
            }
            else{
                number = Integer.toString(i);
                stringCon = stringCon.concat(number);
            }
        }
        System.out.print(stringCon); 
        return stringCon;
    }

}

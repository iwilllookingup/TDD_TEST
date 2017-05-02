package string_cal;

public class string_cal {
    
    String[] aaa ;
    int sum = 0;
    
    public int cal(String str) throws Exception{
        
        aaa = str.split(",|\n");
        
        if(str.equals("")){
            return 0;
        }else{ 
            
            for(int i = 0 ; i < aaa.length ; i++){
                if(aaa[i].contains("-"))
                {
                    throw new Exception("negatives not allowed");
                }
                sum += Integer.parseInt(aaa[i]);
            }
            return sum ;
            
        }
    }

}

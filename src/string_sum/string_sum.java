package string_sum;

public class string_sum {
    
    int sum ;
    
    public int stringsum(String a , String b){
        
        int aa,bb ;
        try{
        aa = Integer.parseInt(a) ;
        }
        catch (Exception e){
            aa = 0 ;
        }
        
        try{
            bb = Integer.parseInt(b) ;
            }
            catch (Exception e){
                bb = 0 ;
         }
        
        sum = aa + bb ;
        
        
        return sum;
        
    }

}

package string_sum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class string_sum_test {
    
    string_sum strs = new string_sum();
    
    @Test
    public void sum_1_and_2_should_return_3(){
        
        assertEquals(3, strs.stringsum("1","2"));
        
    }
    
    @Test
    public void empty_plus_2_should_be_2(){
        
        assertEquals(2,strs.stringsum("","2"));
    }
    
    
    


}

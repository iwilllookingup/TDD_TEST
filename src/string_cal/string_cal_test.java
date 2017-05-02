package string_cal;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class string_cal_test {
    
    string_cal sc = new string_cal();
    
    @Test
    public void empty_string_should_be_zero() throws Exception{
        assertEquals(0,sc.cal(""));
    }
    
    @Test
    public void insert_1_should_be_1()throws Exception{
        assertEquals(1,sc.cal("1")); 
    }
    
    @Test
    public void insert_two_number_should_be_their_sum()throws Exception{
        assertEquals(5,sc.cal("2,3"));
    }
    
    @Test
    public void insert_newline_should_be_look_as_delimiter()throws Exception{
        assertEquals(9,sc.cal("2\n3,4"));
    }
    
    @Test
    public void insert_negative_should_throw_exception(){
        try{
            sc.cal("-4");
        }catch(Exception e){
            assertEquals("negatives not allowed", e.getMessage());
        }
    }
    

}

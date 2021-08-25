import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class test_case {
    private String_Calculato sc;
    @Before
    public void initilaize(){
        sc=new String_Calculato();
    }
    @Test
    public void empty_string() throws Exception {
        assertEquals(sc.calculate(""),0);
    }
    @Test
    public void singlenumber() throws Exception{
    assertEquals(sc.calculate("1"),1);
    }
    @Test
    public void two_number_delimited_commas() throws Exception{
        assertEquals(sc.calculate("1,2"),3);
    }
    @Test
    public void two_number_delimited_newline() throws Exception{
        assertEquals(sc.calculate("1\n2"),3);
    }
    @Test
    public void n_number_delimited_commas() throws Exception{
        assertEquals(sc.calculate("1,2,3"),6);
    }
    @Test
    public void n_number_delimited_newline() throws Exception{
        assertEquals(sc.calculate("1\n2,3"),6);
    }
    @Test(expected = Exception.class)
    public void n_negative_number() throws Exception{
        sc.calculate("-1");
    }
    @Test
    public void n_number_greater_1000() throws Exception{
        assertEquals(sc.calculate("2,1000"),2);
    }
    @Test
    public void n_number_dilimited() throws Exception{
        assertEquals(sc.calculate("//;\n1;2"),3);
    }
    @Test
    public void n_number_extra_dilimited() throws Exception{
        assertEquals(sc.calculate("//;\n1*2"),3);
    }
}

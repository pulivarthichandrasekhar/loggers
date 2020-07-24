package taskloggers;
import static org.junit.Assert.*;
import org.junit.Test;
public class SimpleintrestcompoundintrestTest {

	@Test
	public void test() {
		Simpleintrestcompoundintrest si =new Simpleintrestcompoundintrest();
		assertEquals(10.0,si.SI(10.00,10.00,10.00),0);
		assertEquals(1223.9999771118164,si.CI(1200,2,1),0);	
	}

}

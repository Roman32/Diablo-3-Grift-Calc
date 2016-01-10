import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTests {
	
	@Test public void timeConstruct1(){
		Time testTime = new Time("10:53");
		System.out.println(testTime);
		System.out.println(testTime.minute);
		System.out.println(testTime.second);
		assert(testTime.minute == 10);
		assert(testTime.second == 53);
		assert(testTime.toString().equals("10:53"));
	}

}

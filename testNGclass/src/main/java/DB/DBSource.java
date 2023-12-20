package DB;

import org.testng.annotations.DataProvider;

public class DBSource {
	@DataProvider(name ="login")
	  public Object[][] dp() {
//	    return new Object[][] {
//	      new Object[] { 1, "a" },
//	      new Object[] { 2, "b" },
//	    };
		Object [] [] o = new Object [3] [2];
		o [0] [0]= "user1";
		o [0] [1]= "pass1";
		o [1] [0]= "user2";
		o [1] [1]= "pass2";
		o [2] [0]= "user3";
		o [2] [1]= "pass3";
		return o;
	  }

}

import org.testng.annotations.Test;

public class NewTest {
	NewTest newone = new NewTest();
 



	
  @Test(dataProvider="dpaddition")
  public void add1Test(int exp_value,int a ,int b) {
	  Assert.assertEquals(cal.add1(a,b) ,exp_value);
	  System.out.println("addition");
  }
  
 

private Object add1(int a, int b) {
	// TODO Auto-generated method stub
	return null;
}





@DataProvider(name="dpaddtion")
  public Object[][] getdata(){
	return new Object[][] {{10,5,5} ,{20,10,10},{30,15,15}};
  }
}
 
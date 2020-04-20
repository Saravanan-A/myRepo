package classandobject;

public class AccountHolder {

		String firstName;
		String lastName;
		int age;
		float accountBalance;
		boolean eligibiltyForCredictCard;
		
		public void testEligibilityForCredictCard(){
			if(age>25 && accountBalance>=20000)
			{
			eligibiltyForCredictCard=true;
			}
		
		}
		

	
}

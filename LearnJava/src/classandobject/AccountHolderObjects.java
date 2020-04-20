package classandobject;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName="Tom";
		tom.lastName="Jim";
		tom.age=24;
		tom.accountBalance=10000;
		tom.testEligibilityForCredictCard();
		
		henry.firstName="Henry";
		henry.lastName="Jill";
		henry.age=35;
		henry.accountBalance=20000;
		henry.testEligibilityForCredictCard();
		
		sarah.firstName="Sarah";
		sarah.lastName="Benny";
		sarah.age=20;
		sarah.accountBalance=25000;
		sarah.testEligibilityForCredictCard();
		
		System.out.println("Is Tom Eligible for CC:"+tom.eligibiltyForCredictCard);
		System.out.println("Is Henry Eligible for CC:"+henry.eligibiltyForCredictCard);
		System.out.println("Is Sarah Eligible for CC:"+sarah.eligibiltyForCredictCard);
 
	}

}

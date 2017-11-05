

class switchStatementOneTest {
	public static void main(String args[]){
		switchStatementSubOne subOne = new switchStatementSubOne("Tom", "Woods");
		switchStatementSubOne subTwo = new switchStatementSubOne("Sally", "Gonzalez");
		switchStatementSubOne subThree = new switchStatementSubOne("Joseph", "Brown");
		
		int mainMobiletestOct = 20;
		int deduction = 5;
		int mainMobiletestNov = mainMobiletestOct - deduction;
		
		switch(mainMobiletestNov) {
		case 10:
			System.out.printf("Dear %s %s.\n.You have sufficient upgrades for First Class Access",subOne.getMember(), subOne.getlMember());
			break;
		case 7:
			System.out.printf("Dear %s %s.\nYou have sufficient upgrades for Business Class Access", subOne.getMember(), subOne.getlMember());
			break;
		default:
			System.out.printf("Dear %s %s.\nYou have insufficient upgrade for upper class. Please purchase upgrades.", subOne.getMember(), subOne.getlMember());
		}
	}
}
































/*int boy = 21;
int people = boy - 20;

people++;
System.out.println("You are "+ people);
switch(people) {
case 1:
	System.out.println("You may not enter");
	break;
case 2:
	System.out.println("You may not enter again ");
	break;
case 3:
	System.out.println("I told you you cant Enter");
	break;
default:
	System.out.println("You can Enter");
}			
}*/
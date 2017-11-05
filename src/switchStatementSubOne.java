

public class switchStatementSubOne {
	private String member;
	private String lMember;
	
	public switchStatementSubOne(String m, String l) {
		member = m;
		lMember = l;
		
	}
	public String setMember(){
		return member;
	}
	public void getMember() {
		System.out.printf("%s",setMember());	
	}
	public String setlMember(){
		return lMember;
	}
	public void getlMember() {
		System.out.printf("%s",setlMember());	
	}	
}

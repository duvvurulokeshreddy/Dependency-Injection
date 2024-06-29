package com.jsp.spring.DependcyInjectionType;

public class Student {
	
	private int sId;
	private MathCheat cheat;
	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	
	public void setsId(int sId) {
		this.sId = sId;
	}

	public void chetting() {
		 cheat.mathCheat();
		 System.out.println("Hey I am "+sId+" whatever you can do it ....");
	 }

}

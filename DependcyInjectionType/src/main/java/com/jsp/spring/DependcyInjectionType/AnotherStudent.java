package com.jsp.spring.DependcyInjectionType;

public class AnotherStudent {

	private MathCheat mathCheat;
	
	public void startCheating() {
		mathCheat.mathCheat();
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
}

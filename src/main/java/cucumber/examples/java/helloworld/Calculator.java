package cucumber.examples.java.helloworld;

public class Calculator {

	private int tall1 = 0;
	private int tall2 = 0;
	private int tall3 = 0;
	Operand oper;

	public void setNumbers(int number) {
		if (tall1 == 0) {
			this.tall1 = number;
		} else if(tall2 == 0){
			this.tall2 = number;
		}else this.tall3 = number;

	}

	public void sumNumbers() {

	}

	public int calcresult() {
		if (oper.ADD.equals(oper)) {
			return tall1 + tall2 + tall3;
		}
		if(oper.SUBTRACT.equals(oper)){
			return tall1 - tall2;
		}
		else throw new RuntimeException();
	}

	public int getTall1() {
		return tall1;
	}

	public void setTall1(int tall1) {
		this.tall1 = tall1;
	}

	public int getTall2() {
		return tall2;
	}

	public void setTall2(int tall2) {
		this.tall2 = tall2;
	}

	public void setCommand(Operand command) {
		this.oper = command;

	}

}

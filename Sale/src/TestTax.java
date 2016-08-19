public class TestTax{

	public static void main(String[] args) {
		
		//Tax t=new Tax();
		NJT t=new NJT();

		t.grossIncome=401;
		t.numberOfDependets=2;
		t.state="NJ";

		double yourTax=t.calcTax();
		double njt=t.adjustForStudent(yourTax);
		System.out.println("Your tax: "+njt);
	}
}
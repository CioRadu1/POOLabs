
public class BankAccount{
	int sold;

	public BankAccount(int sold) {
		this.sold = sold;
	}
	
	void retragereNumerar(int sum) throws FondInsuficientException {
		if(sum > sold) {
			throw new FondInsuficientException("Fond insuficient.");
		}
		else {
			sold = sold - sum;
		}
	}
	
	

}

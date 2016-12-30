package core;

public class PrimeNumberChecker {
	
	public boolean validate(final int primeNumber) {
		if (primeNumber <= 1) return false;
		if (primeNumber == 2) return true;
		if (primeNumber % 2 == 0) return false;
		
		for (int i = 3; i < (primeNumber / 2); i++) {
			if (primeNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
}

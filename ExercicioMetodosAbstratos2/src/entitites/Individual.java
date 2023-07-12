package entitites;

public class Individual extends TaxPayer {
	private double healthExpenditures;

	public Individual() {
	}

	public Individual(String name, Double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {		
		double tax = 0.0;
		if (super.getAnualIncome() <= 20000.0) {
			tax = super.getAnualIncome() * 0.15;
		} else {
			tax = super.getAnualIncome() * 0.25;
		}
		
		double health = healthExpenditures * 0.50;
		
		return tax - health;
		
	}
}

package br.com.api.car.tinnova.model;

public class CarByDecade {

	private int decade;
	private int amount;

	public int getDecade() {
		return decade;
	}

	public void setDecade(int decade) {
		this.decade = decade;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + decade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarByDecade other = (CarByDecade) obj;
		if (amount != other.amount)
			return false;
		if (decade != other.decade)
			return false;
		return true;
	}

}

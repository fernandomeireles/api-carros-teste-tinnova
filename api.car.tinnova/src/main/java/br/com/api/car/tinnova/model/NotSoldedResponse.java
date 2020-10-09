package br.com.api.car.tinnova.model;

public class NotSoldedResponse extends BaseResponse {

	private static final long serialVersionUID = -7479279223322542091L;

	private int amountSolded;

	public int getAmountSolded() {
		return amountSolded;
	}

	public void setAmountSolded(int amountSolded) {
		this.amountSolded = amountSolded;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + amountSolded;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		NotSoldedResponse other = (NotSoldedResponse) obj;
		if (amountSolded != other.amountSolded)
			return false;
		return true;
	}

}

package br.com.api.car.tinnova.model;

import java.util.List;

public class CarByDecadeResponse extends BaseResponse {

	private static final long serialVersionUID = 103786026519079077L;

	private List<String> listOfDecadeCar;

	public List<String> getListOfDecadeCar() {
		return listOfDecadeCar;
	}

	public void setListOfDecadeCar(List<String> listOfDecadeCar) {
		this.listOfDecadeCar = listOfDecadeCar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((listOfDecadeCar == null) ? 0 : listOfDecadeCar.hashCode());
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
		CarByDecadeResponse other = (CarByDecadeResponse) obj;
		if (listOfDecadeCar == null) {
			if (other.listOfDecadeCar != null)
				return false;
		} else if (!listOfDecadeCar.equals(other.listOfDecadeCar))
			return false;
		return true;
	}

}

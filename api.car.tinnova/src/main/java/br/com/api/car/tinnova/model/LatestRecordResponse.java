package br.com.api.car.tinnova.model;

import java.util.List;

public class LatestRecordResponse extends BaseResponse {

	private static final long serialVersionUID = 2818255455879581275L;

	private List<Car> listCars;

	public List<Car> getListCars() {
		return listCars;
	}

	public void setListCars(List<Car> listCars) {
		this.listCars = listCars;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((listCars == null) ? 0 : listCars.hashCode());
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
		LatestRecordResponse other = (LatestRecordResponse) obj;
		if (listCars == null) {
			if (other.listCars != null)
				return false;
		} else if (!listCars.equals(other.listCars))
			return false;
		return true;
	}

}

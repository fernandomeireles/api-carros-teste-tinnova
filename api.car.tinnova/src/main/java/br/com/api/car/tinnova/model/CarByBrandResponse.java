package br.com.api.car.tinnova.model;

import java.util.List;

public class CarByBrandResponse extends BaseResponse {

	private static final long serialVersionUID = 1775613130742357909L;

	private List<String> listCarByBrand;

	public List<String> getListCarByBrand() {
		return listCarByBrand;
	}

	public void setListCarByBrand(List<String> listCarByBrand) {
		this.listCarByBrand = listCarByBrand;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((listCarByBrand == null) ? 0 : listCarByBrand.hashCode());
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
		CarByBrandResponse other = (CarByBrandResponse) obj;
		if (listCarByBrand == null) {
			if (other.listCarByBrand != null)
				return false;
		} else if (!listCarByBrand.equals(other.listCarByBrand))
			return false;
		return true;
	}

}

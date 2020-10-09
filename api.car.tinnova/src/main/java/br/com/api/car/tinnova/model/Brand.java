package br.com.api.car.tinnova.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_marca")
public class Brand implements Serializable {

	private static final long serialVersionUID = 1952983488681203524L;
	
	@Id	
	@Column(name = "marca", nullable = false)
	private String brand;
}

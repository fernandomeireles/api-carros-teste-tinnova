package br.com.api.car.tinnova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.api.car.tinnova.model.Brand;

public interface BrandRepositoryI extends JpaRepository<Brand, String>, CrudRepository<Brand, String> {

}

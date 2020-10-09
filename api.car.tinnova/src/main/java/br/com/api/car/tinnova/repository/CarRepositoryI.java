package br.com.api.car.tinnova.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.car.tinnova.model.Car;

@Repository
public interface CarRepositoryI extends JpaRepository<Car, Long>, CrudRepository<Car, Long> {

	@Query("Select COUNT(car) FROM Car car WHERE car.sold = 0")
	public int findlAllNotSould();

	@Query(value = "Select CONCAT(marca, ' - ', COUNT(*)) as carByMarca FROM tb_car car GROUP BY car.marca", nativeQuery = true)
	public List<String> findlCarByBrand();

	@Query(value = "Select CONCAT(CONCAT(LEFT(ano,3),0), ' - ', COUNT(*)) as carByDecade FROM tb_car car GROUP BY LEFT(ano,3)", nativeQuery = true)
	public List<String> findlCarByDecade();
	
	@Query(value = "Select * FROM tb_car car WHERE DATE(car.created) BETWEEN (SYSDATE()-INTERVAL 7 DAY) AND SYSDATE() ", nativeQuery = true )
	public List<Car> findlAllRegisterWeak();

}

package repository;

import java.util.List;
import Car;

public interface CarRepo {
	Car findById(int id);
	List<Car> findAny();
}

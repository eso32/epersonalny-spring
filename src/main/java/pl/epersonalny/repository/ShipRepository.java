package pl.epersonalny.repository;

import org.springframework.data.repository.CrudRepository;
import pl.epersonalny.model.Shipwreck;

public interface ShipRepository extends CrudRepository<Shipwreck, Long> {

}

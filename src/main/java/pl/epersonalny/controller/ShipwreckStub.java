package pl.epersonalny.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.epersonalny.model.Shipwreck;
import pl.epersonalny.repository.ShipRepository;

@Service
public class ShipwreckStub {

	@Autowired
	private ShipRepository shipRepository;


	public Shipwreck create(Shipwreck wreck) {
		shipRepository.save(wreck);
		return wreck;
	}

	public List<Shipwreck> listAll() {
		List<Shipwreck> shipwrecks = new ArrayList<>();
		shipRepository.findAll()
				.forEach(shipwrecks::add);

		return shipwrecks;
	}
}

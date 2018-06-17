package pl.epersonalny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.epersonalny.model.Shipwreck;

@SpringBootApplication
public class EpersonalnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpersonalnyApplication.class, args);

		Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);

	}
}

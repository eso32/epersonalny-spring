package pl.epersonalny.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.epersonalny.model.Shipwreck;

import java.util.List;

@RestController
public class DutyController {

    @Autowired
    private ShipwreckStub shipwreckStub;

    private Long idWreck;

    @RequestMapping("/")
    public List<Shipwreck> reportDuty() {

        return shipwreckStub.listAll();
    }

}

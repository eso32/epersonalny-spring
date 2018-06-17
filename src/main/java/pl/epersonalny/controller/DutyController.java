package pl.epersonalny.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DutyController {

    @RequestMapping("/")
    public String reportDuty() {
        return "Reporting for duty ~ Das Boat";
    }

}

package ch.abbts.nds.swe.swd.springstarter.solder.controller;

import ch.abbts.nds.swe.swd.springstarter.solder.service.EmptyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping(path = "/empty")
public class EmptyController {

    @Autowired
    private EmptyService service;

    @GetMapping(path = "/", produces = "application/text")
    public String empty(){
        return service.getData();
    }

}

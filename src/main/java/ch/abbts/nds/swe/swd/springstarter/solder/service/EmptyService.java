package ch.abbts.nds.swe.swd.springstarter.solder.service;

import ch.abbts.nds.swe.swd.springstarter.solder.presistence.EmptyDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmptyService {

    @Autowired
    private EmptyDb db;

    public String getData(){
        return db.data();
    }

}

package ch.abbts.nds.swe.swd.springstarter.solder.presistence;


import org.springframework.stereotype.Component;

@Component
public class EmptyDb {
    public String data(){
        return "I am from the lowest layer.";
    }
}

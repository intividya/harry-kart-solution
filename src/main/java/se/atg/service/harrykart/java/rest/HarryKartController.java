package se.atg.service.harrykart.java.rest;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.atg.service.harrykart.java.exception.HarryKartException;
import se.atg.service.harrykart.java.model.HarryKart;
import se.atg.service.harrykart.java.model.Rank;
import se.atg.service.harrykart.java.services.HarryKartResultService;
import se.atg.service.harrykart.java.services.HarryKartSerializerService;

@RestController
@RequestMapping("/java/api")
public class HarryKartController {

	@PostMapping(path = "/play", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String playHarryKart(@RequestBody String inputXML) {
        HarryKartSerializerService hkSerializer = new HarryKartSerializerService();
        try {
            // De-serialize the XML
            HarryKart harryKart = hkSerializer.deserializeFromXML(inputXML);
            // Calculate the race results
            List<Rank> ranking = new HarryKartResultService(harryKart).getResults();
            // return JSON results
            return hkSerializer.serializeToJson(ranking);
        } catch(HarryKartException harryKartException) {
            System.out.println("HarryKartException: " + harryKartException.getMessage());
            return "{\"message\": " + harryKartException.getMessage() + " }";
        }
    }

}

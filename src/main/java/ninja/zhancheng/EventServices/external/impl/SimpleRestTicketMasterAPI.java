package ninja.zhancheng.EventServices.external.impl;



import ninja.zhancheng.EventServices.EventServiceApplication;
import ninja.zhancheng.EventServices.domain.TicketMaster.Event;
import ninja.zhancheng.EventServices.domain.TicketMaster.EventResponse;
import ninja.zhancheng.EventServices.external.TicketMasterAPI;
import org.json.simple.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;


@Component
public class SimpleRestTicketMasterAPI implements TicketMasterAPI {

    private static final Logger log = LoggerFactory.getLogger(EventServiceApplication.class);

    @Override
    public List<Event> getLocalEvents() {


        String url = "https://app.ticketmaster.com/discovery/v2/events.json?";
        url += "city=Toronto&";
        url += "apikey=QNIRiZ7E8TkwEMASpYMFcd6fUJQ0opf9";
        RestTemplate restTemplate = new RestTemplate();


        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        log.info("Ticket Master API call, path:" + url + "Response: " + responseEntity.toString());



        EventResponse tk_response = restTemplate.getForObject(url, EventResponse.class);


        return tk_response.get_embedded().getEvents();
    }
}

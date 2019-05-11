package ninja.zhancheng.EventServices.external;


import ninja.zhancheng.EventServices.domain.TicketMaster.Event;
import org.json.simple.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TicketMasterAPI {

     List<Event> getLocalEvents();
}

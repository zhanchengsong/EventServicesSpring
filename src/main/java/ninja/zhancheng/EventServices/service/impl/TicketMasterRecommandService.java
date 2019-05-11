package ninja.zhancheng.EventServices.service.impl;

import com.google.gson.Gson;
import ninja.zhancheng.EventServices.domain.TicketMaster.Event;
import ninja.zhancheng.EventServices.external.TicketMasterAPI;
import ninja.zhancheng.EventServices.service.EventRecommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketMasterRecommandService implements EventRecommandService {
    @Autowired
    private TicketMasterAPI ticketMasterAPI;
    private Gson gson;
    @Override
    public List<Event> recommandEvent() {
        return ticketMasterAPI.getLocalEvents();

    }
}

package ninja.zhancheng.EventServices.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ninja.zhancheng.EventServices.domain.TicketMaster.Event;
import ninja.zhancheng.EventServices.service.EventRecommandService;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class EventRecommendController {

    private EventRecommandService eventRecommandService;

    @Autowired

    public EventRecommendController(EventRecommandService eventRecommandService) {
        this.eventRecommandService = eventRecommandService;

    }
    @GetMapping
    public List<Event> getRecommandedEvent() {
        return this.eventRecommandService.recommandEvent();
    }


}

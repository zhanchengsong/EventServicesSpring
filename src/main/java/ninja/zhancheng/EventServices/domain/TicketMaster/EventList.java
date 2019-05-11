package ninja.zhancheng.EventServices.domain.TicketMaster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties
public class EventList {
    private List<Event> events;
}

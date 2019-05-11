package ninja.zhancheng.EventServices.domain.TicketMaster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties
@Data
public class EventResponse {
    private EventList _embedded;
}

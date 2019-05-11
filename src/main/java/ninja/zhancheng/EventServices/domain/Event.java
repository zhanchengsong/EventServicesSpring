package ninja.zhancheng.EventServices.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;


@RequiredArgsConstructor
@Data
public class Event  {

    private String name;
    private String location;
    private String date;



}

package ninja.zhancheng.EventServices.domain.TicketMaster;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@JsonIgnoreProperties()
@Data
@RequiredArgsConstructor

public class Event {
    private String name;
    private String type;
    private String id;
    private double distance;
    private Location location;
    private String url;
    private List<Image> images;


    @JsonIgnoreProperties
    @Data
    @RequiredArgsConstructor
    //Make the class static inorder to be instantiated as Event.Image()
    private static class Image {
        private String ratio;
        private String url;
        private int width;
        private int height;
    }

    @JsonIgnoreProperties
    @Data
    @RequiredArgsConstructor
    private static class Location {
        private String longitude;
        private String latitude;
    }
}

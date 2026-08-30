package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ConversionApiResponseEventsItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Conversion events.
 */
public class ConversionEvents   {

    private List<@Valid ConversionApiResponseEventsItems> events = new ArrayList<>();
    private Integer numEventsProcessed;
    private Integer numEventsReceived;

    /**
     * Default constructor.
     */
    public ConversionEvents() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEvents.
     *
     * @param events Specific messages for each event received. The order will match the order in which the events were received in the request.
     * @param numEventsProcessed Number of events that were successfully processed from the events.
     * @param numEventsReceived Total number of events received in the request.
     */
    public ConversionEvents(
        List<@Valid ConversionApiResponseEventsItems> events, 
        Integer numEventsProcessed, 
        Integer numEventsReceived
    ) {
        this.events = events;
        this.numEventsProcessed = numEventsProcessed;
        this.numEventsReceived = numEventsReceived;
    }



    /**
     * Specific messages for each event received. The order will match the order in which the events were received in the request.
     * @return events
     */
    public List<@Valid ConversionApiResponseEventsItems> getEvents() {
        return events;
    }

    public void setEvents(List<@Valid ConversionApiResponseEventsItems> events) {
        this.events = events;
    }

    /**
     * Number of events that were successfully processed from the events.
     * @return numEventsProcessed
     */
    public Integer getNumEventsProcessed() {
        return numEventsProcessed;
    }

    public void setNumEventsProcessed(Integer numEventsProcessed) {
        this.numEventsProcessed = numEventsProcessed;
    }

    /**
     * Total number of events received in the request.
     * @return numEventsReceived
     */
    public Integer getNumEventsReceived() {
        return numEventsReceived;
    }

    public void setNumEventsReceived(Integer numEventsReceived) {
        this.numEventsReceived = numEventsReceived;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEvents {\n");
        
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    numEventsProcessed: ").append(toIndentedString(numEventsProcessed)).append("\n");
        sb.append("    numEventsReceived: ").append(toIndentedString(numEventsReceived)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


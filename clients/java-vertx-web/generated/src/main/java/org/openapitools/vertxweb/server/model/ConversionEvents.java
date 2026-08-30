package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ConversionApiResponseEventsItems;

/**
 * Conversion events.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEvents   {
  
  private List<ConversionApiResponseEventsItems> events = new ArrayList<>();
  private Integer numEventsProcessed;
  private Integer numEventsReceived;

  public ConversionEvents () {

  }

  public ConversionEvents (List<ConversionApiResponseEventsItems> events, Integer numEventsProcessed, Integer numEventsReceived) {
    this.events = events;
    this.numEventsProcessed = numEventsProcessed;
    this.numEventsReceived = numEventsReceived;
  }

    
  @JsonProperty("events")
  public List<ConversionApiResponseEventsItems> getEvents() {
    return events;
  }
  public void setEvents(List<ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

    
  @JsonProperty("num_events_processed")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

    
  @JsonProperty("num_events_received")
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }
  public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEvents conversionEvents = (ConversionEvents) o;
    return Objects.equals(events, conversionEvents.events) &&
        Objects.equals(numEventsProcessed, conversionEvents.numEventsProcessed) &&
        Objects.equals(numEventsReceived, conversionEvents.numEventsReceived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, numEventsProcessed, numEventsReceived);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

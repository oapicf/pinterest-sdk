package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ConversionApiResponseEventsInner;

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionApiResponse   {
  
  private Integer numEventsReceived;
  private Integer numEventsProcessed;
  private List<ConversionApiResponseEventsInner> events = new ArrayList<>();

  public ConversionApiResponse () {

  }

  public ConversionApiResponse (Integer numEventsReceived, Integer numEventsProcessed, List<ConversionApiResponseEventsInner> events) {
    this.numEventsReceived = numEventsReceived;
    this.numEventsProcessed = numEventsProcessed;
    this.events = events;
  }

    
  @JsonProperty("num_events_received")
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }
  public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }

    
  @JsonProperty("num_events_processed")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

    
  @JsonProperty("events")
  public List<ConversionApiResponseEventsInner> getEvents() {
    return events;
  }
  public void setEvents(List<ConversionApiResponseEventsInner> events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionApiResponse conversionApiResponse = (ConversionApiResponse) o;
    return Objects.equals(numEventsReceived, conversionApiResponse.numEventsReceived) &&
        Objects.equals(numEventsProcessed, conversionApiResponse.numEventsProcessed) &&
        Objects.equals(events, conversionApiResponse.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numEventsReceived, numEventsProcessed, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionApiResponse {\n");
    
    sb.append("    numEventsReceived: ").append(toIndentedString(numEventsReceived)).append("\n");
    sb.append("    numEventsProcessed: ").append(toIndentedString(numEventsProcessed)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

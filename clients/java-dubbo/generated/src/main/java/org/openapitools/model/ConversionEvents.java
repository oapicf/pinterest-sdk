package org.openapitools.model;

import org.openapitools.model.ConversionApiResponseEventsItems;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Conversion events.
 */
public class ConversionEvents implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   */
  @JsonProperty("events")
  private List<ConversionApiResponseEventsItems> events = new ArrayList<>();

  /**
   * Number of events that were successfully processed from the events.
   */
  @JsonProperty("num_events_processed")
  private Integer numEventsProcessed;

  /**
   * Total number of events received in the request.
   */
  @JsonProperty("num_events_received")
  private Integer numEventsReceived;

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   * @return events
   */
  public List<ConversionApiResponseEventsItems> getEvents() {
    return events;
  }

  public void setEvents(List<ConversionApiResponseEventsItems> events) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEvents conversionEvents = (ConversionEvents) o;
    return Objects.equals(this.events, conversionEvents.events) &&
        Objects.equals(this.numEventsProcessed, conversionEvents.numEventsProcessed) &&
        Objects.equals(this.numEventsReceived, conversionEvents.numEventsReceived);
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

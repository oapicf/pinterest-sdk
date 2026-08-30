package apimodels;

import apimodels.ConversionApiResponseEventsItems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Conversion events.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEvents   {
  @JsonProperty("events")
  @NotNull
@Valid

  private List<@Valid ConversionApiResponseEventsItems> events = new ArrayList<>();

  @JsonProperty("num_events_processed")
  @NotNull

  private Integer numEventsProcessed;

  @JsonProperty("num_events_received")
  @NotNull

  private Integer numEventsReceived;

  public ConversionEvents events(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
    return this;
  }

  public ConversionEvents addEventsItem(ConversionApiResponseEventsItems eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   * @return events
  **/
  public List<@Valid ConversionApiResponseEventsItems> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

  public ConversionEvents numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

   /**
   * Number of events that were successfully processed from the events.
   * @return numEventsProcessed
  **/
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  public ConversionEvents numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

   /**
   * Total number of events received in the request.
   * @return numEventsReceived
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


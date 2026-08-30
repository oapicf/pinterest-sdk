package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Conversion events.
 */
@ApiModel(description="Conversion events.")

public class ConversionEvents  {
  
 /**
  * Specific messages for each event received. The order will match the order in which the events were received in the request.
  */
  @ApiModelProperty(required = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
  @Valid
  private List<@Valid ConversionApiResponseEventsItems> events = new ArrayList<>();

 /**
  * Number of events that were successfully processed from the events.
  */
  @ApiModelProperty(example = "1", required = true, value = "Number of events that were successfully processed from the events.")
  private Integer numEventsProcessed;

 /**
  * Total number of events received in the request.
  */
  @ApiModelProperty(example = "1", required = true, value = "Total number of events received in the request.")
  private Integer numEventsReceived;
 /**
  * Specific messages for each event received. The order will match the order in which the events were received in the request.
  * @return events
  */
  @JsonProperty("events")
  @NotNull
  public List<@Valid ConversionApiResponseEventsItems> getEvents() {
    return events;
  }

  /**
   * Sets the <code>events</code> property.
   * <br><em>N.B. <code>events</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setEvents(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

  /**
   * Sets the <code>events</code> property.
   * <br><em>N.B. <code>events</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionEvents events(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
    return this;
  }

  /**
   * Adds a new item to the <code>events</code> list.
   * <br><em>N.B. <code>events</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionEvents addEventsItem(ConversionApiResponseEventsItems eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

 /**
  * Number of events that were successfully processed from the events.
  * @return numEventsProcessed
  */
  @JsonProperty("num_events_processed")
  @NotNull
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  /**
   * Sets the <code>numEventsProcessed</code> property.
   * <br><em>N.B. <code>numEventsProcessed</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  /**
   * Sets the <code>numEventsProcessed</code> property.
   * <br><em>N.B. <code>numEventsProcessed</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionEvents numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

 /**
  * Total number of events received in the request.
  * @return numEventsReceived
  */
  @JsonProperty("num_events_received")
  @NotNull
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }

  /**
   * Sets the <code>numEventsReceived</code> property.
   * <br><em>N.B. <code>numEventsReceived</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }

  /**
   * Sets the <code>numEventsReceived</code> property.
   * <br><em>N.B. <code>numEventsReceived</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ConversionEvents numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


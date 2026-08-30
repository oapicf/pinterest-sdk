package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion events.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Conversion events.")
public class ConversionEvents   {
  
  private List<@Valid ConversionApiResponseEventsItems> events = new ArrayList<>();

  private Integer numEventsProcessed;

  private Integer numEventsReceived;

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   **/
  public ConversionEvents events(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
  @JsonProperty("events")
  @NotNull
  public List<@Valid ConversionApiResponseEventsItems> getEvents() {
    return events;
  }
  public void setEvents(List<@Valid ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

  public ConversionEvents addEventsItem(ConversionApiResponseEventsItems eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }


  /**
   * Number of events that were successfully processed from the events.
   **/
  public ConversionEvents numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Number of events that were successfully processed from the events.")
  @JsonProperty("num_events_processed")
  @NotNull
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }


  /**
   * Total number of events received in the request.
   **/
  public ConversionEvents numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Total number of events received in the request.")
  @JsonProperty("num_events_received")
  @NotNull
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


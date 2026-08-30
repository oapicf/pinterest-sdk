package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConversionApiResponseEventsItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Conversion events.
 */
@ApiModel(description = "Conversion events.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEvents   {
  @JsonProperty("events")
  
  private List<ConversionApiResponseEventsItems> events = new ArrayList<>();

  @JsonProperty("num_events_processed")
  private Integer numEventsProcessed;

  @JsonProperty("num_events_received")
  private Integer numEventsReceived;

  public ConversionEvents events(List<ConversionApiResponseEventsItems> events) {
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
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
  public List<ConversionApiResponseEventsItems> getEvents() {
    return events;
  }

  public void setEvents(List<ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

  public ConversionEvents numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

  /**
   * Number of events that were successfully processed from the events.
   * @return numEventsProcessed
   */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "Number of events that were successfully processed from the events.")
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
   */
  @ApiModelProperty(example = "1", required = true, readOnly = true, value = "Total number of events received in the request.")
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


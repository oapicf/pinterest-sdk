/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsItems;



/**
 * Conversion events.
 */

@ApiModel(description = "Conversion events.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEvents   {
  
  private List<ConversionApiResponseEventsItems> events = new ArrayList<>();
  private Integer numEventsProcessed;
  private Integer numEventsReceived;

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   */
  public ConversionEvents events(List<ConversionApiResponseEventsItems> events) {
    this.events = events;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
  @JsonProperty("events")
  public List<ConversionApiResponseEventsItems> getEvents() {
    return events;
  }
  public void setEvents(List<ConversionApiResponseEventsItems> events) {
    this.events = events;
  }

  /**
   * Number of events that were successfully processed from the events.
   */
  public ConversionEvents numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Number of events that were successfully processed from the events.")
  @JsonProperty("num_events_processed")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  /**
   * Total number of events received in the request.
   */
  public ConversionEvents numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Total number of events received in the request.")
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


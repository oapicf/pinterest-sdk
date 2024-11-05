package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 **/
@ApiModel(description = "Schema describing the object in the response, which contains information about the events that were received and processed.")
@JsonTypeName("ConversionApiResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionApiResponse   {
  private Integer numEventsReceived;
  private Integer numEventsProcessed;
  private @Valid List<@Valid ConversionApiResponseEventsInner> events = new ArrayList<>();

  /**
   * Total number of events received in the request.
   **/
  public ConversionApiResponse numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Total number of events received in the request.")
  @JsonProperty("num_events_received")
  @NotNull public Integer getNumEventsReceived() {
    return numEventsReceived;
  }

  @JsonProperty("num_events_received")
  public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }

  /**
   * Number of events that were successfully processed from the events.
   **/
  public ConversionApiResponse numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of events that were successfully processed from the events.")
  @JsonProperty("num_events_processed")
  @NotNull public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  @JsonProperty("num_events_processed")
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
   **/
  public ConversionApiResponse events(List<@Valid ConversionApiResponseEventsInner> events) {
    this.events = events;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
  @JsonProperty("events")
  @NotNull @Valid public List<@Valid ConversionApiResponseEventsInner> getEvents() {
    return events;
  }

  @JsonProperty("events")
  public void setEvents(List<@Valid ConversionApiResponseEventsInner> events) {
    this.events = events;
  }

  public ConversionApiResponse addEventsItem(ConversionApiResponseEventsInner eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }

    this.events.add(eventsItem);
    return this;
  }

  public ConversionApiResponse removeEventsItem(ConversionApiResponseEventsInner eventsItem) {
    if (eventsItem != null && this.events != null) {
      this.events.remove(eventsItem);
    }

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
    ConversionApiResponse conversionApiResponse = (ConversionApiResponse) o;
    return Objects.equals(this.numEventsReceived, conversionApiResponse.numEventsReceived) &&
        Objects.equals(this.numEventsProcessed, conversionApiResponse.numEventsProcessed) &&
        Objects.equals(this.events, conversionApiResponse.events);
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


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConversionApiResponseEventsInner;
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
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */
@ApiModel(description = "Schema describing the object in the response, which contains information about the events that were received and processed.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionApiResponse   {
  @JsonProperty("num_events_received")
  private Integer numEventsReceived;

  @JsonProperty("num_events_processed")
  private Integer numEventsProcessed;

  @JsonProperty("events")
  
  private List<ConversionApiResponseEventsInner> events = new ArrayList<>();

  public ConversionApiResponse numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

   /**
   * Total number of events received in the request.
   * @return numEventsReceived
  **/
  @ApiModelProperty(required = true, value = "Total number of events received in the request.")
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }

  public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }

  public ConversionApiResponse numEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
    return this;
  }

   /**
   * Number of events that were successfully processed from the events.
   * @return numEventsProcessed
  **/
  @ApiModelProperty(required = true, value = "Number of events that were successfully processed from the events.")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  public ConversionApiResponse events(List<ConversionApiResponseEventsInner> events) {
    this.events = events;
    return this;
  }

  public ConversionApiResponse addEventsItem(ConversionApiResponseEventsInner eventsItem) {
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
  @ApiModelProperty(required = true, value = "Specific messages for each event received. The order will match the order in which the events were received in the request.")
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


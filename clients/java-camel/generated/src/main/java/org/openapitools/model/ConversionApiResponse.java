package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */

@Schema(name = "ConversionApiResponse", description = "Schema describing the object in the response, which contains information about the events that were received and processed.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionApiResponse {

  private Integer numEventsReceived;

  private Integer numEventsProcessed;

  @Valid
  private List<@Valid ConversionApiResponseEventsInner> events = new ArrayList<>();

  public ConversionApiResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionApiResponse(Integer numEventsReceived, Integer numEventsProcessed, List<@Valid ConversionApiResponseEventsInner> events) {
    this.numEventsReceived = numEventsReceived;
    this.numEventsProcessed = numEventsProcessed;
    this.events = events;
  }

  public ConversionApiResponse numEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
    return this;
  }

  /**
   * Total number of events received in the request.
   * @return numEventsReceived
   */
  @NotNull 
  @Schema(name = "num_events_received", description = "Total number of events received in the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_events_received")
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
   */
  @NotNull 
  @Schema(name = "num_events_processed", description = "Number of events that were successfully processed from the events.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_events_processed")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  public ConversionApiResponse events(List<@Valid ConversionApiResponseEventsInner> events) {
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
   */
  @NotNull @Valid 
  @Schema(name = "events", description = "Specific messages for each event received. The order will match the order in which the events were received in the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events")
  public List<@Valid ConversionApiResponseEventsInner> getEvents() {
    return events;
  }

  public void setEvents(List<@Valid ConversionApiResponseEventsInner> events) {
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


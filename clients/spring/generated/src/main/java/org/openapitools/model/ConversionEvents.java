package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionApiResponseEventsItems;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Conversion events.
 */

@Schema(name = "ConversionEvents", description = "Conversion events.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEvents {

  private List<@Valid ConversionApiResponseEventsItems> events = new ArrayList<>();

  private Integer numEventsProcessed;

  private Integer numEventsReceived;

  public ConversionEvents() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionEvents(List<@Valid ConversionApiResponseEventsItems> events, Integer numEventsProcessed, Integer numEventsReceived) {
    this.events = events;
    this.numEventsProcessed = numEventsProcessed;
    this.numEventsReceived = numEventsReceived;
  }

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
   */
  @Valid 
  @Schema(name = "events", accessMode = Schema.AccessMode.READ_ONLY, description = "Specific messages for each event received. The order will match the order in which the events were received in the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events")
  public List<@Valid ConversionApiResponseEventsItems> getEvents() {
    return events;
  }

  @JsonProperty("events")
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
   */
  
  @Schema(name = "num_events_processed", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "Number of events that were successfully processed from the events.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_events_processed")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }

  @JsonProperty("num_events_processed")
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
  
  @Schema(name = "num_events_received", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "Total number of events received in the request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("num_events_received")
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }

  @JsonProperty("num_events_received")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


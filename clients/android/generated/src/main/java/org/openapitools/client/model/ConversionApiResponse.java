/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ConversionApiResponseEventsInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 **/
@ApiModel(description = "Schema describing the object in the response, which contains information about the events that were received and processed.")
public class ConversionApiResponse {
  
  @SerializedName("num_events_received")
  private Integer numEventsReceived = null;
  @SerializedName("num_events_processed")
  private Integer numEventsProcessed = null;
  @SerializedName("events")
  private List<ConversionApiResponseEventsInner> events = null;

  /**
   * Total number of events received in the request.
   **/
  @ApiModelProperty(required = true, value = "Total number of events received in the request.")
  public Integer getNumEventsReceived() {
    return numEventsReceived;
  }
  public void setNumEventsReceived(Integer numEventsReceived) {
    this.numEventsReceived = numEventsReceived;
  }

  /**
   * Number of events that were successfully processed from the events.
   **/
  @ApiModelProperty(required = true, value = "Number of events that were successfully processed from the events.")
  public Integer getNumEventsProcessed() {
    return numEventsProcessed;
  }
  public void setNumEventsProcessed(Integer numEventsProcessed) {
    this.numEventsProcessed = numEventsProcessed;
  }

  /**
   * Specific messages for each event received. The order will match the order in which the events were received in the request.
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
    return (this.numEventsReceived == null ? conversionApiResponse.numEventsReceived == null : this.numEventsReceived.equals(conversionApiResponse.numEventsReceived)) &&
        (this.numEventsProcessed == null ? conversionApiResponse.numEventsProcessed == null : this.numEventsProcessed.equals(conversionApiResponse.numEventsProcessed)) &&
        (this.events == null ? conversionApiResponse.events == null : this.events.equals(conversionApiResponse.events));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.numEventsReceived == null ? 0: this.numEventsReceived.hashCode());
    result = 31 * result + (this.numEventsProcessed == null ? 0: this.numEventsProcessed.hashCode());
    result = 31 * result + (this.events == null ? 0: this.events.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionApiResponse {\n");
    
    sb.append("  numEventsReceived: ").append(numEventsReceived).append("\n");
    sb.append("  numEventsProcessed: ").append(numEventsProcessed).append("\n");
    sb.append("  events: ").append(events).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
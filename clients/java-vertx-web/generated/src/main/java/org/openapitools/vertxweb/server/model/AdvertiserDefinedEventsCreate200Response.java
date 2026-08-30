package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventProcessingRecord;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertiserDefinedEventsCreate200Response   {
  
  private List<AdvertiserDefinedEventProcessingRecord> items = new ArrayList<>();

  public AdvertiserDefinedEventsCreate200Response () {

  }

  public AdvertiserDefinedEventsCreate200Response (List<AdvertiserDefinedEventProcessingRecord> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<AdvertiserDefinedEventProcessingRecord> getItems() {
    return items;
  }
  public void setItems(List<AdvertiserDefinedEventProcessingRecord> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate200Response = (AdvertiserDefinedEventsCreate200Response) o;
    return Objects.equals(items, advertiserDefinedEventsCreate200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventsCreate200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

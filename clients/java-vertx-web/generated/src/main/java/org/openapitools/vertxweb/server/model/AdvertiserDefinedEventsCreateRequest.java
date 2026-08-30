package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvertiserDefinedEventInput;

/**
 * Request body for creating or updating advertiser defined events
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvertiserDefinedEventsCreateRequest   {
  
  private List<AdvertiserDefinedEventInput> items = new ArrayList<>();

  public AdvertiserDefinedEventsCreateRequest () {

  }

  public AdvertiserDefinedEventsCreateRequest (List<AdvertiserDefinedEventInput> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<AdvertiserDefinedEventInput> getItems() {
    return items;
  }
  public void setItems(List<AdvertiserDefinedEventInput> items) {
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
    AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = (AdvertiserDefinedEventsCreateRequest) o;
    return Objects.equals(items, advertiserDefinedEventsCreateRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventsCreateRequest {\n");
    
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

package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvertiserDefinedEvent;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdvertiserDefinedEventsResponse  {
  
  @ApiModelProperty(value = "")

  private List<AdvertiserDefinedEvent> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<AdvertiserDefinedEvent> getItems() {
    return items;
  }

  public void setItems(List<AdvertiserDefinedEvent> items) {
    this.items = items;
  }

  public AdvertiserDefinedEventsResponse items(List<AdvertiserDefinedEvent> items) {
    this.items = items;
    return this;
  }

  public AdvertiserDefinedEventsResponse addItemsItem(AdvertiserDefinedEvent itemsItem) {
    this.items.add(itemsItem);
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
    AdvertiserDefinedEventsResponse advertiserDefinedEventsResponse = (AdvertiserDefinedEventsResponse) o;
    return Objects.equals(this.items, advertiserDefinedEventsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


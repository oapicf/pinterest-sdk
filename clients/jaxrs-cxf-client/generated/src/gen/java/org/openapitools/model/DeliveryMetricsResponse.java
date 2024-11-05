package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeliveryMetricsResponseItemsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeliveryMetricsResponse  {
  
  @ApiModelProperty(value = "")
  private List<DeliveryMetricsResponseItemsInner> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<DeliveryMetricsResponseItemsInner> getItems() {
    return items;
  }

  public void setItems(List<DeliveryMetricsResponseItemsInner> items) {
    this.items = items;
  }

  public DeliveryMetricsResponse items(List<DeliveryMetricsResponseItemsInner> items) {
    this.items = items;
    return this;
  }

  public DeliveryMetricsResponse addItemsItem(DeliveryMetricsResponseItemsInner itemsItem) {
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
    DeliveryMetricsResponse deliveryMetricsResponse = (DeliveryMetricsResponse) o;
    return Objects.equals(this.items, deliveryMetricsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMetricsResponse {\n");
    
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


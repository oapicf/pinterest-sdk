package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.DeliveryMetricsResponseItemsItems;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeliveryMetricsGet200Response   {
  
  private List<DeliveryMetricsResponseItemsItems> items = new ArrayList<>();

  public DeliveryMetricsGet200Response () {

  }

  public DeliveryMetricsGet200Response (List<DeliveryMetricsResponseItemsItems> items) {
    this.items = items;
  }

    
  @JsonProperty("items")
  public List<DeliveryMetricsResponseItemsItems> getItems() {
    return items;
  }
  public void setItems(List<DeliveryMetricsResponseItemsItems> items) {
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
    DeliveryMetricsGet200Response deliveryMetricsGet200Response = (DeliveryMetricsGet200Response) o;
    return Objects.equals(items, deliveryMetricsGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMetricsGet200Response {\n");
    
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

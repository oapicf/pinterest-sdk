package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderLines;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderLinesArrayResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid OrderLines> items;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid OrderLines> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderLines> items) {
    this.items = items;
  }

  public OrderLinesArrayResponse items(List<@Valid OrderLines> items) {
    this.items = items;
    return this;
  }

  public OrderLinesArrayResponse addItemsItem(OrderLines itemsItem) {
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
    OrderLinesArrayResponse orderLinesArrayResponse = (OrderLinesArrayResponse) o;
    return Objects.equals(this.items, orderLinesArrayResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinesArrayResponse {\n");
    
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


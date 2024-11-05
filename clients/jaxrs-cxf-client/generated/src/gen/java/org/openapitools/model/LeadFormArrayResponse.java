package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LeadFormArrayResponseItemsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormArrayResponse  {
  
  @ApiModelProperty(value = "")
  private List<LeadFormArrayResponseItemsInner> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<LeadFormArrayResponseItemsInner> getItems() {
    return items;
  }

  public void setItems(List<LeadFormArrayResponseItemsInner> items) {
    this.items = items;
  }

  public LeadFormArrayResponse items(List<LeadFormArrayResponseItemsInner> items) {
    this.items = items;
    return this;
  }

  public LeadFormArrayResponse addItemsItem(LeadFormArrayResponseItemsInner itemsItem) {
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
    LeadFormArrayResponse leadFormArrayResponse = (LeadFormArrayResponse) o;
    return Objects.equals(this.items, leadFormArrayResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormArrayResponse {\n");
    
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


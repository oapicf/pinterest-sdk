package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupArrayResponseElement;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupArrayResponse  {
  
  @ApiModelProperty(value = "")
  private List<AdGroupArrayResponseElement> items;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<AdGroupArrayResponseElement> getItems() {
    return items;
  }

  public void setItems(List<AdGroupArrayResponseElement> items) {
    this.items = items;
  }

  public AdGroupArrayResponse items(List<AdGroupArrayResponseElement> items) {
    this.items = items;
    return this;
  }

  public AdGroupArrayResponse addItemsItem(AdGroupArrayResponseElement itemsItem) {
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
    AdGroupArrayResponse adGroupArrayResponse = (AdGroupArrayResponse) o;
    return Objects.equals(this.items, adGroupArrayResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupArrayResponse {\n");
    
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


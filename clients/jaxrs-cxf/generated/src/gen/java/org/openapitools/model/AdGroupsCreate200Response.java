package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupsCreate200ResponseItemsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupsCreate200Response  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private List<@Valid AdGroupsCreate200ResponseItemsInner> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
  public List<@Valid AdGroupsCreate200ResponseItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdGroupsCreate200ResponseItemsInner> items) {
    this.items = items;
  }

  public AdGroupsCreate200Response items(List<@Valid AdGroupsCreate200ResponseItemsInner> items) {
    this.items = items;
    return this;
  }

  public AdGroupsCreate200Response addItemsItem(AdGroupsCreate200ResponseItemsInner itemsItem) {
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
    AdGroupsCreate200Response adGroupsCreate200Response = (AdGroupsCreate200Response) o;
    return Objects.equals(this.items, adGroupsCreate200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsCreate200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


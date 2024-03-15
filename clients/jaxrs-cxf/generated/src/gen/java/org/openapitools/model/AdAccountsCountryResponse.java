package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdAccountsCountryResponseData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountsCountryResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AdAccountsCountryResponseData> items;
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid AdAccountsCountryResponseData> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdAccountsCountryResponseData> items) {
    this.items = items;
  }

  public AdAccountsCountryResponse items(List<@Valid AdAccountsCountryResponseData> items) {
    this.items = items;
    return this;
  }

  public AdAccountsCountryResponse addItemsItem(AdAccountsCountryResponseData itemsItem) {
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
    AdAccountsCountryResponse adAccountsCountryResponse = (AdAccountsCountryResponse) o;
    return Objects.equals(this.items, adAccountsCountryResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountsCountryResponse {\n");
    
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


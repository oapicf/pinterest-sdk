package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdAccountsCountry;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountCountriesGet200Response  {
  
  @ApiModelProperty(required = true, value = "")

  private List<AdAccountsCountry> items = new ArrayList<>();
 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<AdAccountsCountry> getItems() {
    return items;
  }

  public void setItems(List<AdAccountsCountry> items) {
    this.items = items;
  }

  public AdAccountCountriesGet200Response items(List<AdAccountsCountry> items) {
    this.items = items;
    return this;
  }

  public AdAccountCountriesGet200Response addItemsItem(AdAccountsCountry itemsItem) {
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
    AdAccountCountriesGet200Response adAccountCountriesGet200Response = (AdAccountCountriesGet200Response) o;
    return Objects.equals(this.items, adAccountCountriesGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountCountriesGet200Response {\n");
    
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


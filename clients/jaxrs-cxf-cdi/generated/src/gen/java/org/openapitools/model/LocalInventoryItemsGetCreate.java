package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemIdStoreCodePair;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create operation model.")
public class LocalInventoryItemsGetCreate   {
  
  private List<@Valid ItemIdStoreCodePair> itemFilters = new ArrayList<>();

  /**
   * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
   **/
  public LocalInventoryItemsGetCreate itemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.")
  @JsonProperty("item_filters")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemIdStoreCodePair> getItemFilters() {
    return itemFilters;
  }
  public void setItemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
  }

  public LocalInventoryItemsGetCreate addItemFiltersItem(ItemIdStoreCodePair itemFiltersItem) {
    if (this.itemFilters == null) {
      this.itemFilters = new ArrayList<>();
    }
    this.itemFilters.add(itemFiltersItem);
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
    LocalInventoryItemsGetCreate localInventoryItemsGetCreate = (LocalInventoryItemsGetCreate) o;
    return Objects.equals(this.itemFilters, localInventoryItemsGetCreate.itemFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemFilters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsGetCreate {\n");
    
    sb.append("    itemFilters: ").append(toIndentedString(itemFilters)).append("\n");
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


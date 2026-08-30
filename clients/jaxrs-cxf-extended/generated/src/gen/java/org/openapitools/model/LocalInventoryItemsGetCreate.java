package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemIdStoreCodePair;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LocalInventoryItemsGetCreate  {
  
 /**
  * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
  */
  @ApiModelProperty(required = true, value = "Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.")
  @Valid
  private List<@Valid ItemIdStoreCodePair> itemFilters = new ArrayList<>();
 /**
  * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
  * @return itemFilters
  */
  @JsonProperty("item_filters")
  @NotNull
 @Size(min=1,max=1000)  public List<@Valid ItemIdStoreCodePair> getItemFilters() {
    return itemFilters;
  }

  /**
   * Sets the <code>itemFilters</code> property.
   */
 public void setItemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
  }

  /**
   * Sets the <code>itemFilters</code> property.
   */
  public LocalInventoryItemsGetCreate itemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
    return this;
  }

  /**
   * Adds a new item to the <code>itemFilters</code> list.
   */
  public LocalInventoryItemsGetCreate addItemFiltersItem(ItemIdStoreCodePair itemFiltersItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


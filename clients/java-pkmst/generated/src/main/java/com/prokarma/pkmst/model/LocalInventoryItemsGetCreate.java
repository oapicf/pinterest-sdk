package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ItemIdStoreCodePair;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsGetCreate   {
  @JsonProperty("item_filters")
  
  private List<ItemIdStoreCodePair> itemFilters = new ArrayList<>();

  public LocalInventoryItemsGetCreate itemFilters(List<ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
    return this;
  }

  public LocalInventoryItemsGetCreate addItemFiltersItem(ItemIdStoreCodePair itemFiltersItem) {
    if (this.itemFilters == null) {
      this.itemFilters = new ArrayList<>();
    }
    this.itemFilters.add(itemFiltersItem);
    return this;
  }

  /**
   * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
   * @return itemFilters
   */
  @ApiModelProperty(required = true, value = "Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.")
  public List<ItemIdStoreCodePair> getItemFilters() {
    return itemFilters;
  }

  public void setItemFilters(List<ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
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


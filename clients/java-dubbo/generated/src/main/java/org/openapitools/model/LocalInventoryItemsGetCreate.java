package org.openapitools.model;

import org.openapitools.model.ItemIdStoreCodePair;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class LocalInventoryItemsGetCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
   */
  @JsonProperty("item_filters")
  private List<ItemIdStoreCodePair> itemFilters = new ArrayList<>();

  /**
   * Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
   * @return itemFilters
   */
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

package apimodels;

import apimodels.ItemIdStoreCodePair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LocalInventoryItemsGetCreate   {
  @JsonProperty("item_filters")
  @NotNull
@Size(min=1,max=1000)
@Valid

  private List<@Valid ItemIdStoreCodePair> itemFilters = new ArrayList<>();

  public LocalInventoryItemsGetCreate itemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
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
  **/
  public List<@Valid ItemIdStoreCodePair> getItemFilters() {
    return itemFilters;
  }

  public void setItemFilters(List<@Valid ItemIdStoreCodePair> itemFilters) {
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
    return Objects.equals(itemFilters, localInventoryItemsGetCreate.itemFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemFilters);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


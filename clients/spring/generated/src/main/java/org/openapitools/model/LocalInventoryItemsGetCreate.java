package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ItemIdStoreCodePair;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "LocalInventoryItemsGetCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsGetCreate {

  private List<@Valid ItemIdStoreCodePair> itemFilters = new ArrayList<>();

  public LocalInventoryItemsGetCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalInventoryItemsGetCreate(List<@Valid ItemIdStoreCodePair> itemFilters) {
    this.itemFilters = itemFilters;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 1000) 
  @Schema(name = "item_filters", description = "Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_filters")
  public List<@Valid ItemIdStoreCodePair> getItemFilters() {
    return itemFilters;
  }

  @JsonProperty("item_filters")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


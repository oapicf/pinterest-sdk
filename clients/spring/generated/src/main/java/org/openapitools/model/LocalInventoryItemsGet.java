package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocalInventoryItemResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Model for getting local inventory items
 */

@Schema(name = "LocalInventoryItemsGet", description = "Model for getting local inventory items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LocalInventoryItemsGet {

  private List<@Valid LocalInventoryItemResponse> items = new ArrayList<>();

  public LocalInventoryItemsGet() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocalInventoryItemsGet(List<@Valid LocalInventoryItemResponse> items) {
    this.items = items;
  }

  public LocalInventoryItemsGet items(List<@Valid LocalInventoryItemResponse> items) {
    this.items = items;
    return this;
  }

  public LocalInventoryItemsGet addItemsItem(LocalInventoryItemResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of local inventory items
   * @return items
   */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of local inventory items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid LocalInventoryItemResponse> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid LocalInventoryItemResponse> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalInventoryItemsGet localInventoryItemsGet = (LocalInventoryItemsGet) o;
    return Objects.equals(this.items, localInventoryItemsGet.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalInventoryItemsGet {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


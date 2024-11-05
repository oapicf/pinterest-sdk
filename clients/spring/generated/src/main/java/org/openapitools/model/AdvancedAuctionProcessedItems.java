package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionProcessedItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response object containing the results of an operation on an item bid option
 */

@Schema(name = "AdvancedAuctionProcessedItems", description = "Response object containing the results of an operation on an item bid option")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionProcessedItems {

  private String catalogId;

  @Valid
  private List<@Valid AdvancedAuctionProcessedItem> items = new ArrayList<>();

  public AdvancedAuctionProcessedItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to all items
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to all items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionProcessedItems items(List<@Valid AdvancedAuctionProcessedItem> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionProcessedItems addItemsItem(AdvancedAuctionProcessedItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of advanced auction processed items
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "Array of advanced auction processed items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid AdvancedAuctionProcessedItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdvancedAuctionProcessedItem> items) {
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
    AdvancedAuctionProcessedItems advancedAuctionProcessedItems = (AdvancedAuctionProcessedItems) o;
    return Objects.equals(this.catalogId, advancedAuctionProcessedItems.catalogId) &&
        Objects.equals(this.items, advancedAuctionProcessedItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionProcessedItems {\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


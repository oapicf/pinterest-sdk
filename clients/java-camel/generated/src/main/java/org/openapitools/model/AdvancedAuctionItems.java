package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response object containing item bid options
 */

@Schema(name = "AdvancedAuctionItems", description = "Response object containing item bid options")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItems {

  private String catalogId;

  @Valid
  private List<AdvancedAuctionItem> items = new ArrayList<>();

  public AdvancedAuctionItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Response object of item bid options
   * @return catalogId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Response object of item bid options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItems items(List<AdvancedAuctionItem> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItems addItemsItem(AdvancedAuctionItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with item bid options
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "Array with item bid options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<AdvancedAuctionItem> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItem> items) {
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
    AdvancedAuctionItems advancedAuctionItems = (AdvancedAuctionItems) o;
    return Objects.equals(this.catalogId, advancedAuctionItems.catalogId) &&
        Objects.equals(this.items, advancedAuctionItems.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItems {\n");
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


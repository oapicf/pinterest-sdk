package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */

@Schema(name = "AdvancedAuctionItemsSubmitRequest", description = "Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsSubmitRequest {

  private String catalogId;

  @Valid
  private List<@Valid AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsSubmitRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvancedAuctionItemsSubmitRequest(String catalogId, List<@Valid AdvancedAuctionItemsSubmitRecord> items) {
    this.catalogId = catalogId;
    this.items = items;
  }

  public AdvancedAuctionItemsSubmitRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to all items
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to all items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItemsSubmitRequest items(List<@Valid AdvancedAuctionItemsSubmitRecord> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsSubmitRequest addItemsItem(AdvancedAuctionItemsSubmitRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array of item bid option operations
   * @return items
   */
  @NotNull @Valid @Size(min = 1, max = 10000) 
  @Schema(name = "items", description = "Array of item bid option operations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid AdvancedAuctionItemsSubmitRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdvancedAuctionItemsSubmitRecord> items) {
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
    AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = (AdvancedAuctionItemsSubmitRequest) o;
    return Objects.equals(this.catalogId, advancedAuctionItemsSubmitRequest.catalogId) &&
        Objects.equals(this.items, advancedAuctionItemsSubmitRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsSubmitRequest {\n");
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


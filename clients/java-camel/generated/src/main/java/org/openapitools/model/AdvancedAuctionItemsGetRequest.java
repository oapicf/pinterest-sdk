package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsGetRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Request object used to get bid options values for a batch of retail catalog items
 */

@Schema(name = "AdvancedAuctionItemsGetRequest", description = "Request object used to get bid options values for a batch of retail catalog items")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsGetRequest {

  private String catalogId;

  @Valid
  private List<AdvancedAuctionItemsGetRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsGetRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvancedAuctionItemsGetRequest(String catalogId, List<AdvancedAuctionItemsGetRecord> items) {
    this.catalogId = catalogId;
    this.items = items;
  }

  public AdvancedAuctionItemsGetRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the retail item
   * @return catalogId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_id", example = "2680059592705", description = "Catalog id pertaining to the retail item", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItemsGetRequest items(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsGetRequest addItemsItem(AdvancedAuctionItemsGetRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * A list of retail catalog items to fetch bid options for
   * @return items
   */
  @NotNull @Valid @Size(min = 1, max = 10000) 
  @Schema(name = "items", description = "A list of retail catalog items to fetch bid options for", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<AdvancedAuctionItemsGetRecord> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItemsGetRecord> items) {
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
    AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest = (AdvancedAuctionItemsGetRequest) o;
    return Objects.equals(this.catalogId, advancedAuctionItemsGetRequest.catalogId) &&
        Objects.equals(this.items, advancedAuctionItemsGetRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionItemsGetRequest {\n");
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


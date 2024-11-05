package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsGetRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Request object used to get bid options values for a batch of retail catalog items
 **/
@ApiModel(description = "Request object used to get bid options values for a batch of retail catalog items")
@JsonTypeName("AdvancedAuctionItemsGetRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsGetRequest   {
  private String catalogId;
  private @Valid List<AdvancedAuctionItemsGetRecord> items = new ArrayList<>();

  /**
   * Catalog id pertaining to the retail item
   **/
  public AdvancedAuctionItemsGetRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail item")
  @JsonProperty("catalog_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * A list of retail catalog items to fetch bid options for
   **/
  public AdvancedAuctionItemsGetRequest items(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of retail catalog items to fetch bid options for")
  @JsonProperty("items")
  @NotNull @Valid  @Size(min=1,max=10000)public List<@Valid AdvancedAuctionItemsGetRecord> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
  }

  public AdvancedAuctionItemsGetRequest addItemsItem(AdvancedAuctionItemsGetRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public AdvancedAuctionItemsGetRequest removeItemsItem(AdvancedAuctionItemsGetRecord itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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


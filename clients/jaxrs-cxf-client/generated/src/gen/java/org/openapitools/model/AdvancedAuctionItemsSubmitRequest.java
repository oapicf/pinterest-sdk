package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 **/
@ApiModel(description="Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items")

public class AdvancedAuctionItemsSubmitRequest  {
  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to all items")
 /**
   * Catalog id pertaining to all items
  **/
  private String catalogId;

  @ApiModelProperty(required = true, value = "Array of item bid option operations")
 /**
   * Array of item bid option operations
  **/
  private List<AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();
 /**
   * Catalog id pertaining to all items
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItemsSubmitRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Array of item bid option operations
   * @return items
  **/
  @JsonProperty("items")
  public List<AdvancedAuctionItemsSubmitRecord> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItemsSubmitRecord> items) {
    this.items = items;
  }

  public AdvancedAuctionItemsSubmitRequest items(List<AdvancedAuctionItemsSubmitRecord> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsSubmitRequest addItemsItem(AdvancedAuctionItemsSubmitRecord itemsItem) {
    this.items.add(itemsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


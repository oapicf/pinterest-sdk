package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionProcessedItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Response object containing the results of an operation on an item bid option
 **/
@ApiModel(description="Response object containing the results of an operation on an item bid option")

public class AdvancedAuctionProcessedItems  {
  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to all items")
 /**
   * Catalog id pertaining to all items
  **/
  private String catalogId;

  @ApiModelProperty(value = "Array of advanced auction processed items")
 /**
   * Array of advanced auction processed items
  **/
  private List<AdvancedAuctionProcessedItem> items = new ArrayList<>();
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

  public AdvancedAuctionProcessedItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Array of advanced auction processed items
   * @return items
  **/
  @JsonProperty("items")
  public List<AdvancedAuctionProcessedItem> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionProcessedItem> items) {
    this.items = items;
  }

  public AdvancedAuctionProcessedItems items(List<AdvancedAuctionProcessedItem> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionProcessedItems addItemsItem(AdvancedAuctionProcessedItem itemsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


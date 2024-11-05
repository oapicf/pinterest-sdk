package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdvancedAuctionProcessedItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Response object containing the results of an operation on an item bid option
 */
@ApiModel(description = "Response object containing the results of an operation on an item bid option")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionProcessedItems   {
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("items")
  
  private List<AdvancedAuctionProcessedItem> items = null;

  public AdvancedAuctionProcessedItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to all items
   * @return catalogId
   */
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to all items")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionProcessedItems items(List<AdvancedAuctionProcessedItem> items) {
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
  @ApiModelProperty(value = "Array of advanced auction processed items")
  public List<AdvancedAuctionProcessedItem> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionProcessedItem> items) {
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


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionProcessedItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Response object containing the results of an operation on an item bid option
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Response object containing the results of an operation on an item bid option")
public class AdvancedAuctionProcessedItems   {
  
  private String catalogId;

  private List<@Valid AdvancedAuctionProcessedItem> items = new ArrayList<>();

  /**
   * Catalog id pertaining to all items
   **/
  public AdvancedAuctionProcessedItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Catalog id pertaining to all items")
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  /**
   * Array of advanced auction processed items
   **/
  public AdvancedAuctionProcessedItems items(List<@Valid AdvancedAuctionProcessedItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Array of advanced auction processed items")
  @JsonProperty("items")
  public List<@Valid AdvancedAuctionProcessedItem> getItems() {
    return items;
  }
  public void setItems(List<@Valid AdvancedAuctionProcessedItem> items) {
    this.items = items;
  }

  public AdvancedAuctionProcessedItems addItemsItem(AdvancedAuctionProcessedItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


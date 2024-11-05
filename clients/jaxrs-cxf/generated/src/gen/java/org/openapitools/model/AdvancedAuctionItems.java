package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Response object containing item bid options
 **/
@ApiModel(description="Response object containing item bid options")

public class AdvancedAuctionItems  {
  
  @ApiModelProperty(example = "2680059592705", value = "Response object of item bid options")
 /**
   * Response object of item bid options
  **/
  private String catalogId;

  @ApiModelProperty(value = "Array with item bid options")
  @Valid
 /**
   * Array with item bid options
  **/
  private List<AdvancedAuctionItem> items = new ArrayList<>();
 /**
   * Response object of item bid options
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * Array with item bid options
   * @return items
  **/
  @JsonProperty("items")
  public List<AdvancedAuctionItem> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItem> items) {
    this.items = items;
  }

  public AdvancedAuctionItems items(List<AdvancedAuctionItem> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItems addItemsItem(AdvancedAuctionItem itemsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


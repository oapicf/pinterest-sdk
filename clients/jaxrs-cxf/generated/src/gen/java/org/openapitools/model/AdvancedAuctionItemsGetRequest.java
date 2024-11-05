package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsGetRecord;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request object used to get bid options values for a batch of retail catalog items
 **/
@ApiModel(description="Request object used to get bid options values for a batch of retail catalog items")

public class AdvancedAuctionItemsGetRequest  {
  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail item")
 /**
   * Catalog id pertaining to the retail item
  **/
  private String catalogId;

  @ApiModelProperty(required = true, value = "A list of retail catalog items to fetch bid options for")
  @Valid
 /**
   * A list of retail catalog items to fetch bid options for
  **/
  private List<AdvancedAuctionItemsGetRecord> items = new ArrayList<>();
 /**
   * Catalog id pertaining to the retail item
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItemsGetRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

 /**
   * A list of retail catalog items to fetch bid options for
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
 @Size(min=1,max=10000)  public List<AdvancedAuctionItemsGetRecord> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
  }

  public AdvancedAuctionItemsGetRequest items(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsGetRequest addItemsItem(AdvancedAuctionItemsGetRecord itemsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


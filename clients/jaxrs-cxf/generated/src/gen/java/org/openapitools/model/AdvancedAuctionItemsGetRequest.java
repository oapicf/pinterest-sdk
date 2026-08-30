package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionKey;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
@ApiModel(description="Request object used to get bid options values for a batch of retail catalog items")

public class AdvancedAuctionItemsGetRequest  {
  
 /**
  * Catalog id pertaining to the retail item
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to the retail item")

  private String catalogId;

 /**
  * A list of retail catalog items to fetch bid options for
  */
  @ApiModelProperty(required = true, value = "A list of retail catalog items to fetch bid options for")

  @Valid

  private List<@Valid AdvancedAuctionKey> items = new ArrayList<>();
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
 @Size(min=1,max=10000)  public List<@Valid AdvancedAuctionKey> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdvancedAuctionKey> items) {
    this.items = items;
  }

  public AdvancedAuctionItemsGetRequest items(List<@Valid AdvancedAuctionKey> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsGetRequest addItemsItem(AdvancedAuctionKey itemsItem) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


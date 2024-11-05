package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
@ApiModel(description = "Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsSubmitRequest   {
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("items")
  private List<@Valid AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsSubmitRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to all items
   * @return catalogId
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to all items")
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
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of item bid option operations
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Array of item bid option operations")
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


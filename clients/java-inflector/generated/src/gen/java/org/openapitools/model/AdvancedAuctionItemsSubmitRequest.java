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
 **/

@ApiModel(description = "Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItemsSubmitRequest   {
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("items")
  private List<AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  /**
   * Catalog id pertaining to all items
   **/
  public AdvancedAuctionItemsSubmitRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog id pertaining to all items")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Array of item bid option operations
   **/
  public AdvancedAuctionItemsSubmitRequest items(List<AdvancedAuctionItemsSubmitRecord> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of item bid option operations")
  @JsonProperty("items")
  public List<AdvancedAuctionItemsSubmitRecord> getItems() {
    return items;
  }
  public void setItems(List<AdvancedAuctionItemsSubmitRecord> items) {
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
    return Objects.equals(catalogId, advancedAuctionItemsSubmitRequest.catalogId) &&
        Objects.equals(items, advancedAuctionItemsSubmitRequest.items);
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


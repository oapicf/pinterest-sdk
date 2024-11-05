package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvancedAuctionItem;



/**
 * Response object containing item bid options
 **/

@ApiModel(description = "Response object containing item bid options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionItems   {
  @JsonProperty("catalog_id")
  private String catalogId;

  @JsonProperty("items")
  private List<AdvancedAuctionItem> items = null;

  /**
   * Response object of item bid options
   **/
  public AdvancedAuctionItems catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "Response object of item bid options")
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Array with item bid options
   **/
  public AdvancedAuctionItems items(List<AdvancedAuctionItem> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Array with item bid options")
  @JsonProperty("items")
  public List<AdvancedAuctionItem> getItems() {
    return items;
  }
  public void setItems(List<AdvancedAuctionItem> items) {
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
    AdvancedAuctionItems advancedAuctionItems = (AdvancedAuctionItems) o;
    return Objects.equals(catalogId, advancedAuctionItems.catalogId) &&
        Objects.equals(items, advancedAuctionItems.items);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


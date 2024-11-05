package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvancedAuctionProcessedItem;

/**
 * Response object containing the results of an operation on an item bid option
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionProcessedItems   {
  
  private String catalogId;
  private List<AdvancedAuctionProcessedItem> items = new ArrayList<>();

  public AdvancedAuctionProcessedItems () {

  }

  public AdvancedAuctionProcessedItems (String catalogId, List<AdvancedAuctionProcessedItem> items) {
    this.catalogId = catalogId;
    this.items = items;
  }

    
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

    
  @JsonProperty("items")
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
    return Objects.equals(catalogId, advancedAuctionProcessedItems.catalogId) &&
        Objects.equals(items, advancedAuctionProcessedItems.items);
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

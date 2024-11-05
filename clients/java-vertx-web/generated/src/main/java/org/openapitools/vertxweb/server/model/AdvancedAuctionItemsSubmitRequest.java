package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdvancedAuctionItemsSubmitRecord;

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdvancedAuctionItemsSubmitRequest   {
  
  private String catalogId;
  private List<AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsSubmitRequest () {

  }

  public AdvancedAuctionItemsSubmitRequest (String catalogId, List<AdvancedAuctionItemsSubmitRecord> items) {
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

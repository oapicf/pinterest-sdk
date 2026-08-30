package org.openapitools.model;

import org.openapitools.model.AdvancedAuctionItemsSubmitRecord;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
public class AdvancedAuctionItemsSubmitRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog id pertaining to all items
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   * Array of item bid option operations
   */
  @JsonProperty("items")
  private List<AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  /**
   * Catalog id pertaining to all items
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * Array of item bid option operations
   * @return items
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

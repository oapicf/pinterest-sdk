package org.openapitools.model;

import org.openapitools.model.AdvancedAuctionKey;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
public class AdvancedAuctionItemsGetRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Catalog id pertaining to the retail item
   */
  @JsonProperty("catalog_id")
  private String catalogId;

  /**
   * A list of retail catalog items to fetch bid options for
   */
  @JsonProperty("items")
  private List<AdvancedAuctionKey> items = new ArrayList<>();

  /**
   * Catalog id pertaining to the retail item
   * @return catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   * A list of retail catalog items to fetch bid options for
   * @return items
   */
  public List<AdvancedAuctionKey> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionKey> items) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

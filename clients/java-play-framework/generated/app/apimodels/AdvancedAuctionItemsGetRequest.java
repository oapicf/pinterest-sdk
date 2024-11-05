package apimodels;

import apimodels.AdvancedAuctionItemsGetRecord;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Request object used to get bid options values for a batch of retail catalog items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionItemsGetRequest   {
  @JsonProperty("catalog_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=10000)
@Valid

  private List<AdvancedAuctionItemsGetRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsGetRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the retail item
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public AdvancedAuctionItemsGetRequest items(List<AdvancedAuctionItemsGetRecord> items) {
    this.items = items;
    return this;
  }

  public AdvancedAuctionItemsGetRequest addItemsItem(AdvancedAuctionItemsGetRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of retail catalog items to fetch bid options for
   * @return items
  **/
  public List<AdvancedAuctionItemsGetRecord> getItems() {
    return items;
  }

  public void setItems(List<AdvancedAuctionItemsGetRecord> items) {
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
    return Objects.equals(catalogId, advancedAuctionItemsGetRequest.catalogId) &&
        Objects.equals(items, advancedAuctionItemsGetRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


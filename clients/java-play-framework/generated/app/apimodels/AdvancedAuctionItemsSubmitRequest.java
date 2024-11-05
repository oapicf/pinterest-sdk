package apimodels;

import apimodels.AdvancedAuctionItemsSubmitRecord;
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
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdvancedAuctionItemsSubmitRequest   {
  @JsonProperty("catalog_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("items")
  @NotNull
@Size(min=1,max=10000)
@Valid

  private List<@Valid AdvancedAuctionItemsSubmitRecord> items = new ArrayList<>();

  public AdvancedAuctionItemsSubmitRequest catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to all items
   * @return catalogId
  **/
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
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of item bid option operations
   * @return items
  **/
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
    return Objects.equals(catalogId, advancedAuctionItemsSubmitRequest.catalogId) &&
        Objects.equals(items, advancedAuctionItemsSubmitRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


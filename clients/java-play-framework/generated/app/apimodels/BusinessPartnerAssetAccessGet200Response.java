package apimodels;

import apimodels.GetPartnerAssetsResponse;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BusinessPartnerAssetAccessGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessPartnerAssetAccessGet200Response   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid GetPartnerAssetsResponse> items = new ArrayList<>();

  @JsonProperty("bookmark")
  
  private String bookmark;

  public BusinessPartnerAssetAccessGet200Response items(List<@Valid GetPartnerAssetsResponse> items) {
    this.items = items;
    return this;
  }

  public BusinessPartnerAssetAccessGet200Response addItemsItem(GetPartnerAssetsResponse itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List assets on which you granted access to your partner or assets on which your partner has granted you access.
   * @return items
  **/
  public List<@Valid GetPartnerAssetsResponse> getItems() {
    return items;
  }

  public void setItems(List<@Valid GetPartnerAssetsResponse> items) {
    this.items = items;
  }

  public BusinessPartnerAssetAccessGet200Response bookmark(String bookmark) {
    this.bookmark = bookmark;
    return this;
  }

   /**
   * Get bookmark
   * @return bookmark
  **/
  public String getBookmark() {
    return bookmark;
  }

  public void setBookmark(String bookmark) {
    this.bookmark = bookmark;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet200Response = (BusinessPartnerAssetAccessGet200Response) o;
    return Objects.equals(items, businessPartnerAssetAccessGet200Response.items) &&
        Objects.equals(bookmark, businessPartnerAssetAccessGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPartnerAssetAccessGet200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
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


package apimodels;

import apimodels.AssetIdPermissions;
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
 * BusinessMemberAssetsGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessMemberAssetsGet200Response   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid AssetIdPermissions> items = new ArrayList<>();

  @JsonProperty("bookmark")
  
  private String bookmark;

  public BusinessMemberAssetsGet200Response items(List<@Valid AssetIdPermissions> items) {
    this.items = items;
    return this;
  }

  public BusinessMemberAssetsGet200Response addItemsItem(AssetIdPermissions itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List asset permissions the given member was granted.
   * @return items
  **/
  public List<@Valid AssetIdPermissions> getItems() {
    return items;
  }

  public void setItems(List<@Valid AssetIdPermissions> items) {
    this.items = items;
  }

  public BusinessMemberAssetsGet200Response bookmark(String bookmark) {
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
    BusinessMemberAssetsGet200Response businessMemberAssetsGet200Response = (BusinessMemberAssetsGet200Response) o;
    return Objects.equals(items, businessMemberAssetsGet200Response.items) &&
        Objects.equals(bookmark, businessMemberAssetsGet200Response.bookmark);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bookmark);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsGet200Response {\n");
    
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

